package com.ignite.transformation;

import com.google.api.services.bigquery.model.TableRow;
import org.apache.beam.sdk.schemas.Schema;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.values.Row;
/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/

public class ConverterTableRowToRowStringFieldsFn extends DoFn<TableRow, Row> {
//    private static final Logger LOGGER = LoggerFactory.getLogger(ConverterTableRowToRowStringFieldsFn.class);
    private Schema schema;

    /**
     * constructor with schema
     *
     * @param schema Schema object
     */
    public ConverterTableRowToRowStringFieldsFn(Schema schema) {
        this.schema = schema;
    }

    /**
     * Process the elements
     * Iterate over each row and
     * Convert into IDWDataObject
     *
     * @param context ProcessContext
     */
    @ProcessElement
    public void processElement(ProcessContext context) {
        Row.Builder row = Row.withSchema(schema);
        TableRow tableRow = context.element();
        for (String name : schema.getFieldNames()) {

            if(!name.equalsIgnoreCase("protectionInfo")) {
                row.addValue(tableRow.get(name) != null ? tableRow.get(name).toString() : null);
            } else {
                row.addValue(null);
            }
        }
        context.output(row.build());
    }


}
