// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/enums/location_placeholder_field.proto

package com.google.ads.googleads.v1.enums;

/**
 * <pre>
 * Values for Location placeholder fields.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum}
 */
public  final class LocationPlaceholderFieldEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum)
    LocationPlaceholderFieldEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocationPlaceholderFieldEnum.newBuilder() to construct.
  private LocationPlaceholderFieldEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocationPlaceholderFieldEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LocationPlaceholderFieldEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.enums.LocationPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_LocationPlaceholderFieldEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.enums.LocationPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_LocationPlaceholderFieldEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum.class, com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible values for Location placeholder fields.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum.LocationPlaceholderField}
   */
  public enum LocationPlaceholderField
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Data Type: STRING. The name of the business.
     * </pre>
     *
     * <code>BUSINESS_NAME = 2;</code>
     */
    BUSINESS_NAME(2),
    /**
     * <pre>
     * Data Type: STRING. Line 1 of the business address.
     * </pre>
     *
     * <code>ADDRESS_LINE_1 = 3;</code>
     */
    ADDRESS_LINE_1(3),
    /**
     * <pre>
     * Data Type: STRING. Line 2 of the business address.
     * </pre>
     *
     * <code>ADDRESS_LINE_2 = 4;</code>
     */
    ADDRESS_LINE_2(4),
    /**
     * <pre>
     * Data Type: STRING. City of the business address.
     * </pre>
     *
     * <code>CITY = 5;</code>
     */
    CITY(5),
    /**
     * <pre>
     * Data Type: STRING. Province of the business address.
     * </pre>
     *
     * <code>PROVINCE = 6;</code>
     */
    PROVINCE(6),
    /**
     * <pre>
     * Data Type: STRING. Postal code of the business address.
     * </pre>
     *
     * <code>POSTAL_CODE = 7;</code>
     */
    POSTAL_CODE(7),
    /**
     * <pre>
     * Data Type: STRING. Country code of the business address.
     * </pre>
     *
     * <code>COUNTRY_CODE = 8;</code>
     */
    COUNTRY_CODE(8),
    /**
     * <pre>
     * Data Type: STRING. Phone number of the business.
     * </pre>
     *
     * <code>PHONE_NUMBER = 9;</code>
     */
    PHONE_NUMBER(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Data Type: STRING. The name of the business.
     * </pre>
     *
     * <code>BUSINESS_NAME = 2;</code>
     */
    public static final int BUSINESS_NAME_VALUE = 2;
    /**
     * <pre>
     * Data Type: STRING. Line 1 of the business address.
     * </pre>
     *
     * <code>ADDRESS_LINE_1 = 3;</code>
     */
    public static final int ADDRESS_LINE_1_VALUE = 3;
    /**
     * <pre>
     * Data Type: STRING. Line 2 of the business address.
     * </pre>
     *
     * <code>ADDRESS_LINE_2 = 4;</code>
     */
    public static final int ADDRESS_LINE_2_VALUE = 4;
    /**
     * <pre>
     * Data Type: STRING. City of the business address.
     * </pre>
     *
     * <code>CITY = 5;</code>
     */
    public static final int CITY_VALUE = 5;
    /**
     * <pre>
     * Data Type: STRING. Province of the business address.
     * </pre>
     *
     * <code>PROVINCE = 6;</code>
     */
    public static final int PROVINCE_VALUE = 6;
    /**
     * <pre>
     * Data Type: STRING. Postal code of the business address.
     * </pre>
     *
     * <code>POSTAL_CODE = 7;</code>
     */
    public static final int POSTAL_CODE_VALUE = 7;
    /**
     * <pre>
     * Data Type: STRING. Country code of the business address.
     * </pre>
     *
     * <code>COUNTRY_CODE = 8;</code>
     */
    public static final int COUNTRY_CODE_VALUE = 8;
    /**
     * <pre>
     * Data Type: STRING. Phone number of the business.
     * </pre>
     *
     * <code>PHONE_NUMBER = 9;</code>
     */
    public static final int PHONE_NUMBER_VALUE = 9;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LocationPlaceholderField valueOf(int value) {
      return forNumber(value);
    }

    public static LocationPlaceholderField forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return BUSINESS_NAME;
        case 3: return ADDRESS_LINE_1;
        case 4: return ADDRESS_LINE_2;
        case 5: return CITY;
        case 6: return PROVINCE;
        case 7: return POSTAL_CODE;
        case 8: return COUNTRY_CODE;
        case 9: return PHONE_NUMBER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LocationPlaceholderField>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LocationPlaceholderField> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LocationPlaceholderField>() {
            public LocationPlaceholderField findValueByNumber(int number) {
              return LocationPlaceholderField.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final LocationPlaceholderField[] VALUES = values();

    public static LocationPlaceholderField valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LocationPlaceholderField(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum.LocationPlaceholderField)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum other = (com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Values for Location placeholder fields.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum)
      com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.enums.LocationPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_LocationPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.enums.LocationPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_LocationPlaceholderFieldEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum.class, com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.enums.LocationPlaceholderFieldProto.internal_static_google_ads_googleads_v1_enums_LocationPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum build() {
      com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum buildPartial() {
      com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum result = new com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum) {
        return mergeFrom((com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum other) {
      if (other == com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum)
  private static final com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum();
  }

  public static com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationPlaceholderFieldEnum>
      PARSER = new com.google.protobuf.AbstractParser<LocationPlaceholderFieldEnum>() {
    @java.lang.Override
    public LocationPlaceholderFieldEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LocationPlaceholderFieldEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LocationPlaceholderFieldEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationPlaceholderFieldEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.enums.LocationPlaceholderFieldEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
