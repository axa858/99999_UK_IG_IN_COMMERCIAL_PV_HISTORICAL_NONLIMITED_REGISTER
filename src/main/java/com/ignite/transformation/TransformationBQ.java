package com.ignite.transformation;


import com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields;
import com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields;
import com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers.identifierFields;
import com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids.legacyIdFields;
import com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields;
import com.equifax.fabric.uk.latest.purposingheader.additionalInfo;
import com.equifax.fabric.uk.nonlimitedregister.History;
import com.equifax.fabric.uk.nonlimitedregister.Latest;
import com.equifax.fabric.uk.nonlimitedregister.NonlimitedRegister;
import com.equifax.fabric.uk.nonlimitedregister.bnumber.BNumber;
import com.equifax.fabric.uk.nonlimitedregister.rawfields.RawFields;
import com.equifax.fabric.uk.nonlimitedregister.standardisedfields.StandardisedFields;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.transforms.DoFn;
/*import org.apache.beam.sdk.transforms.Latest;*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.equifax.fabric.uk.history.purposingheader.purposingheader;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TransformationBQ extends DoFn<GenericRecord, GenericRecord> {
    private static final Logger LOGGER = LoggerFactory.getLogger(TransformationBQ.class);

    @ProcessElement
    public void processElement(@Element GenericRecord genericRecord, ProcessContext processContext) {
        LOGGER.error("genericRecord "+ genericRecord);
        LOGGER.error("processContext "+ processContext);


        NonlimitedRegister nonlimitedregister = new NonlimitedRegister();

        List<Latest> latest = new ArrayList<>();
        latest.add(getLatest(genericRecord));
        nonlimitedregister.setLatest(latest);

        List<History> history = new ArrayList<>();
        history.add(getHistory(genericRecord));
        nonlimitedregister.setHistory(history);

        /*List<BNumber> bnumbers =new ArrayList<>();
        bnumbers.add(getBnumber(genericRecord));
        nonlimitedregister.setBNUMBER(bnumbers);*/

        processContext.output(nonlimitedregister);

    }
    public BNumber getBnumber(GenericRecord genericRecord) {
        BNumber bnumbers = new BNumber();
        bnumbers.setValue((genericRecord.get("company") != null) ? genericRecord.get("company").toString() : "NA");
        return bnumbers;
    }


    public Latest getLatest(GenericRecord genericRecord) {
        Latest latest = new Latest();
        LOGGER.error("getLatest Fun >>>>> " + genericRecord);
        latest.setPurposingHeader(getPurposingHeader(genericRecord));
        latest.setRawfields(getRawFields(genericRecord));
        latest.setStandardised(getStandardisedFields(genericRecord));

        return latest;


    }
    public History getHistory(GenericRecord genericRecord) {
        History history = new History();
        history.setPurposingHeader(gethistoryPurposingHeader(genericRecord));
        history.setRawfields(getHistoryRawFields(genericRecord));
//        history.setPurposingHeader("NA");
//        history.setRawfields(null);
//        history.setStandardised(null);
        return history;
    }



    public RawFields getRawFields(GenericRecord genericRecord) {
        RawFields rawFields = new RawFields();
        rawFields.setRECORDTYPE("NA");
        rawFields.setDRCID("NA");
        rawFields.setTHOMSONID("NA");
        rawFields.setUPDATEINDICATOR((genericRecord.get("updateind") != null) ? genericRecord.get("updateind").toString() : "NA");
        rawFields.setBUSINESSNAME((genericRecord.get("name") != null) ? genericRecord.get("name").toString() : "NA");
        rawFields.setADDRESS((genericRecord.get("addressraw") != null) ? genericRecord.get("addressraw").toString() : "NA");
        rawFields.setLOCALITY((genericRecord.get("locality") != null) ? genericRecord.get("locality").toString() : "NA");
        rawFields.setTOWN((genericRecord.get("town") != null) ? genericRecord.get("town").toString() : "NA");
        rawFields.setCOUNTY((genericRecord.get("county") != null) ? genericRecord.get("county").toString() : "NA");
        rawFields.setPOSTCODE((genericRecord.get("postcode") != null) ? genericRecord.get("postcode").toString() : "NA");
        rawFields.setLOCATIONTYPE((genericRecord.get("loctype") != null) ? genericRecord.get("loctype").toString() : "NA");
        rawFields.setEASYSECTOR((genericRecord.get("sector") != null) ? genericRecord.get("sector").toString() : "NA");
        rawFields.setEASYSECTORDESCRIPTION((genericRecord.get("sectordesc") != null) ? genericRecord.get("sectordesc").toString() : "NA");
        rawFields.setTELEPHONENO((genericRecord.get("telno") != null) ? genericRecord.get("telno").toString() : "NA");
        rawFields.setMAINNUMBERINDICATOR((genericRecord.get("telnomain") != null) ? genericRecord.get("telnomain").toString() : "NA");
        rawFields.setWEBADDRESS((genericRecord.get("webaddr") != null) ? genericRecord.get("webaddr").toString() : "NA");
        rawFields.setCREATEDDATE((genericRecord.get("suppliercreated") != null) ? genericRecord.get("suppliercreated").toString() : "NA");
        rawFields.setESTABLISHEDMONTH((genericRecord.get("estmonth") != null) ? genericRecord.get("estmonth").toString() : "NA");
        rawFields.setEMPLOYEES((genericRecord.get("employees") != null) ? genericRecord.get("employees").toString() : "NA");
        rawFields.setMODELLEDTURNOVER((genericRecord.get("modturnover") != null) ? genericRecord.get("modturnover").toString() : "NA");
        rawFields.setFAX((genericRecord.get("fax") != null) ? genericRecord.get("fax").toString() : "NA");
        rawFields.setPREMISESTYPECODE((genericRecord.get("premisetype") != null) ? genericRecord.get("premisetype").toString() : "NA");
        rawFields.setSENIORDECISIONMAKERTITLE((genericRecord.get("sdmtitle") != null) ? genericRecord.get("sdmtitle").toString() : "NA");
        rawFields.setSENIORDECISIONMAKERFIRSTNAME((genericRecord.get("sdmfname") != null) ? genericRecord.get("sdmfname").toString() : "NA");
        rawFields.setSENIORDECISIONMAKERSURNAME((genericRecord.get("sdmsname") != null) ? genericRecord.get("sdmsname").toString() : "NA");
        rawFields.setSENIORDECISIONMAKERPOSITION((genericRecord.get("sdmposn") != null) ? genericRecord.get("sdmposn").toString() : "NA");
        rawFields.setTELEPHONEPREFERENCEIND((genericRecord.get("tpspref") != null) ? genericRecord.get("tpspref").toString() : "NA");
        rawFields.setFAXPREFERENCEIND((genericRecord.get("faxpref") != null) ? genericRecord.get("faxpref").toString() : "NA");
        rawFields.setSIC03((genericRecord.get("sic03") != null) ? genericRecord.get("sic03").toString() : "NA");
        rawFields.setSIC07((genericRecord.get("sic07") != null) ? genericRecord.get("sic07").toString() : "NA");
        rawFields.setLASTSCREENINGRESULTDATE((genericRecord.get("lastscreendate") != null) ? genericRecord.get("lastscreendate").toString() : "NA");
        rawFields.setLASTSCREENINGRESULTCODE((genericRecord.get("lastscreencode") != null) ? genericRecord.get("lastscreencode").toString() : "NA");
        rawFields.setCONTACTTITLE("NA");
        rawFields.setCONTACTFIRSTNAME("NA");

        rawFields.setCONTACTSURNAME("NA");
        rawFields.setCONTACTPOSITION("NA");
        rawFields.setSENIORDECISIONMAKERIND("NA");
        rawFields.setFINANCEIND("NA");
        rawFields.setBUYERIND("NA");
        rawFields.setITIND("NA");
        rawFields.setHRIND("NA");
        rawFields.setMARKETINGIND("NA");
        rawFields.setFLEETIND("NA");
        rawFields.setTELEPHONYIND("NA");
        rawFields.setMANUFACTURINGIND("NA");
        rawFields.setSALESIND("NA");
        rawFields.setNONEXECIND("NA");
        rawFields.setMATCHEDCOMPANYNUMBER((genericRecord.get("company") != null) ? genericRecord.get("company").toString() : "NA");
        rawFields.setFILENAME((genericRecord.get("fileno") != null) ? genericRecord.get("fileno").toString() : "NA");
        rawFields.setBUSINESSINDEXID((genericRecord.get("drcid") != null) ? genericRecord.get("drcid").toString() : "NA");

        return rawFields;

    }

    public StandardisedFields getStandardisedFields(GenericRecord genericRecord) {
        StandardisedFields standardisedFields = new StandardisedFields();
        standardisedFields.setBUSINESSINDEXID((genericRecord.get("drcid") != null) ? genericRecord.get("drcid").toString() : "NA");
        standardisedFields.setBUSINESSNAME((genericRecord.get("name") != null) ? genericRecord.get("name").toString() : "NA");
        standardisedFields.setPROCESSINGDATE((genericRecord.get("loaddate") != null) ? genericRecord.get("loaddate").toString() : "NA");
        standardisedFields.setFORMATOFSUPPLY("NA");
        standardisedFields.setMIGRATIONFLAG("NA");

        return standardisedFields;

    }
    public entityFields getEntityFields(GenericRecord genericRecord) {
        entityFields entityFields = new entityFields();
        entityFields.setCommercial(getCommercialFields(genericRecord));
        return entityFields;
    }

    public commercialFields getCommercialFields(GenericRecord genericRecord) {
        commercialFields commercialFields = new commercialFields();
        commercialFields.setDiscoveryData(getDiscoveryDataFields(genericRecord));
        commercialFields.setIdentifiers(getIdentifierFields(genericRecord));
        commercialFields.setLegacyIds(getLegacyIdFields(genericRecord));
        commercialFields.setWebsite(Map.of("NA","NA"));
        commercialFields.setPhones(Map.of("NA","NA"));
        commercialFields.setAddresses(Map.of("NA","NA"));
        commercialFields.setNames(Map.of("NA","NA"));

        return commercialFields;
    }


    public discoveryDataFields getDiscoveryDataFields(GenericRecord genericRecord) {
        discoveryDataFields discoveryDataFields = new discoveryDataFields();
        discoveryDataFields.setDISCOVERYCLIENTNUMBER("NA");
        discoveryDataFields.setDISCOVERYACCOUNTNUMBER("NA");
        discoveryDataFields.setDISCOVERYFACILITYNUMBER("NA");
        discoveryDataFields.setDISCOVERYDEFENDENTID("NA");
        discoveryDataFields.setDISCOVERYDRCID("NA");
        discoveryDataFields.setDISCOVERYURN("NA");
        discoveryDataFields.setDISCOVERYCASEID("NA");
        discoveryDataFields.setDISCOVERYCLNBUSINESSNAME("NA");
        return discoveryDataFields;
    }
    public identifierFields getIdentifierFields(GenericRecord genericRecord) {
        identifierFields identifierFields = new identifierFields();
        identifierFields.setNAMEBUSINESSCOMPANYTYPE("NA");
        identifierFields.setIDENTIFIERBUSINESSVAT("NA");
        identifierFields.setIDENTIFIERBUSINESSEMAIL("NA");
        identifierFields.setIDENTIFIERDISSOLVEDDATE("NA");
        identifierFields.setIDENTIFIERINCORPORATIONDATE("NA");
        identifierFields.setIDENTIFIERUPDATEDATE("NA");
        identifierFields.setIDENTIFIERDATASOURCE("NA");
        return identifierFields;

    }


    public legacyIdFields getLegacyIdFields(GenericRecord genericRecord) {
        legacyIdFields legacyIdFields = new legacyIdFields();
        legacyIdFields.setLEGACYIDCOMPANYREGISTEREDNUMBER("NA");
        return legacyIdFields;
    }

    public com.equifax.fabric.uk.nonlimitedregister.history.RawFields getHistoryRawFields(GenericRecord genericRecord) {
        com.equifax.fabric.uk.nonlimitedregister.history.RawFields rawFields = new com.equifax.fabric.uk.nonlimitedregister.history.RawFields();
        rawFields.setBUSINESSNAME((genericRecord.get("name") != null) ? genericRecord.get("name").toString() : "NA");
        rawFields.setADDRESS((genericRecord.get("addressraw") != null) ? genericRecord.get("addressraw").toString() : "NA");
        rawFields.setLOCALITY((genericRecord.get("locality") != null) ? genericRecord.get("locality").toString() : "NA");
        rawFields.setTOWN((genericRecord.get("town") != null) ? genericRecord.get("town").toString() : "NA");
        rawFields.setCOUNTY((genericRecord.get("county") != null) ? genericRecord.get("county").toString() : "NA");
        rawFields.setPOSTCODE((genericRecord.get("postcode") != null) ? genericRecord.get("postcode").toString() : "NA");
        return rawFields;
    }
    public com.equifax.fabric.uk.latest.purposingheader.purposingheader getPurposingHeader(GenericRecord genericRecord) {
        com.equifax.fabric.uk.latest.purposingheader.purposingheader purposingHeader = new com.equifax.fabric.uk.latest.purposingheader.purposingheader();
        List<com.equifax.fabric.uk.latest.purposingheader.additionalInfo> additionalInfo = new ArrayList<>();
        purposingHeader.setAdditionalInfo(additionalInfo);
        purposingHeader.setDateReported(null);
        purposingHeader.setMatchKey(null);
        purposingHeader.setRecordUuid(null);
        return purposingHeader;
    }
    public additionalInfo getAdditionalInfo(GenericRecord genericRecord) {
        additionalInfo additionalInfo = new additionalInfo();
        additionalInfo.setKey("NA");
        additionalInfo.setValue("NA");
        return additionalInfo;
    }

    public purposingheader gethistoryPurposingHeader(GenericRecord genericRecord) {
        purposingheader PurposingHeader = new purposingheader();
        List<com.equifax.fabric.uk.history.purposingheader.additionalInfo> additionalInfo = new ArrayList<>();
        PurposingHeader.setAdditionalInfo(additionalInfo);
        PurposingHeader.setDateReported(null);
        PurposingHeader.setMatchKey(null);
        PurposingHeader.setRecordUuid(null);
        return PurposingHeader;
    }
    public additionalInfo gethistoryAdditionalInfo(GenericRecord genericRecord) {
        additionalInfo additionalInfo = new additionalInfo();
        additionalInfo.setKey("NA");
        additionalInfo.setValue("NA");
        return additionalInfo;
    }
    public static class IgniteTransformationException extends RuntimeException {
        public IgniteTransformationException(String message, Throwable cause) {
            super(message, cause);
        }
    }

}