// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Discovery.proto

package com.grpc.discovery;

/**
 * Protobuf type {@code com.grpc.discovery.DiscoveryResponse}
 */
public  final class DiscoveryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.discovery.DiscoveryResponse)
    DiscoveryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiscoveryResponse.newBuilder() to construct.
  private DiscoveryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiscoveryResponse() {
    id_ = 0;
    itemname_ = "";
    itemurl_ = "";
    itempriority_ = 0;
    statusId_ = 0;
    discovery_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DiscoveryResponse(
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            itemname_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            itemurl_ = s;
            break;
          }
          case 32: {

            itempriority_ = input.readInt32();
            break;
          }
          case 40: {

            statusId_ = input.readInt32();
            break;
          }
          case 50: {
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              discovery_ = new java.util.ArrayList<com.grpc.discovery.Discovery>();
              mutable_bitField0_ |= 0x00000020;
            }
            discovery_.add(
                input.readMessage(com.grpc.discovery.Discovery.parser(), extensionRegistry));
            break;
          }
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
      if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
        discovery_ = java.util.Collections.unmodifiableList(discovery_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.discovery.DiscoveryOuterClass.internal_static_com_grpc_discovery_DiscoveryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.discovery.DiscoveryOuterClass.internal_static_com_grpc_discovery_DiscoveryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.discovery.DiscoveryResponse.class, com.grpc.discovery.DiscoveryResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int ITEMNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object itemname_;
  /**
   * <code>string itemname = 2;</code>
   */
  public java.lang.String getItemname() {
    java.lang.Object ref = itemname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemname_ = s;
      return s;
    }
  }
  /**
   * <code>string itemname = 2;</code>
   */
  public com.google.protobuf.ByteString
      getItemnameBytes() {
    java.lang.Object ref = itemname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEMURL_FIELD_NUMBER = 3;
  private volatile java.lang.Object itemurl_;
  /**
   * <code>string itemurl = 3;</code>
   */
  public java.lang.String getItemurl() {
    java.lang.Object ref = itemurl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemurl_ = s;
      return s;
    }
  }
  /**
   * <code>string itemurl = 3;</code>
   */
  public com.google.protobuf.ByteString
      getItemurlBytes() {
    java.lang.Object ref = itemurl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemurl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEMPRIORITY_FIELD_NUMBER = 4;
  private int itempriority_;
  /**
   * <code>int32 itempriority = 4;</code>
   */
  public int getItempriority() {
    return itempriority_;
  }

  public static final int STATUS_ID_FIELD_NUMBER = 5;
  private int statusId_;
  /**
   * <code>int32 status_id = 5;</code>
   */
  public int getStatusId() {
    return statusId_;
  }

  public static final int DISCOVERY_FIELD_NUMBER = 6;
  private java.util.List<com.grpc.discovery.Discovery> discovery_;
  /**
   * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
   */
  public java.util.List<com.grpc.discovery.Discovery> getDiscoveryList() {
    return discovery_;
  }
  /**
   * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
   */
  public java.util.List<? extends com.grpc.discovery.DiscoveryOrBuilder> 
      getDiscoveryOrBuilderList() {
    return discovery_;
  }
  /**
   * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
   */
  public int getDiscoveryCount() {
    return discovery_.size();
  }
  /**
   * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
   */
  public com.grpc.discovery.Discovery getDiscovery(int index) {
    return discovery_.get(index);
  }
  /**
   * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
   */
  public com.grpc.discovery.DiscoveryOrBuilder getDiscoveryOrBuilder(
      int index) {
    return discovery_.get(index);
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getItemnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, itemname_);
    }
    if (!getItemurlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, itemurl_);
    }
    if (itempriority_ != 0) {
      output.writeInt32(4, itempriority_);
    }
    if (statusId_ != 0) {
      output.writeInt32(5, statusId_);
    }
    for (int i = 0; i < discovery_.size(); i++) {
      output.writeMessage(6, discovery_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getItemnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, itemname_);
    }
    if (!getItemurlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, itemurl_);
    }
    if (itempriority_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, itempriority_);
    }
    if (statusId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, statusId_);
    }
    for (int i = 0; i < discovery_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, discovery_.get(i));
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
    if (!(obj instanceof com.grpc.discovery.DiscoveryResponse)) {
      return super.equals(obj);
    }
    com.grpc.discovery.DiscoveryResponse other = (com.grpc.discovery.DiscoveryResponse) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getItemname()
        .equals(other.getItemname());
    result = result && getItemurl()
        .equals(other.getItemurl());
    result = result && (getItempriority()
        == other.getItempriority());
    result = result && (getStatusId()
        == other.getStatusId());
    result = result && getDiscoveryList()
        .equals(other.getDiscoveryList());
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
    hash = (37 * hash) + ITEMNAME_FIELD_NUMBER;
    hash = (53 * hash) + getItemname().hashCode();
    hash = (37 * hash) + ITEMURL_FIELD_NUMBER;
    hash = (53 * hash) + getItemurl().hashCode();
    hash = (37 * hash) + ITEMPRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + getItempriority();
    hash = (37 * hash) + STATUS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStatusId();
    if (getDiscoveryCount() > 0) {
      hash = (37 * hash) + DISCOVERY_FIELD_NUMBER;
      hash = (53 * hash) + getDiscoveryList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.discovery.DiscoveryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.discovery.DiscoveryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.discovery.DiscoveryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.discovery.DiscoveryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.discovery.DiscoveryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.discovery.DiscoveryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.discovery.DiscoveryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.discovery.DiscoveryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.discovery.DiscoveryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.discovery.DiscoveryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.discovery.DiscoveryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.discovery.DiscoveryResponse parseFrom(
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
  public static Builder newBuilder(com.grpc.discovery.DiscoveryResponse prototype) {
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
   * Protobuf type {@code com.grpc.discovery.DiscoveryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.discovery.DiscoveryResponse)
      com.grpc.discovery.DiscoveryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.discovery.DiscoveryOuterClass.internal_static_com_grpc_discovery_DiscoveryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.discovery.DiscoveryOuterClass.internal_static_com_grpc_discovery_DiscoveryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.discovery.DiscoveryResponse.class, com.grpc.discovery.DiscoveryResponse.Builder.class);
    }

    // Construct using com.grpc.discovery.DiscoveryResponse.newBuilder()
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
        getDiscoveryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      itemname_ = "";

      itemurl_ = "";

      itempriority_ = 0;

      statusId_ = 0;

      if (discoveryBuilder_ == null) {
        discovery_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
      } else {
        discoveryBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.discovery.DiscoveryOuterClass.internal_static_com_grpc_discovery_DiscoveryResponse_descriptor;
    }

    @java.lang.Override
    public com.grpc.discovery.DiscoveryResponse getDefaultInstanceForType() {
      return com.grpc.discovery.DiscoveryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.discovery.DiscoveryResponse build() {
      com.grpc.discovery.DiscoveryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.discovery.DiscoveryResponse buildPartial() {
      com.grpc.discovery.DiscoveryResponse result = new com.grpc.discovery.DiscoveryResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.itemname_ = itemname_;
      result.itemurl_ = itemurl_;
      result.itempriority_ = itempriority_;
      result.statusId_ = statusId_;
      if (discoveryBuilder_ == null) {
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          discovery_ = java.util.Collections.unmodifiableList(discovery_);
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.discovery_ = discovery_;
      } else {
        result.discovery_ = discoveryBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.grpc.discovery.DiscoveryResponse) {
        return mergeFrom((com.grpc.discovery.DiscoveryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.discovery.DiscoveryResponse other) {
      if (other == com.grpc.discovery.DiscoveryResponse.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getItemname().isEmpty()) {
        itemname_ = other.itemname_;
        onChanged();
      }
      if (!other.getItemurl().isEmpty()) {
        itemurl_ = other.itemurl_;
        onChanged();
      }
      if (other.getItempriority() != 0) {
        setItempriority(other.getItempriority());
      }
      if (other.getStatusId() != 0) {
        setStatusId(other.getStatusId());
      }
      if (discoveryBuilder_ == null) {
        if (!other.discovery_.isEmpty()) {
          if (discovery_.isEmpty()) {
            discovery_ = other.discovery_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensureDiscoveryIsMutable();
            discovery_.addAll(other.discovery_);
          }
          onChanged();
        }
      } else {
        if (!other.discovery_.isEmpty()) {
          if (discoveryBuilder_.isEmpty()) {
            discoveryBuilder_.dispose();
            discoveryBuilder_ = null;
            discovery_ = other.discovery_;
            bitField0_ = (bitField0_ & ~0x00000020);
            discoveryBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDiscoveryFieldBuilder() : null;
          } else {
            discoveryBuilder_.addAllMessages(other.discovery_);
          }
        }
      }
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
      com.grpc.discovery.DiscoveryResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.discovery.DiscoveryResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private java.lang.Object itemname_ = "";
    /**
     * <code>string itemname = 2;</code>
     */
    public java.lang.String getItemname() {
      java.lang.Object ref = itemname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string itemname = 2;</code>
     */
    public com.google.protobuf.ByteString
        getItemnameBytes() {
      java.lang.Object ref = itemname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string itemname = 2;</code>
     */
    public Builder setItemname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string itemname = 2;</code>
     */
    public Builder clearItemname() {
      
      itemname_ = getDefaultInstance().getItemname();
      onChanged();
      return this;
    }
    /**
     * <code>string itemname = 2;</code>
     */
    public Builder setItemnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemname_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object itemurl_ = "";
    /**
     * <code>string itemurl = 3;</code>
     */
    public java.lang.String getItemurl() {
      java.lang.Object ref = itemurl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemurl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string itemurl = 3;</code>
     */
    public com.google.protobuf.ByteString
        getItemurlBytes() {
      java.lang.Object ref = itemurl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemurl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string itemurl = 3;</code>
     */
    public Builder setItemurl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemurl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string itemurl = 3;</code>
     */
    public Builder clearItemurl() {
      
      itemurl_ = getDefaultInstance().getItemurl();
      onChanged();
      return this;
    }
    /**
     * <code>string itemurl = 3;</code>
     */
    public Builder setItemurlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemurl_ = value;
      onChanged();
      return this;
    }

    private int itempriority_ ;
    /**
     * <code>int32 itempriority = 4;</code>
     */
    public int getItempriority() {
      return itempriority_;
    }
    /**
     * <code>int32 itempriority = 4;</code>
     */
    public Builder setItempriority(int value) {
      
      itempriority_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 itempriority = 4;</code>
     */
    public Builder clearItempriority() {
      
      itempriority_ = 0;
      onChanged();
      return this;
    }

    private int statusId_ ;
    /**
     * <code>int32 status_id = 5;</code>
     */
    public int getStatusId() {
      return statusId_;
    }
    /**
     * <code>int32 status_id = 5;</code>
     */
    public Builder setStatusId(int value) {
      
      statusId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status_id = 5;</code>
     */
    public Builder clearStatusId() {
      
      statusId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.grpc.discovery.Discovery> discovery_ =
      java.util.Collections.emptyList();
    private void ensureDiscoveryIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
        discovery_ = new java.util.ArrayList<com.grpc.discovery.Discovery>(discovery_);
        bitField0_ |= 0x00000020;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.discovery.Discovery, com.grpc.discovery.Discovery.Builder, com.grpc.discovery.DiscoveryOrBuilder> discoveryBuilder_;

    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public java.util.List<com.grpc.discovery.Discovery> getDiscoveryList() {
      if (discoveryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(discovery_);
      } else {
        return discoveryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public int getDiscoveryCount() {
      if (discoveryBuilder_ == null) {
        return discovery_.size();
      } else {
        return discoveryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public com.grpc.discovery.Discovery getDiscovery(int index) {
      if (discoveryBuilder_ == null) {
        return discovery_.get(index);
      } else {
        return discoveryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public Builder setDiscovery(
        int index, com.grpc.discovery.Discovery value) {
      if (discoveryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiscoveryIsMutable();
        discovery_.set(index, value);
        onChanged();
      } else {
        discoveryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public Builder setDiscovery(
        int index, com.grpc.discovery.Discovery.Builder builderForValue) {
      if (discoveryBuilder_ == null) {
        ensureDiscoveryIsMutable();
        discovery_.set(index, builderForValue.build());
        onChanged();
      } else {
        discoveryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public Builder addDiscovery(com.grpc.discovery.Discovery value) {
      if (discoveryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiscoveryIsMutable();
        discovery_.add(value);
        onChanged();
      } else {
        discoveryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public Builder addDiscovery(
        int index, com.grpc.discovery.Discovery value) {
      if (discoveryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiscoveryIsMutable();
        discovery_.add(index, value);
        onChanged();
      } else {
        discoveryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public Builder addDiscovery(
        com.grpc.discovery.Discovery.Builder builderForValue) {
      if (discoveryBuilder_ == null) {
        ensureDiscoveryIsMutable();
        discovery_.add(builderForValue.build());
        onChanged();
      } else {
        discoveryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public Builder addDiscovery(
        int index, com.grpc.discovery.Discovery.Builder builderForValue) {
      if (discoveryBuilder_ == null) {
        ensureDiscoveryIsMutable();
        discovery_.add(index, builderForValue.build());
        onChanged();
      } else {
        discoveryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public Builder addAllDiscovery(
        java.lang.Iterable<? extends com.grpc.discovery.Discovery> values) {
      if (discoveryBuilder_ == null) {
        ensureDiscoveryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, discovery_);
        onChanged();
      } else {
        discoveryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public Builder clearDiscovery() {
      if (discoveryBuilder_ == null) {
        discovery_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
      } else {
        discoveryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public Builder removeDiscovery(int index) {
      if (discoveryBuilder_ == null) {
        ensureDiscoveryIsMutable();
        discovery_.remove(index);
        onChanged();
      } else {
        discoveryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public com.grpc.discovery.Discovery.Builder getDiscoveryBuilder(
        int index) {
      return getDiscoveryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public com.grpc.discovery.DiscoveryOrBuilder getDiscoveryOrBuilder(
        int index) {
      if (discoveryBuilder_ == null) {
        return discovery_.get(index);  } else {
        return discoveryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public java.util.List<? extends com.grpc.discovery.DiscoveryOrBuilder> 
         getDiscoveryOrBuilderList() {
      if (discoveryBuilder_ != null) {
        return discoveryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(discovery_);
      }
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public com.grpc.discovery.Discovery.Builder addDiscoveryBuilder() {
      return getDiscoveryFieldBuilder().addBuilder(
          com.grpc.discovery.Discovery.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public com.grpc.discovery.Discovery.Builder addDiscoveryBuilder(
        int index) {
      return getDiscoveryFieldBuilder().addBuilder(
          index, com.grpc.discovery.Discovery.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.discovery.Discovery discovery = 6;</code>
     */
    public java.util.List<com.grpc.discovery.Discovery.Builder> 
         getDiscoveryBuilderList() {
      return getDiscoveryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.discovery.Discovery, com.grpc.discovery.Discovery.Builder, com.grpc.discovery.DiscoveryOrBuilder> 
        getDiscoveryFieldBuilder() {
      if (discoveryBuilder_ == null) {
        discoveryBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.grpc.discovery.Discovery, com.grpc.discovery.Discovery.Builder, com.grpc.discovery.DiscoveryOrBuilder>(
                discovery_,
                ((bitField0_ & 0x00000020) == 0x00000020),
                getParentForChildren(),
                isClean());
        discovery_ = null;
      }
      return discoveryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.discovery.DiscoveryResponse)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.discovery.DiscoveryResponse)
  private static final com.grpc.discovery.DiscoveryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.discovery.DiscoveryResponse();
  }

  public static com.grpc.discovery.DiscoveryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiscoveryResponse>
      PARSER = new com.google.protobuf.AbstractParser<DiscoveryResponse>() {
    @java.lang.Override
    public DiscoveryResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DiscoveryResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DiscoveryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiscoveryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.discovery.DiscoveryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

