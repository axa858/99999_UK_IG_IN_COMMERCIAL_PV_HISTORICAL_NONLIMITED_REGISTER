package com.ignite.launcher;

import com.equifax.fabric.commons.storage.util.StorageUtil;
import com.google.api.services.bigquery.model.TableRow;
import com.ignite.options.CustomPipelineOptions;
import com.ignite.transformation.PiiDecryptUtil;
import com.ignite.transformation.SecurityUtil;
import com.ignite.transformation.TableRowToGenericRecordConverterFn;
import com.ignite.transformation.TransformationBQ;
import com.ignite.util.BigQueryUtil;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.coders.AvroCoder;
import org.apache.beam.sdk.extensions.avro.io.AvroIO;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;

import java.io.IOException;

public class Executor {
    public static void main(String[] args) throws IOException{

        PipelineOptionsFactory.register(CustomPipelineOptions.class);

        String sourceSchemaStrICM = StorageUtil.readFileAsString("gs://df-dna-plt-poc-data-uk-int/Nonlimited_Register/d118_business_w_protectioninfo.avsc");
        Schema sourceSchemaICM = new Schema.Parser().parse(sourceSchemaStrICM);

        String destinationSchemaStr = StorageUtil.readFileAsString("gs://df-dna-plt-poc-data-uk-int/Nonlimited_Register/nonlimitedRegister.avsc");
        Schema destinationSchema = new Schema.Parser().parse(destinationSchemaStr);


        CustomPipelineOptions options = PipelineOptionsFactory.fromArgs(args).withValidation()
                .as(CustomPipelineOptions.class);

        Pipeline pipeline = Pipeline.create(options);

        PCollection<TableRow> bqTableRowPCollectionICUI = BigQueryUtil.getTableRow(pipeline, options.getProject(),
                "commercial_credit_risk_analyst_uk_int", "d118_business_uk_int",
                "2024-07-01");

        PCollection<GenericRecord> destinationBqRecordPCollection  = bqTableRowPCollectionICUI
                .apply("CONVERT TABLEROW TO GENERIC RECORD",
                        ParDo.of(new TableRowToGenericRecordConverterFn(sourceSchemaICM)))
                .setCoder(org.apache.beam.sdk.coders.AvroCoder.of(sourceSchemaICM));

        PCollection<GenericRecord> nonlimitedregPIIDecryption = destinationBqRecordPCollection
                .apply("DECRYPT PII FIELDS", ParDo.of(new PiiDecryptUtil(options.getBqPiiDekPath(),
                        options.getBqPiiGroupId())))
                .setCoder(AvroCoder.of(sourceSchemaICM));

        PCollection<GenericRecord> genericRecordPCollectionEncrypt = SecurityUtil
                .performPiiEncryption(options, nonlimitedregPIIDecryption, pipeline, sourceSchemaICM);



        genericRecordPCollectionEncrypt.apply("Mapping",ParDo.of(new TransformationBQ()))
                .setCoder(org.apache.beam.sdk.coders.AvroCoder.of(destinationSchema))
                .apply("WRITING SUMMARY AVRO FILE",
                        AvroIO.writeGenericRecords(destinationSchema)
                                .to("gs://df-dna-plt-poc-data-uk-int/Nonlimited_Register/").withSuffix(".avro"));

        pipeline.run().waitUntilFinish();
    }
}
