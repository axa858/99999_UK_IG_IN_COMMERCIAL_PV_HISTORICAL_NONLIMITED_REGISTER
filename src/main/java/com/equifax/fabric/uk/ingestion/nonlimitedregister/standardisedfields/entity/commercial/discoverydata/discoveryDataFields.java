/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class discoveryDataFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"discoveryDataFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata\",\"fields\":[{\"name\":\"DISCOVERY_CLIENT_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Client Number for INSIGHT_ACCOUNT and CCDS_ACCOUNT asset\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_ACCOUNT_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Account Number for INSIGHT_ACCOUNT \",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_FACILITY_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Facility Number for CCDS_ACCOUNT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_DEFENDENT_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"Defendent ID for COURT_JUDGMENT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_DRC_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"DRC_ID for NONLIMITED_REGISTER\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_URN\",\"type\":[\"null\",\"string\"],\"doc\":\"Unique reference number of COMPANY_CIFAS\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_CASE_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"Case ID of COMPANY_CIFAS\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_CLN_BUSINESS_NAME\",\"type\":[\"null\",\"string\"],\"doc\":\"Cleansed business name \",\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Supplied Client Number for INSIGHT_ACCOUNT and CCDS_ACCOUNT asset */
  @Deprecated public java.lang.CharSequence DISCOVERY_CLIENT_NUMBER;
  /** Supplied Account Number for INSIGHT_ACCOUNT  */
  @Deprecated public java.lang.CharSequence DISCOVERY_ACCOUNT_NUMBER;
  /** Supplied Facility Number for CCDS_ACCOUNT */
  @Deprecated public java.lang.CharSequence DISCOVERY_FACILITY_NUMBER;
  /** Defendent ID for COURT_JUDGMENT */
  @Deprecated public java.lang.CharSequence DISCOVERY_DEFENDENT_ID;
  /** DRC_ID for NONLIMITED_REGISTER */
  @Deprecated public java.lang.CharSequence DISCOVERY_DRC_ID;
  /** Unique reference number of COMPANY_CIFAS */
  @Deprecated public java.lang.CharSequence DISCOVERY_URN;
  /** Case ID of COMPANY_CIFAS */
  @Deprecated public java.lang.CharSequence DISCOVERY_CASE_ID;
  /** Cleansed business name  */
  @Deprecated public java.lang.CharSequence DISCOVERY_CLN_BUSINESS_NAME;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public discoveryDataFields() {}

  /**
   * All-args constructor.
   */
  public discoveryDataFields(java.lang.CharSequence DISCOVERY_CLIENT_NUMBER, java.lang.CharSequence DISCOVERY_ACCOUNT_NUMBER, java.lang.CharSequence DISCOVERY_FACILITY_NUMBER, java.lang.CharSequence DISCOVERY_DEFENDENT_ID, java.lang.CharSequence DISCOVERY_DRC_ID, java.lang.CharSequence DISCOVERY_URN, java.lang.CharSequence DISCOVERY_CASE_ID, java.lang.CharSequence DISCOVERY_CLN_BUSINESS_NAME) {
    this.DISCOVERY_CLIENT_NUMBER = DISCOVERY_CLIENT_NUMBER;
    this.DISCOVERY_ACCOUNT_NUMBER = DISCOVERY_ACCOUNT_NUMBER;
    this.DISCOVERY_FACILITY_NUMBER = DISCOVERY_FACILITY_NUMBER;
    this.DISCOVERY_DEFENDENT_ID = DISCOVERY_DEFENDENT_ID;
    this.DISCOVERY_DRC_ID = DISCOVERY_DRC_ID;
    this.DISCOVERY_URN = DISCOVERY_URN;
    this.DISCOVERY_CASE_ID = DISCOVERY_CASE_ID;
    this.DISCOVERY_CLN_BUSINESS_NAME = DISCOVERY_CLN_BUSINESS_NAME;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return DISCOVERY_CLIENT_NUMBER;
    case 1: return DISCOVERY_ACCOUNT_NUMBER;
    case 2: return DISCOVERY_FACILITY_NUMBER;
    case 3: return DISCOVERY_DEFENDENT_ID;
    case 4: return DISCOVERY_DRC_ID;
    case 5: return DISCOVERY_URN;
    case 6: return DISCOVERY_CASE_ID;
    case 7: return DISCOVERY_CLN_BUSINESS_NAME;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: DISCOVERY_CLIENT_NUMBER = (java.lang.CharSequence)value$; break;
    case 1: DISCOVERY_ACCOUNT_NUMBER = (java.lang.CharSequence)value$; break;
    case 2: DISCOVERY_FACILITY_NUMBER = (java.lang.CharSequence)value$; break;
    case 3: DISCOVERY_DEFENDENT_ID = (java.lang.CharSequence)value$; break;
    case 4: DISCOVERY_DRC_ID = (java.lang.CharSequence)value$; break;
    case 5: DISCOVERY_URN = (java.lang.CharSequence)value$; break;
    case 6: DISCOVERY_CASE_ID = (java.lang.CharSequence)value$; break;
    case 7: DISCOVERY_CLN_BUSINESS_NAME = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'DISCOVERY_CLIENT_NUMBER' field.
   * Supplied Client Number for INSIGHT_ACCOUNT and CCDS_ACCOUNT asset   */
  public java.lang.CharSequence getDISCOVERYCLIENTNUMBER() {
    return DISCOVERY_CLIENT_NUMBER;
  }

  /**
   * Sets the value of the 'DISCOVERY_CLIENT_NUMBER' field.
   * Supplied Client Number for INSIGHT_ACCOUNT and CCDS_ACCOUNT asset   * @param value the value to set.
   */
  public void setDISCOVERYCLIENTNUMBER(java.lang.CharSequence value) {
    this.DISCOVERY_CLIENT_NUMBER = value;
  }

  /**
   * Gets the value of the 'DISCOVERY_ACCOUNT_NUMBER' field.
   * Supplied Account Number for INSIGHT_ACCOUNT    */
  public java.lang.CharSequence getDISCOVERYACCOUNTNUMBER() {
    return DISCOVERY_ACCOUNT_NUMBER;
  }

  /**
   * Sets the value of the 'DISCOVERY_ACCOUNT_NUMBER' field.
   * Supplied Account Number for INSIGHT_ACCOUNT    * @param value the value to set.
   */
  public void setDISCOVERYACCOUNTNUMBER(java.lang.CharSequence value) {
    this.DISCOVERY_ACCOUNT_NUMBER = value;
  }

  /**
   * Gets the value of the 'DISCOVERY_FACILITY_NUMBER' field.
   * Supplied Facility Number for CCDS_ACCOUNT   */
  public java.lang.CharSequence getDISCOVERYFACILITYNUMBER() {
    return DISCOVERY_FACILITY_NUMBER;
  }

  /**
   * Sets the value of the 'DISCOVERY_FACILITY_NUMBER' field.
   * Supplied Facility Number for CCDS_ACCOUNT   * @param value the value to set.
   */
  public void setDISCOVERYFACILITYNUMBER(java.lang.CharSequence value) {
    this.DISCOVERY_FACILITY_NUMBER = value;
  }

  /**
   * Gets the value of the 'DISCOVERY_DEFENDENT_ID' field.
   * Defendent ID for COURT_JUDGMENT   */
  public java.lang.CharSequence getDISCOVERYDEFENDENTID() {
    return DISCOVERY_DEFENDENT_ID;
  }

  /**
   * Sets the value of the 'DISCOVERY_DEFENDENT_ID' field.
   * Defendent ID for COURT_JUDGMENT   * @param value the value to set.
   */
  public void setDISCOVERYDEFENDENTID(java.lang.CharSequence value) {
    this.DISCOVERY_DEFENDENT_ID = value;
  }

  /**
   * Gets the value of the 'DISCOVERY_DRC_ID' field.
   * DRC_ID for NONLIMITED_REGISTER   */
  public java.lang.CharSequence getDISCOVERYDRCID() {
    return DISCOVERY_DRC_ID;
  }

  /**
   * Sets the value of the 'DISCOVERY_DRC_ID' field.
   * DRC_ID for NONLIMITED_REGISTER   * @param value the value to set.
   */
  public void setDISCOVERYDRCID(java.lang.CharSequence value) {
    this.DISCOVERY_DRC_ID = value;
  }

  /**
   * Gets the value of the 'DISCOVERY_URN' field.
   * Unique reference number of COMPANY_CIFAS   */
  public java.lang.CharSequence getDISCOVERYURN() {
    return DISCOVERY_URN;
  }

  /**
   * Sets the value of the 'DISCOVERY_URN' field.
   * Unique reference number of COMPANY_CIFAS   * @param value the value to set.
   */
  public void setDISCOVERYURN(java.lang.CharSequence value) {
    this.DISCOVERY_URN = value;
  }

  /**
   * Gets the value of the 'DISCOVERY_CASE_ID' field.
   * Case ID of COMPANY_CIFAS   */
  public java.lang.CharSequence getDISCOVERYCASEID() {
    return DISCOVERY_CASE_ID;
  }

  /**
   * Sets the value of the 'DISCOVERY_CASE_ID' field.
   * Case ID of COMPANY_CIFAS   * @param value the value to set.
   */
  public void setDISCOVERYCASEID(java.lang.CharSequence value) {
    this.DISCOVERY_CASE_ID = value;
  }

  /**
   * Gets the value of the 'DISCOVERY_CLN_BUSINESS_NAME' field.
   * Cleansed business name    */
  public java.lang.CharSequence getDISCOVERYCLNBUSINESSNAME() {
    return DISCOVERY_CLN_BUSINESS_NAME;
  }

  /**
   * Sets the value of the 'DISCOVERY_CLN_BUSINESS_NAME' field.
   * Cleansed business name    * @param value the value to set.
   */
  public void setDISCOVERYCLNBUSINESSNAME(java.lang.CharSequence value) {
    this.DISCOVERY_CLN_BUSINESS_NAME = value;
  }

  /** Creates a new discoveryDataFields RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder();
  }
  
  /** Creates a new discoveryDataFields RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder other) {
    return new com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder(other);
  }
  
  /** Creates a new discoveryDataFields RecordBuilder by copying an existing discoveryDataFields instance */
  public static com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields other) {
    return new com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder(other);
  }
  
  /**
   * RecordBuilder for discoveryDataFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<discoveryDataFields>
    implements org.apache.avro.data.RecordBuilder<discoveryDataFields> {

    private java.lang.CharSequence DISCOVERY_CLIENT_NUMBER;
    private java.lang.CharSequence DISCOVERY_ACCOUNT_NUMBER;
    private java.lang.CharSequence DISCOVERY_FACILITY_NUMBER;
    private java.lang.CharSequence DISCOVERY_DEFENDENT_ID;
    private java.lang.CharSequence DISCOVERY_DRC_ID;
    private java.lang.CharSequence DISCOVERY_URN;
    private java.lang.CharSequence DISCOVERY_CASE_ID;
    private java.lang.CharSequence DISCOVERY_CLN_BUSINESS_NAME;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.DISCOVERY_CLIENT_NUMBER)) {
        this.DISCOVERY_CLIENT_NUMBER = data().deepCopy(fields()[0].schema(), other.DISCOVERY_CLIENT_NUMBER);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.DISCOVERY_ACCOUNT_NUMBER)) {
        this.DISCOVERY_ACCOUNT_NUMBER = data().deepCopy(fields()[1].schema(), other.DISCOVERY_ACCOUNT_NUMBER);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.DISCOVERY_FACILITY_NUMBER)) {
        this.DISCOVERY_FACILITY_NUMBER = data().deepCopy(fields()[2].schema(), other.DISCOVERY_FACILITY_NUMBER);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.DISCOVERY_DEFENDENT_ID)) {
        this.DISCOVERY_DEFENDENT_ID = data().deepCopy(fields()[3].schema(), other.DISCOVERY_DEFENDENT_ID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.DISCOVERY_DRC_ID)) {
        this.DISCOVERY_DRC_ID = data().deepCopy(fields()[4].schema(), other.DISCOVERY_DRC_ID);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.DISCOVERY_URN)) {
        this.DISCOVERY_URN = data().deepCopy(fields()[5].schema(), other.DISCOVERY_URN);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.DISCOVERY_CASE_ID)) {
        this.DISCOVERY_CASE_ID = data().deepCopy(fields()[6].schema(), other.DISCOVERY_CASE_ID);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.DISCOVERY_CLN_BUSINESS_NAME)) {
        this.DISCOVERY_CLN_BUSINESS_NAME = data().deepCopy(fields()[7].schema(), other.DISCOVERY_CLN_BUSINESS_NAME);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing discoveryDataFields instance */
    private Builder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields other) {
            super(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.SCHEMA$);
      if (isValidValue(fields()[0], other.DISCOVERY_CLIENT_NUMBER)) {
        this.DISCOVERY_CLIENT_NUMBER = data().deepCopy(fields()[0].schema(), other.DISCOVERY_CLIENT_NUMBER);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.DISCOVERY_ACCOUNT_NUMBER)) {
        this.DISCOVERY_ACCOUNT_NUMBER = data().deepCopy(fields()[1].schema(), other.DISCOVERY_ACCOUNT_NUMBER);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.DISCOVERY_FACILITY_NUMBER)) {
        this.DISCOVERY_FACILITY_NUMBER = data().deepCopy(fields()[2].schema(), other.DISCOVERY_FACILITY_NUMBER);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.DISCOVERY_DEFENDENT_ID)) {
        this.DISCOVERY_DEFENDENT_ID = data().deepCopy(fields()[3].schema(), other.DISCOVERY_DEFENDENT_ID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.DISCOVERY_DRC_ID)) {
        this.DISCOVERY_DRC_ID = data().deepCopy(fields()[4].schema(), other.DISCOVERY_DRC_ID);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.DISCOVERY_URN)) {
        this.DISCOVERY_URN = data().deepCopy(fields()[5].schema(), other.DISCOVERY_URN);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.DISCOVERY_CASE_ID)) {
        this.DISCOVERY_CASE_ID = data().deepCopy(fields()[6].schema(), other.DISCOVERY_CASE_ID);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.DISCOVERY_CLN_BUSINESS_NAME)) {
        this.DISCOVERY_CLN_BUSINESS_NAME = data().deepCopy(fields()[7].schema(), other.DISCOVERY_CLN_BUSINESS_NAME);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'DISCOVERY_CLIENT_NUMBER' field */
    public java.lang.CharSequence getDISCOVERYCLIENTNUMBER() {
      return DISCOVERY_CLIENT_NUMBER;
    }
    
    /** Sets the value of the 'DISCOVERY_CLIENT_NUMBER' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder setDISCOVERYCLIENTNUMBER(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.DISCOVERY_CLIENT_NUMBER = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'DISCOVERY_CLIENT_NUMBER' field has been set */
    public boolean hasDISCOVERYCLIENTNUMBER() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'DISCOVERY_CLIENT_NUMBER' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder clearDISCOVERYCLIENTNUMBER() {
      DISCOVERY_CLIENT_NUMBER = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'DISCOVERY_ACCOUNT_NUMBER' field */
    public java.lang.CharSequence getDISCOVERYACCOUNTNUMBER() {
      return DISCOVERY_ACCOUNT_NUMBER;
    }
    
    /** Sets the value of the 'DISCOVERY_ACCOUNT_NUMBER' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder setDISCOVERYACCOUNTNUMBER(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.DISCOVERY_ACCOUNT_NUMBER = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'DISCOVERY_ACCOUNT_NUMBER' field has been set */
    public boolean hasDISCOVERYACCOUNTNUMBER() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'DISCOVERY_ACCOUNT_NUMBER' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder clearDISCOVERYACCOUNTNUMBER() {
      DISCOVERY_ACCOUNT_NUMBER = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'DISCOVERY_FACILITY_NUMBER' field */
    public java.lang.CharSequence getDISCOVERYFACILITYNUMBER() {
      return DISCOVERY_FACILITY_NUMBER;
    }
    
    /** Sets the value of the 'DISCOVERY_FACILITY_NUMBER' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder setDISCOVERYFACILITYNUMBER(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.DISCOVERY_FACILITY_NUMBER = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'DISCOVERY_FACILITY_NUMBER' field has been set */
    public boolean hasDISCOVERYFACILITYNUMBER() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'DISCOVERY_FACILITY_NUMBER' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder clearDISCOVERYFACILITYNUMBER() {
      DISCOVERY_FACILITY_NUMBER = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'DISCOVERY_DEFENDENT_ID' field */
    public java.lang.CharSequence getDISCOVERYDEFENDENTID() {
      return DISCOVERY_DEFENDENT_ID;
    }
    
    /** Sets the value of the 'DISCOVERY_DEFENDENT_ID' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder setDISCOVERYDEFENDENTID(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.DISCOVERY_DEFENDENT_ID = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'DISCOVERY_DEFENDENT_ID' field has been set */
    public boolean hasDISCOVERYDEFENDENTID() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'DISCOVERY_DEFENDENT_ID' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder clearDISCOVERYDEFENDENTID() {
      DISCOVERY_DEFENDENT_ID = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'DISCOVERY_DRC_ID' field */
    public java.lang.CharSequence getDISCOVERYDRCID() {
      return DISCOVERY_DRC_ID;
    }
    
    /** Sets the value of the 'DISCOVERY_DRC_ID' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder setDISCOVERYDRCID(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.DISCOVERY_DRC_ID = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'DISCOVERY_DRC_ID' field has been set */
    public boolean hasDISCOVERYDRCID() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'DISCOVERY_DRC_ID' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder clearDISCOVERYDRCID() {
      DISCOVERY_DRC_ID = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'DISCOVERY_URN' field */
    public java.lang.CharSequence getDISCOVERYURN() {
      return DISCOVERY_URN;
    }
    
    /** Sets the value of the 'DISCOVERY_URN' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder setDISCOVERYURN(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.DISCOVERY_URN = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'DISCOVERY_URN' field has been set */
    public boolean hasDISCOVERYURN() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'DISCOVERY_URN' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder clearDISCOVERYURN() {
      DISCOVERY_URN = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'DISCOVERY_CASE_ID' field */
    public java.lang.CharSequence getDISCOVERYCASEID() {
      return DISCOVERY_CASE_ID;
    }
    
    /** Sets the value of the 'DISCOVERY_CASE_ID' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder setDISCOVERYCASEID(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.DISCOVERY_CASE_ID = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'DISCOVERY_CASE_ID' field has been set */
    public boolean hasDISCOVERYCASEID() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'DISCOVERY_CASE_ID' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder clearDISCOVERYCASEID() {
      DISCOVERY_CASE_ID = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'DISCOVERY_CLN_BUSINESS_NAME' field */
    public java.lang.CharSequence getDISCOVERYCLNBUSINESSNAME() {
      return DISCOVERY_CLN_BUSINESS_NAME;
    }
    
    /** Sets the value of the 'DISCOVERY_CLN_BUSINESS_NAME' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder setDISCOVERYCLNBUSINESSNAME(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.DISCOVERY_CLN_BUSINESS_NAME = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'DISCOVERY_CLN_BUSINESS_NAME' field has been set */
    public boolean hasDISCOVERYCLNBUSINESSNAME() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'DISCOVERY_CLN_BUSINESS_NAME' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields.Builder clearDISCOVERYCLNBUSINESSNAME() {
      DISCOVERY_CLN_BUSINESS_NAME = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public discoveryDataFields build() {
      try {
        discoveryDataFields record = new discoveryDataFields();
        record.DISCOVERY_CLIENT_NUMBER = fieldSetFlags()[0] ? this.DISCOVERY_CLIENT_NUMBER : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.DISCOVERY_ACCOUNT_NUMBER = fieldSetFlags()[1] ? this.DISCOVERY_ACCOUNT_NUMBER : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.DISCOVERY_FACILITY_NUMBER = fieldSetFlags()[2] ? this.DISCOVERY_FACILITY_NUMBER : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.DISCOVERY_DEFENDENT_ID = fieldSetFlags()[3] ? this.DISCOVERY_DEFENDENT_ID : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.DISCOVERY_DRC_ID = fieldSetFlags()[4] ? this.DISCOVERY_DRC_ID : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.DISCOVERY_URN = fieldSetFlags()[5] ? this.DISCOVERY_URN : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.DISCOVERY_CASE_ID = fieldSetFlags()[6] ? this.DISCOVERY_CASE_ID : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.DISCOVERY_CLN_BUSINESS_NAME = fieldSetFlags()[7] ? this.DISCOVERY_CLN_BUSINESS_NAME : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
