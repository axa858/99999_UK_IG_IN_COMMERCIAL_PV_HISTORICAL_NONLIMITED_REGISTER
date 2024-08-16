/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class entityFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"entityFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity\",\"fields\":[{\"name\":\"commercial\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"commercialFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial\",\"fields\":[{\"name\":\"legacyIds\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"legacyIdFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids\",\"fields\":[{\"name\":\"LEGACY_ID_COMPANY_REGISTERED_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Company Number\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"identifiers\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"identifierFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers\",\"fields\":[{\"name\":\"NAME_BUSINESS_COMPANY_TYPE\",\"type\":[\"null\",\"string\"],\"doc\":\"Type of company - L for Limited\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_BUSINESS_VAT\",\"type\":[\"null\",\"string\"],\"doc\":\"VAT number field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_BUSINESS_EMAIL\",\"type\":[\"null\",\"string\"],\"doc\":\"EMAIL ID field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_DISSOLVED_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"Dissolution Date field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_INCORPORATION_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"Date of incorporation in CCYYMMDD format\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_UPDATE_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"This is load date and will be a system date \",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_DATA_SOURCE\",\"type\":[\"null\",\"string\"],\"doc\":\"Indicates source of data\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"website\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Supplied Websites\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"phones\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Supplied Phone number\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"names\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Standardised Company Names as per Keying & Linking inputs\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"addresses\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Standardised postcode as per Keying & Linking inputs\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"discoveryData\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"discoveryDataFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata\",\"fields\":[{\"name\":\"DISCOVERY_CLIENT_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Client Number for INSIGHT_ACCOUNT and CCDS_ACCOUNT asset\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_ACCOUNT_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Account Number for INSIGHT_ACCOUNT \",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_FACILITY_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Facility Number for CCDS_ACCOUNT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_DEFENDENT_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"Defendent ID for COURT_JUDGMENT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_DRC_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"DRC_ID for NONLIMITED_REGISTER\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_URN\",\"type\":[\"null\",\"string\"],\"doc\":\"Unique reference number of COMPANY_CIFAS\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_CASE_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"Case ID of COMPANY_CIFAS\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_CLN_BUSINESS_NAME\",\"type\":[\"null\",\"string\"],\"doc\":\"Cleansed business name \",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields commercial;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public entityFields() {}

  /**
   * All-args constructor.
   */
  public entityFields(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields commercial) {
    this.commercial = commercial;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return commercial;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: commercial = (com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'commercial' field.
   */
  public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields getCommercial() {
    return commercial;
  }

  /**
   * Sets the value of the 'commercial' field.
   * @param value the value to set.
   */
  public void setCommercial(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields value) {
    this.commercial = value;
  }

  /** Creates a new entityFields RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.Builder();
  }
  
  /** Creates a new entityFields RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.Builder other) {
    return new com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.Builder(other);
  }
  
  /** Creates a new entityFields RecordBuilder by copying an existing entityFields instance */
  public static com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields other) {
    return new com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.Builder(other);
  }
  
  /**
   * RecordBuilder for entityFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<entityFields>
    implements org.apache.avro.data.RecordBuilder<entityFields> {

    private com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields commercial;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.commercial)) {
        this.commercial = data().deepCopy(fields()[0].schema(), other.commercial);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing entityFields instance */
    private Builder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields other) {
            super(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.SCHEMA$);
      if (isValidValue(fields()[0], other.commercial)) {
        this.commercial = data().deepCopy(fields()[0].schema(), other.commercial);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'commercial' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields getCommercial() {
      return commercial;
    }
    
    /** Sets the value of the 'commercial' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.Builder setCommercial(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields value) {
      validate(fields()[0], value);
      this.commercial = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'commercial' field has been set */
    public boolean hasCommercial() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'commercial' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.entityFields.Builder clearCommercial() {
      commercial = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public entityFields build() {
      try {
        entityFields record = new entityFields();
        record.commercial = fieldSetFlags()[0] ? this.commercial : (com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}