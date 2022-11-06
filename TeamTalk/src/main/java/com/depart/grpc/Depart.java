// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: depart.proto

package com.depart.grpc;

/**
 * Protobuf type {@code com.depart.grpc.Depart}
 */
public  final class Depart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.depart.grpc.Depart)
    DepartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Depart.newBuilder() to construct.
  private Depart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Depart() {
    id_ = 0;
    departname_ = "";
    priority_ = 0;
    parentid_ = 0;
    status_ = 0;
    created_ = 0;
    updated_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Depart(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            departname_ = s;
            break;
          }
          case 24: {

            priority_ = input.readInt32();
            break;
          }
          case 32: {

            parentid_ = input.readInt32();
            break;
          }
          case 40: {

            status_ = input.readInt32();
            break;
          }
          case 48: {

            created_ = input.readInt32();
            break;
          }
          case 56: {

            updated_ = input.readInt32();
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
    return com.depart.grpc.DepartOuterClass.internal_static_com_depart_grpc_Depart_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.depart.grpc.DepartOuterClass.internal_static_com_depart_grpc_Depart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.depart.grpc.Depart.class, com.depart.grpc.Depart.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int DEPARTNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object departname_;
  /**
   * <code>string departname = 2;</code>
   */
  public java.lang.String getDepartname() {
    java.lang.Object ref = departname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      departname_ = s;
      return s;
    }
  }
  /**
   * <code>string departname = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDepartnameBytes() {
    java.lang.Object ref = departname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      departname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIORITY_FIELD_NUMBER = 3;
  private int priority_;
  /**
   * <code>int32 priority = 3;</code>
   */
  public int getPriority() {
    return priority_;
  }

  public static final int PARENTID_FIELD_NUMBER = 4;
  private int parentid_;
  /**
   * <code>int32 parentid = 4;</code>
   */
  public int getParentid() {
    return parentid_;
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private int status_;
  /**
   * <code>int32 status = 5;</code>
   */
  public int getStatus() {
    return status_;
  }

  public static final int CREATED_FIELD_NUMBER = 6;
  private int created_;
  /**
   * <code>int32 created = 6;</code>
   */
  public int getCreated() {
    return created_;
  }

  public static final int UPDATED_FIELD_NUMBER = 7;
  private int updated_;
  /**
   * <code>int32 updated = 7;</code>
   */
  public int getUpdated() {
    return updated_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getDepartnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, departname_);
    }
    if (priority_ != 0) {
      output.writeInt32(3, priority_);
    }
    if (parentid_ != 0) {
      output.writeInt32(4, parentid_);
    }
    if (status_ != 0) {
      output.writeInt32(5, status_);
    }
    if (created_ != 0) {
      output.writeInt32(6, created_);
    }
    if (updated_ != 0) {
      output.writeInt32(7, updated_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getDepartnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, departname_);
    }
    if (priority_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, priority_);
    }
    if (parentid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, parentid_);
    }
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, status_);
    }
    if (created_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, created_);
    }
    if (updated_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, updated_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.depart.grpc.Depart)) {
      return super.equals(obj);
    }
    com.depart.grpc.Depart other = (com.depart.grpc.Depart) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getDepartname()
        .equals(other.getDepartname());
    result = result && (getPriority()
        == other.getPriority());
    result = result && (getParentid()
        == other.getParentid());
    result = result && (getStatus()
        == other.getStatus());
    result = result && (getCreated()
        == other.getCreated());
    result = result && (getUpdated()
        == other.getUpdated());
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + DEPARTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getDepartname().hashCode();
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + getPriority();
    hash = (37 * hash) + PARENTID_FIELD_NUMBER;
    hash = (53 * hash) + getParentid();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (37 * hash) + CREATED_FIELD_NUMBER;
    hash = (53 * hash) + getCreated();
    hash = (37 * hash) + UPDATED_FIELD_NUMBER;
    hash = (53 * hash) + getUpdated();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.depart.grpc.Depart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.depart.grpc.Depart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.depart.grpc.Depart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.depart.grpc.Depart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.depart.grpc.Depart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.depart.grpc.Depart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.depart.grpc.Depart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.depart.grpc.Depart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.depart.grpc.Depart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.depart.grpc.Depart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.depart.grpc.Depart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.depart.grpc.Depart parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.depart.grpc.Depart prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.depart.grpc.Depart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.depart.grpc.Depart)
      com.depart.grpc.DepartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.depart.grpc.DepartOuterClass.internal_static_com_depart_grpc_Depart_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.depart.grpc.DepartOuterClass.internal_static_com_depart_grpc_Depart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.depart.grpc.Depart.class, com.depart.grpc.Depart.Builder.class);
    }

    // Construct using com.depart.grpc.Depart.newBuilder()
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
    public Builder clear() {
      super.clear();
      id_ = 0;

      departname_ = "";

      priority_ = 0;

      parentid_ = 0;

      status_ = 0;

      created_ = 0;

      updated_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.depart.grpc.DepartOuterClass.internal_static_com_depart_grpc_Depart_descriptor;
    }

    public com.depart.grpc.Depart getDefaultInstanceForType() {
      return com.depart.grpc.Depart.getDefaultInstance();
    }

    public com.depart.grpc.Depart build() {
      com.depart.grpc.Depart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.depart.grpc.Depart buildPartial() {
      com.depart.grpc.Depart result = new com.depart.grpc.Depart(this);
      result.id_ = id_;
      result.departname_ = departname_;
      result.priority_ = priority_;
      result.parentid_ = parentid_;
      result.status_ = status_;
      result.created_ = created_;
      result.updated_ = updated_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.depart.grpc.Depart) {
        return mergeFrom((com.depart.grpc.Depart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.depart.grpc.Depart other) {
      if (other == com.depart.grpc.Depart.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getDepartname().isEmpty()) {
        departname_ = other.departname_;
        onChanged();
      }
      if (other.getPriority() != 0) {
        setPriority(other.getPriority());
      }
      if (other.getParentid() != 0) {
        setParentid(other.getParentid());
      }
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (other.getCreated() != 0) {
        setCreated(other.getCreated());
      }
      if (other.getUpdated() != 0) {
        setUpdated(other.getUpdated());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.depart.grpc.Depart parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.depart.grpc.Depart) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object departname_ = "";
    /**
     * <code>string departname = 2;</code>
     */
    public java.lang.String getDepartname() {
      java.lang.Object ref = departname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        departname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string departname = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDepartnameBytes() {
      java.lang.Object ref = departname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        departname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string departname = 2;</code>
     */
    public Builder setDepartname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      departname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string departname = 2;</code>
     */
    public Builder clearDepartname() {
      
      departname_ = getDefaultInstance().getDepartname();
      onChanged();
      return this;
    }
    /**
     * <code>string departname = 2;</code>
     */
    public Builder setDepartnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      departname_ = value;
      onChanged();
      return this;
    }

    private int priority_ ;
    /**
     * <code>int32 priority = 3;</code>
     */
    public int getPriority() {
      return priority_;
    }
    /**
     * <code>int32 priority = 3;</code>
     */
    public Builder setPriority(int value) {
      
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 priority = 3;</code>
     */
    public Builder clearPriority() {
      
      priority_ = 0;
      onChanged();
      return this;
    }

    private int parentid_ ;
    /**
     * <code>int32 parentid = 4;</code>
     */
    public int getParentid() {
      return parentid_;
    }
    /**
     * <code>int32 parentid = 4;</code>
     */
    public Builder setParentid(int value) {
      
      parentid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 parentid = 4;</code>
     */
    public Builder clearParentid() {
      
      parentid_ = 0;
      onChanged();
      return this;
    }

    private int status_ ;
    /**
     * <code>int32 status = 5;</code>
     */
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 5;</code>
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 5;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private int created_ ;
    /**
     * <code>int32 created = 6;</code>
     */
    public int getCreated() {
      return created_;
    }
    /**
     * <code>int32 created = 6;</code>
     */
    public Builder setCreated(int value) {
      
      created_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 created = 6;</code>
     */
    public Builder clearCreated() {
      
      created_ = 0;
      onChanged();
      return this;
    }

    private int updated_ ;
    /**
     * <code>int32 updated = 7;</code>
     */
    public int getUpdated() {
      return updated_;
    }
    /**
     * <code>int32 updated = 7;</code>
     */
    public Builder setUpdated(int value) {
      
      updated_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 updated = 7;</code>
     */
    public Builder clearUpdated() {
      
      updated_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.depart.grpc.Depart)
  }

  // @@protoc_insertion_point(class_scope:com.depart.grpc.Depart)
  private static final com.depart.grpc.Depart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.depart.grpc.Depart();
  }

  public static com.depart.grpc.Depart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Depart>
      PARSER = new com.google.protobuf.AbstractParser<Depart>() {
    public Depart parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Depart(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Depart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Depart> getParserForType() {
    return PARSER;
  }

  public com.depart.grpc.Depart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

