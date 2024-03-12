// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

// Protobuf Java Version: 3.25.3
package futures;

/**
 * Protobuf type {@code futures.Meal}
 */
public final class Meal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:futures.Meal)
    MealOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Meal.newBuilder() to construct.
  private Meal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Meal() {
    meal_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Meal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return futures.ServiceProto.internal_static_futures_Meal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return futures.ServiceProto.internal_static_futures_Meal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            futures.Meal.class, futures.Meal.Builder.class);
  }

  public static final int MEAL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object meal_ = "";
  /**
   * <code>string meal = 1;</code>
   * @return The meal.
   */
  @java.lang.Override
  public java.lang.String getMeal() {
    java.lang.Object ref = meal_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      meal_ = s;
      return s;
    }
  }
  /**
   * <code>string meal = 1;</code>
   * @return The bytes for meal.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMealBytes() {
    java.lang.Object ref = meal_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      meal_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_ = 0;
  /**
   * <code>int32 count = 2;</code>
   * @return The count.
   */
  @java.lang.Override
  public int getCount() {
    return count_;
  }

  public static final int PRICE_FIELD_NUMBER = 3;
  private float price_ = 0F;
  /**
   * <code>float price = 3;</code>
   * @return The price.
   */
  @java.lang.Override
  public float getPrice() {
    return price_;
  }

  public static final int PAYMENTCODE_FIELD_NUMBER = 4;
  private long paymentCode_ = 0L;
  /**
   * <code>int64 paymentCode = 4;</code>
   * @return The paymentCode.
   */
  @java.lang.Override
  public long getPaymentCode() {
    return paymentCode_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(meal_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, meal_);
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    if (java.lang.Float.floatToRawIntBits(price_) != 0) {
      output.writeFloat(3, price_);
    }
    if (paymentCode_ != 0L) {
      output.writeInt64(4, paymentCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(meal_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, meal_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    if (java.lang.Float.floatToRawIntBits(price_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, price_);
    }
    if (paymentCode_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, paymentCode_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof futures.Meal)) {
      return super.equals(obj);
    }
    futures.Meal other = (futures.Meal) obj;

    if (!getMeal()
        .equals(other.getMeal())) return false;
    if (getCount()
        != other.getCount()) return false;
    if (java.lang.Float.floatToIntBits(getPrice())
        != java.lang.Float.floatToIntBits(
            other.getPrice())) return false;
    if (getPaymentCode()
        != other.getPaymentCode()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MEAL_FIELD_NUMBER;
    hash = (53 * hash) + getMeal().hashCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPrice());
    hash = (37 * hash) + PAYMENTCODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPaymentCode());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static futures.Meal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static futures.Meal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static futures.Meal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static futures.Meal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static futures.Meal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static futures.Meal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static futures.Meal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static futures.Meal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static futures.Meal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static futures.Meal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static futures.Meal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static futures.Meal parseFrom(
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
  public static Builder newBuilder(futures.Meal prototype) {
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
   * Protobuf type {@code futures.Meal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:futures.Meal)
      futures.MealOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return futures.ServiceProto.internal_static_futures_Meal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return futures.ServiceProto.internal_static_futures_Meal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              futures.Meal.class, futures.Meal.Builder.class);
    }

    // Construct using futures.Meal.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      meal_ = "";
      count_ = 0;
      price_ = 0F;
      paymentCode_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return futures.ServiceProto.internal_static_futures_Meal_descriptor;
    }

    @java.lang.Override
    public futures.Meal getDefaultInstanceForType() {
      return futures.Meal.getDefaultInstance();
    }

    @java.lang.Override
    public futures.Meal build() {
      futures.Meal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public futures.Meal buildPartial() {
      futures.Meal result = new futures.Meal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(futures.Meal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.meal_ = meal_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.count_ = count_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.price_ = price_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.paymentCode_ = paymentCode_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof futures.Meal) {
        return mergeFrom((futures.Meal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(futures.Meal other) {
      if (other == futures.Meal.getDefaultInstance()) return this;
      if (!other.getMeal().isEmpty()) {
        meal_ = other.meal_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.getPrice() != 0F) {
        setPrice(other.getPrice());
      }
      if (other.getPaymentCode() != 0L) {
        setPaymentCode(other.getPaymentCode());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              meal_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              count_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 29: {
              price_ = input.readFloat();
              bitField0_ |= 0x00000004;
              break;
            } // case 29
            case 32: {
              paymentCode_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object meal_ = "";
    /**
     * <code>string meal = 1;</code>
     * @return The meal.
     */
    public java.lang.String getMeal() {
      java.lang.Object ref = meal_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        meal_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string meal = 1;</code>
     * @return The bytes for meal.
     */
    public com.google.protobuf.ByteString
        getMealBytes() {
      java.lang.Object ref = meal_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        meal_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string meal = 1;</code>
     * @param value The meal to set.
     * @return This builder for chaining.
     */
    public Builder setMeal(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      meal_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string meal = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMeal() {
      meal_ = getDefaultInstance().getMeal();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string meal = 1;</code>
     * @param value The bytes for meal to set.
     * @return This builder for chaining.
     */
    public Builder setMealBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      meal_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <code>int32 count = 2;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 2;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {

      count_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      count_ = 0;
      onChanged();
      return this;
    }

    private float price_ ;
    /**
     * <code>float price = 3;</code>
     * @return The price.
     */
    @java.lang.Override
    public float getPrice() {
      return price_;
    }
    /**
     * <code>float price = 3;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(float value) {

      price_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>float price = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      bitField0_ = (bitField0_ & ~0x00000004);
      price_ = 0F;
      onChanged();
      return this;
    }

    private long paymentCode_ ;
    /**
     * <code>int64 paymentCode = 4;</code>
     * @return The paymentCode.
     */
    @java.lang.Override
    public long getPaymentCode() {
      return paymentCode_;
    }
    /**
     * <code>int64 paymentCode = 4;</code>
     * @param value The paymentCode to set.
     * @return This builder for chaining.
     */
    public Builder setPaymentCode(long value) {

      paymentCode_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 paymentCode = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPaymentCode() {
      bitField0_ = (bitField0_ & ~0x00000008);
      paymentCode_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:futures.Meal)
  }

  // @@protoc_insertion_point(class_scope:futures.Meal)
  private static final futures.Meal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new futures.Meal();
  }

  public static futures.Meal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Meal>
      PARSER = new com.google.protobuf.AbstractParser<Meal>() {
    @java.lang.Override
    public Meal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Meal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Meal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public futures.Meal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

