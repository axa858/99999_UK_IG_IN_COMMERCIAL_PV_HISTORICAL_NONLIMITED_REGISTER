/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.nonlimitedregister;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class History extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"History\",\"namespace\":\"com.equifax.fabric.uk.nonlimitedregister\",\"fields\":[{\"name\":\"purposingHeader\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"PurposingHeader\",\"namespace\":\"com.equifax.fabric.uk.history.purposingheader\",\"fields\":[{\"name\":\"dateReported\",\"type\":[\"null\",\"long\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"recordUuid\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"matchKey\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"additionalInfo\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"additionalInfo\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"string\"}]}}}]}],\"default\":null},{\"name\":\"rawfields\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"RawFields\",\"namespace\":\"com.equifax.fabric.uk.purposing.nonlimitedregister.history\",\"fields\":[{\"name\":\"BUSINESS_NAME\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"ADDRESS\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"LOCALITY\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"TOWN\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"COUNTY\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"POSTCODE\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.equifax.fabric.uk.history.purposingheader.PurposingHeader purposingHeader;
  @Deprecated public com.equifax.fabric.uk.purposing.nonlimitedregister.history.RawFields rawfields;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public History() {}

  /**
   * All-args constructor.
   */
  public History(com.equifax.fabric.uk.history.purposingheader.PurposingHeader purposingHeader, com.equifax.fabric.uk.purposing.nonlimitedregister.history.RawFields rawfields) {
    this.purposingHeader = purposingHeader;
    this.rawfields = rawfields;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return purposingHeader;
    case 1: return rawfields;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: purposingHeader = (com.equifax.fabric.uk.history.purposingheader.PurposingHeader)value$; break;
    case 1: rawfields = (com.equifax.fabric.uk.purposing.nonlimitedregister.history.RawFields)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'purposingHeader' field.
   */
  public com.equifax.fabric.uk.history.purposingheader.PurposingHeader getPurposingHeader() {
    return purposingHeader;
  }

  /**
   * Sets the value of the 'purposingHeader' field.
   * @param value the value to set.
   */
  public void setPurposingHeader(com.equifax.fabric.uk.history.purposingheader.PurposingHeader value) {
    this.purposingHeader = value;
  }

  /**
   * Gets the value of the 'rawfields' field.
   */
  public com.equifax.fabric.uk.purposing.nonlimitedregister.history.RawFields getRawfields() {
    return rawfields;
  }

  /**
   * Sets the value of the 'rawfields' field.
   * @param value the value to set.
   */
  public void setRawfields(com.equifax.fabric.uk.purposing.nonlimitedregister.history.RawFields value) {
    this.rawfields = value;
  }

  /** Creates a new History RecordBuilder */
  public static com.equifax.fabric.uk.nonlimitedregister.History.Builder newBuilder() {
    return new com.equifax.fabric.uk.nonlimitedregister.History.Builder();
  }
  
  /** Creates a new History RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.nonlimitedregister.History.Builder newBuilder(com.equifax.fabric.uk.nonlimitedregister.History.Builder other) {
    return new com.equifax.fabric.uk.nonlimitedregister.History.Builder(other);
  }
  
  /** Creates a new History RecordBuilder by copying an existing History instance */
  public static com.equifax.fabric.uk.nonlimitedregister.History.Builder newBuilder(com.equifax.fabric.uk.nonlimitedregister.History other) {
    return new com.equifax.fabric.uk.nonlimitedregister.History.Builder(other);
  }
  
  /**
   * RecordBuilder for History instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<History>
    implements org.apache.avro.data.RecordBuilder<History> {

    private com.equifax.fabric.uk.history.purposingheader.PurposingHeader purposingHeader;
    private com.equifax.fabric.uk.purposing.nonlimitedregister.history.RawFields rawfields;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.nonlimitedregister.History.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.nonlimitedregister.History.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.purposingHeader)) {
        this.purposingHeader = data().deepCopy(fields()[0].schema(), other.purposingHeader);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rawfields)) {
        this.rawfields = data().deepCopy(fields()[1].schema(), other.rawfields);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing History instance */
    private Builder(com.equifax.fabric.uk.nonlimitedregister.History other) {
            super(com.equifax.fabric.uk.nonlimitedregister.History.SCHEMA$);
      if (isValidValue(fields()[0], other.purposingHeader)) {
        this.purposingHeader = data().deepCopy(fields()[0].schema(), other.purposingHeader);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rawfields)) {
        this.rawfields = data().deepCopy(fields()[1].schema(), other.rawfields);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'purposingHeader' field */
    public com.equifax.fabric.uk.history.purposingheader.PurposingHeader getPurposingHeader() {
      return purposingHeader;
    }
    
    /** Sets the value of the 'purposingHeader' field */
    public com.equifax.fabric.uk.nonlimitedregister.History.Builder setPurposingHeader(com.equifax.fabric.uk.history.purposingheader.PurposingHeader value) {
      validate(fields()[0], value);
      this.purposingHeader = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'purposingHeader' field has been set */
    public boolean hasPurposingHeader() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'purposingHeader' field */
    public com.equifax.fabric.uk.nonlimitedregister.History.Builder clearPurposingHeader() {
      purposingHeader = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'rawfields' field */
    public com.equifax.fabric.uk.purposing.nonlimitedregister.history.RawFields getRawfields() {
      return rawfields;
    }
    
    /** Sets the value of the 'rawfields' field */
    public com.equifax.fabric.uk.nonlimitedregister.History.Builder setRawfields(com.equifax.fabric.uk.purposing.nonlimitedregister.history.RawFields value) {
      validate(fields()[1], value);
      this.rawfields = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'rawfields' field has been set */
    public boolean hasRawfields() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'rawfields' field */
    public com.equifax.fabric.uk.nonlimitedregister.History.Builder clearRawfields() {
      rawfields = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public History build() {
      try {
        History record = new History();
        record.purposingHeader = fieldSetFlags()[0] ? this.purposingHeader : (com.equifax.fabric.uk.history.purposingheader.PurposingHeader) defaultValue(fields()[0]);
        record.rawfields = fieldSetFlags()[1] ? this.rawfields : (com.equifax.fabric.uk.purposing.nonlimitedregister.history.RawFields) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
