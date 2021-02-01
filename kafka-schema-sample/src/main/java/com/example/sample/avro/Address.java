/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.sample.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Avro for Address */
@org.apache.avro.specific.AvroGenerated
public class Address extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5409132708880109604L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Address\",\"namespace\":\"com.example.sample.avro\",\"doc\":\"Avro for Address\",\"fields\":[{\"name\":\"addressLine\",\"type\":\"string\",\"doc\":\"Address of User\"},{\"name\":\"city\",\"type\":\"string\",\"doc\":\"City of User\"},{\"name\":\"postcode\",\"type\":[\"string\",\"int\"],\"doc\":\"Postal of User\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"EnumType\",\"symbols\":[\"RESIDENCE\",\"OFFICE\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Address> ENCODER =
      new BinaryMessageEncoder<Address>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Address> DECODER =
      new BinaryMessageDecoder<Address>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Address> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Address> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Address>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Address to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Address from a ByteBuffer. */
  public static Address fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Address of User */
  @Deprecated public java.lang.CharSequence addressLine;
  /** City of User */
  @Deprecated public java.lang.CharSequence city;
  /** Postal of User */
  @Deprecated public java.lang.Object postcode;
  @Deprecated public com.example.sample.avro.EnumType type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Address() {}

  /**
   * All-args constructor.
   * @param addressLine Address of User
   * @param city City of User
   * @param postcode Postal of User
   * @param type The new value for type
   */
  public Address(java.lang.CharSequence addressLine, java.lang.CharSequence city, java.lang.Object postcode, com.example.sample.avro.EnumType type) {
    this.addressLine = addressLine;
    this.city = city;
    this.postcode = postcode;
    this.type = type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return addressLine;
    case 1: return city;
    case 2: return postcode;
    case 3: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: addressLine = (java.lang.CharSequence)value$; break;
    case 1: city = (java.lang.CharSequence)value$; break;
    case 2: postcode = (java.lang.Object)value$; break;
    case 3: type = (com.example.sample.avro.EnumType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'addressLine' field.
   * @return Address of User
   */
  public java.lang.CharSequence getAddressLine() {
    return addressLine;
  }

  /**
   * Sets the value of the 'addressLine' field.
   * Address of User
   * @param value the value to set.
   */
  public void setAddressLine(java.lang.CharSequence value) {
    this.addressLine = value;
  }

  /**
   * Gets the value of the 'city' field.
   * @return City of User
   */
  public java.lang.CharSequence getCity() {
    return city;
  }

  /**
   * Sets the value of the 'city' field.
   * City of User
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.city = value;
  }

  /**
   * Gets the value of the 'postcode' field.
   * @return Postal of User
   */
  public java.lang.Object getPostcode() {
    return postcode;
  }

  /**
   * Sets the value of the 'postcode' field.
   * Postal of User
   * @param value the value to set.
   */
  public void setPostcode(java.lang.Object value) {
    this.postcode = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public com.example.sample.avro.EnumType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(com.example.sample.avro.EnumType value) {
    this.type = value;
  }

  /**
   * Creates a new Address RecordBuilder.
   * @return A new Address RecordBuilder
   */
  public static com.example.sample.avro.Address.Builder newBuilder() {
    return new com.example.sample.avro.Address.Builder();
  }

  /**
   * Creates a new Address RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Address RecordBuilder
   */
  public static com.example.sample.avro.Address.Builder newBuilder(com.example.sample.avro.Address.Builder other) {
    return new com.example.sample.avro.Address.Builder(other);
  }

  /**
   * Creates a new Address RecordBuilder by copying an existing Address instance.
   * @param other The existing instance to copy.
   * @return A new Address RecordBuilder
   */
  public static com.example.sample.avro.Address.Builder newBuilder(com.example.sample.avro.Address other) {
    return new com.example.sample.avro.Address.Builder(other);
  }

  /**
   * RecordBuilder for Address instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Address>
    implements org.apache.avro.data.RecordBuilder<Address> {

    /** Address of User */
    private java.lang.CharSequence addressLine;
    /** City of User */
    private java.lang.CharSequence city;
    /** Postal of User */
    private java.lang.Object postcode;
    private com.example.sample.avro.EnumType type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.sample.avro.Address.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.addressLine)) {
        this.addressLine = data().deepCopy(fields()[0].schema(), other.addressLine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.city)) {
        this.city = data().deepCopy(fields()[1].schema(), other.city);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.postcode)) {
        this.postcode = data().deepCopy(fields()[2].schema(), other.postcode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Address instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.sample.avro.Address other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.addressLine)) {
        this.addressLine = data().deepCopy(fields()[0].schema(), other.addressLine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.city)) {
        this.city = data().deepCopy(fields()[1].schema(), other.city);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.postcode)) {
        this.postcode = data().deepCopy(fields()[2].schema(), other.postcode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'addressLine' field.
      * Address of User
      * @return The value.
      */
    public java.lang.CharSequence getAddressLine() {
      return addressLine;
    }

    /**
      * Sets the value of the 'addressLine' field.
      * Address of User
      * @param value The value of 'addressLine'.
      * @return This builder.
      */
    public com.example.sample.avro.Address.Builder setAddressLine(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.addressLine = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'addressLine' field has been set.
      * Address of User
      * @return True if the 'addressLine' field has been set, false otherwise.
      */
    public boolean hasAddressLine() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'addressLine' field.
      * Address of User
      * @return This builder.
      */
    public com.example.sample.avro.Address.Builder clearAddressLine() {
      addressLine = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * City of User
      * @return The value.
      */
    public java.lang.CharSequence getCity() {
      return city;
    }

    /**
      * Sets the value of the 'city' field.
      * City of User
      * @param value The value of 'city'.
      * @return This builder.
      */
    public com.example.sample.avro.Address.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.city = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * City of User
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'city' field.
      * City of User
      * @return This builder.
      */
    public com.example.sample.avro.Address.Builder clearCity() {
      city = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'postcode' field.
      * Postal of User
      * @return The value.
      */
    public java.lang.Object getPostcode() {
      return postcode;
    }

    /**
      * Sets the value of the 'postcode' field.
      * Postal of User
      * @param value The value of 'postcode'.
      * @return This builder.
      */
    public com.example.sample.avro.Address.Builder setPostcode(java.lang.Object value) {
      validate(fields()[2], value);
      this.postcode = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'postcode' field has been set.
      * Postal of User
      * @return True if the 'postcode' field has been set, false otherwise.
      */
    public boolean hasPostcode() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'postcode' field.
      * Postal of User
      * @return This builder.
      */
    public com.example.sample.avro.Address.Builder clearPostcode() {
      postcode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public com.example.sample.avro.EnumType getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.example.sample.avro.Address.Builder setType(com.example.sample.avro.EnumType value) {
      validate(fields()[3], value);
      this.type = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.example.sample.avro.Address.Builder clearType() {
      type = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Address build() {
      try {
        Address record = new Address();
        record.addressLine = fieldSetFlags()[0] ? this.addressLine : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.city = fieldSetFlags()[1] ? this.city : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.postcode = fieldSetFlags()[2] ? this.postcode : (java.lang.Object) defaultValue(fields()[2]);
        record.type = fieldSetFlags()[3] ? this.type : (com.example.sample.avro.EnumType) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Address>
    WRITER$ = (org.apache.avro.io.DatumWriter<Address>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Address>
    READER$ = (org.apache.avro.io.DatumReader<Address>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
