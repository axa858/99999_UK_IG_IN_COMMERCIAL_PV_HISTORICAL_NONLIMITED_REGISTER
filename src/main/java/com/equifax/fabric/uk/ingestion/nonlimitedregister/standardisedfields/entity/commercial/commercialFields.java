/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class commercialFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"commercialFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial\",\"fields\":[{\"name\":\"legacyIds\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"legacyIdFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids\",\"fields\":[{\"name\":\"LEGACY_ID_COMPANY_REGISTERED_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Company Number\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"identifiers\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"identifierFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers\",\"fields\":[{\"name\":\"NAME_BUSINESS_COMPANY_TYPE\",\"type\":[\"null\",\"string\"],\"doc\":\"Type of company - L for Limited\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_BUSINESS_VAT\",\"type\":[\"null\",\"string\"],\"doc\":\"VAT number field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_BUSINESS_EMAIL\",\"type\":[\"null\",\"string\"],\"doc\":\"EMAIL ID field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_DISSOLVED_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"Dissolution Date field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_INCORPORATION_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"Date of incorporation in CCYYMMDD format\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_UPDATE_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"This is load date and will be a system date \",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_DATA_SOURCE\",\"type\":[\"null\",\"string\"],\"doc\":\"Indicates source of data\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"website\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Supplied Websites\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"phones\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Supplied Phone number\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"names\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Standardised Company Names as per Keying & Linking inputs\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"addresses\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Standardised postcode as per Keying & Linking inputs\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"discoveryData\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"discoveryDataFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata\",\"fields\":[{\"name\":\"DISCOVERY_CLIENT_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Client Number for INSIGHT_ACCOUNT and CCDS_ACCOUNT asset\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_ACCOUNT_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Account Number for INSIGHT_ACCOUNT \",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_FACILITY_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Facility Number for CCDS_ACCOUNT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_DEFENDENT_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"Defendent ID for COURT_JUDGMENT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_DRC_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"DRC_ID for NONLIMITED_REGISTER\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_URN\",\"type\":[\"null\",\"string\"],\"doc\":\"Unique reference number of COMPANY_CIFAS\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_CASE_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"Case ID of COMPANY_CIFAS\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_CLN_BUSINESS_NAME\",\"type\":[\"null\",\"string\"],\"doc\":\"Cleansed business name \",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids.legacyIdFields legacyIds;
  @Deprecated public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers.identifierFields identifiers;
  /** Supplied Websites */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> website;
  /** Supplied Phone number */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> phones;
  /** Standardised Company Names as per Keying & Linking inputs */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> names;
  /** Standardised postcode as per Keying & Linking inputs */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> addresses;
  @Deprecated public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields discoveryData;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public commercialFields() {}

  /**
   * All-args constructor.
   */
  public commercialFields(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids.legacyIdFields legacyIds, com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers.identifierFields identifiers, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> website, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> phones, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> names, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> addresses, com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields discoveryData) {
    this.legacyIds = legacyIds;
    this.identifiers = identifiers;
    this.website = website;
    this.phones = phones;
    this.names = names;
    this.addresses = addresses;
    this.discoveryData = discoveryData;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return legacyIds;
    case 1: return identifiers;
    case 2: return website;
    case 3: return phones;
    case 4: return names;
    case 5: return addresses;
    case 6: return discoveryData;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: legacyIds = (com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids.legacyIdFields)value$; break;
    case 1: identifiers = (com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers.identifierFields)value$; break;
    case 2: website = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 3: phones = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 4: names = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 5: addresses = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 6: discoveryData = (com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'legacyIds' field.
   */
  public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids.legacyIdFields getLegacyIds() {
    return legacyIds;
  }

  /**
   * Sets the value of the 'legacyIds' field.
   * @param value the value to set.
   */
  public void setLegacyIds(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids.legacyIdFields value) {
    this.legacyIds = value;
  }

  /**
   * Gets the value of the 'identifiers' field.
   */
  public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers.identifierFields getIdentifiers() {
    return identifiers;
  }

  /**
   * Sets the value of the 'identifiers' field.
   * @param value the value to set.
   */
  public void setIdentifiers(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers.identifierFields value) {
    this.identifiers = value;
  }

  /**
   * Gets the value of the 'website' field.
   * Supplied Websites   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getWebsite() {
    return website;
  }

  /**
   * Sets the value of the 'website' field.
   * Supplied Websites   * @param value the value to set.
   */
  public void setWebsite(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.website = value;
  }

  /**
   * Gets the value of the 'phones' field.
   * Supplied Phone number   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getPhones() {
    return phones;
  }

  /**
   * Sets the value of the 'phones' field.
   * Supplied Phone number   * @param value the value to set.
   */
  public void setPhones(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.phones = value;
  }

  /**
   * Gets the value of the 'names' field.
   * Standardised Company Names as per Keying & Linking inputs   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getNames() {
    return names;
  }

  /**
   * Sets the value of the 'names' field.
   * Standardised Company Names as per Keying & Linking inputs   * @param value the value to set.
   */
  public void setNames(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.names = value;
  }

  /**
   * Gets the value of the 'addresses' field.
   * Standardised postcode as per Keying & Linking inputs   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getAddresses() {
    return addresses;
  }

  /**
   * Sets the value of the 'addresses' field.
   * Standardised postcode as per Keying & Linking inputs   * @param value the value to set.
   */
  public void setAddresses(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.addresses = value;
  }

  /**
   * Gets the value of the 'discoveryData' field.
   */
  public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields getDiscoveryData() {
    return discoveryData;
  }

  /**
   * Sets the value of the 'discoveryData' field.
   * @param value the value to set.
   */
  public void setDiscoveryData(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields value) {
    this.discoveryData = value;
  }

  /** Creates a new commercialFields RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder();
  }
  
  /** Creates a new commercialFields RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder other) {
    return new com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder(other);
  }
  
  /** Creates a new commercialFields RecordBuilder by copying an existing commercialFields instance */
  public static com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields other) {
    return new com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder(other);
  }
  
  /**
   * RecordBuilder for commercialFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<commercialFields>
    implements org.apache.avro.data.RecordBuilder<commercialFields> {

    private com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids.legacyIdFields legacyIds;
    private com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers.identifierFields identifiers;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> website;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> phones;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> names;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> addresses;
    private com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields discoveryData;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.legacyIds)) {
        this.legacyIds = data().deepCopy(fields()[0].schema(), other.legacyIds);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.identifiers)) {
        this.identifiers = data().deepCopy(fields()[1].schema(), other.identifiers);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.website)) {
        this.website = data().deepCopy(fields()[2].schema(), other.website);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phones)) {
        this.phones = data().deepCopy(fields()[3].schema(), other.phones);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.names)) {
        this.names = data().deepCopy(fields()[4].schema(), other.names);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.addresses)) {
        this.addresses = data().deepCopy(fields()[5].schema(), other.addresses);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.discoveryData)) {
        this.discoveryData = data().deepCopy(fields()[6].schema(), other.discoveryData);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing commercialFields instance */
    private Builder(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields other) {
            super(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.SCHEMA$);
      if (isValidValue(fields()[0], other.legacyIds)) {
        this.legacyIds = data().deepCopy(fields()[0].schema(), other.legacyIds);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.identifiers)) {
        this.identifiers = data().deepCopy(fields()[1].schema(), other.identifiers);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.website)) {
        this.website = data().deepCopy(fields()[2].schema(), other.website);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.phones)) {
        this.phones = data().deepCopy(fields()[3].schema(), other.phones);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.names)) {
        this.names = data().deepCopy(fields()[4].schema(), other.names);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.addresses)) {
        this.addresses = data().deepCopy(fields()[5].schema(), other.addresses);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.discoveryData)) {
        this.discoveryData = data().deepCopy(fields()[6].schema(), other.discoveryData);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'legacyIds' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids.legacyIdFields getLegacyIds() {
      return legacyIds;
    }
    
    /** Sets the value of the 'legacyIds' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder setLegacyIds(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids.legacyIdFields value) {
      validate(fields()[0], value);
      this.legacyIds = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'legacyIds' field has been set */
    public boolean hasLegacyIds() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'legacyIds' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder clearLegacyIds() {
      legacyIds = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'identifiers' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers.identifierFields getIdentifiers() {
      return identifiers;
    }
    
    /** Sets the value of the 'identifiers' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder setIdentifiers(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers.identifierFields value) {
      validate(fields()[1], value);
      this.identifiers = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'identifiers' field has been set */
    public boolean hasIdentifiers() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'identifiers' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder clearIdentifiers() {
      identifiers = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'website' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getWebsite() {
      return website;
    }
    
    /** Sets the value of the 'website' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder setWebsite(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.website = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'website' field has been set */
    public boolean hasWebsite() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'website' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder clearWebsite() {
      website = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'phones' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getPhones() {
      return phones;
    }
    
    /** Sets the value of the 'phones' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder setPhones(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.phones = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'phones' field has been set */
    public boolean hasPhones() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'phones' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder clearPhones() {
      phones = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'names' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getNames() {
      return names;
    }
    
    /** Sets the value of the 'names' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder setNames(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.names = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'names' field has been set */
    public boolean hasNames() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'names' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder clearNames() {
      names = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'addresses' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getAddresses() {
      return addresses;
    }
    
    /** Sets the value of the 'addresses' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder setAddresses(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[5], value);
      this.addresses = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'addresses' field has been set */
    public boolean hasAddresses() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'addresses' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder clearAddresses() {
      addresses = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'discoveryData' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields getDiscoveryData() {
      return discoveryData;
    }
    
    /** Sets the value of the 'discoveryData' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder setDiscoveryData(com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields value) {
      validate(fields()[6], value);
      this.discoveryData = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'discoveryData' field has been set */
    public boolean hasDiscoveryData() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'discoveryData' field */
    public com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.commercialFields.Builder clearDiscoveryData() {
      discoveryData = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public commercialFields build() {
      try {
        commercialFields record = new commercialFields();
        record.legacyIds = fieldSetFlags()[0] ? this.legacyIds : (com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.legacyids.legacyIdFields) defaultValue(fields()[0]);
        record.identifiers = fieldSetFlags()[1] ? this.identifiers : (com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.identifiers.identifierFields) defaultValue(fields()[1]);
        record.website = fieldSetFlags()[2] ? this.website : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[2]);
        record.phones = fieldSetFlags()[3] ? this.phones : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[3]);
        record.names = fieldSetFlags()[4] ? this.names : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[4]);
        record.addresses = fieldSetFlags()[5] ? this.addresses : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[5]);
        record.discoveryData = fieldSetFlags()[6] ? this.discoveryData : (com.equifax.fabric.uk.ingestion.nonlimitedregister.standardisedfields.entity.commercial.discoverydata.discoveryDataFields) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
