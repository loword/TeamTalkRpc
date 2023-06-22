// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: group.proto

package com.grpc.group;

/**
 * Protobuf type {@code com.grpc.group.GroupRequest}
 */
public  final class GroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.group.GroupRequest)
    GroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupRequest.newBuilder() to construct.
  private GroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupRequest() {
    id_ = 0;
    name_ = "";
    creator_ = 0;
    userCnt_ = 0;
    group_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GroupRequest(
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

            name_ = s;
            break;
          }
          case 24: {

            creator_ = input.readInt32();
            break;
          }
          case 32: {

            userCnt_ = input.readInt32();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              group_ = new java.util.ArrayList<com.grpc.group.Group>();
              mutable_bitField0_ |= 0x00000010;
            }
            group_.add(
                input.readMessage(com.grpc.group.Group.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        group_ = java.util.Collections.unmodifiableList(group_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.group.GroupOuterClass.internal_static_com_grpc_group_GroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.group.GroupOuterClass.internal_static_com_grpc_group_GroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.group.GroupRequest.class, com.grpc.group.GroupRequest.Builder.class);
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

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATOR_FIELD_NUMBER = 3;
  private int creator_;
  /**
   * <code>int32 creator = 3;</code>
   */
  public int getCreator() {
    return creator_;
  }

  public static final int USERCNT_FIELD_NUMBER = 4;
  private int userCnt_;
  /**
   * <code>int32 userCnt = 4;</code>
   */
  public int getUserCnt() {
    return userCnt_;
  }

  public static final int GROUP_FIELD_NUMBER = 5;
  private java.util.List<com.grpc.group.Group> group_;
  /**
   * <code>repeated .com.grpc.group.Group group = 5;</code>
   */
  public java.util.List<com.grpc.group.Group> getGroupList() {
    return group_;
  }
  /**
   * <code>repeated .com.grpc.group.Group group = 5;</code>
   */
  public java.util.List<? extends com.grpc.group.GroupOrBuilder> 
      getGroupOrBuilderList() {
    return group_;
  }
  /**
   * <code>repeated .com.grpc.group.Group group = 5;</code>
   */
  public int getGroupCount() {
    return group_.size();
  }
  /**
   * <code>repeated .com.grpc.group.Group group = 5;</code>
   */
  public com.grpc.group.Group getGroup(int index) {
    return group_.get(index);
  }
  /**
   * <code>repeated .com.grpc.group.Group group = 5;</code>
   */
  public com.grpc.group.GroupOrBuilder getGroupOrBuilder(
      int index) {
    return group_.get(index);
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (creator_ != 0) {
      output.writeInt32(3, creator_);
    }
    if (userCnt_ != 0) {
      output.writeInt32(4, userCnt_);
    }
    for (int i = 0; i < group_.size(); i++) {
      output.writeMessage(5, group_.get(i));
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
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (creator_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, creator_);
    }
    if (userCnt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, userCnt_);
    }
    for (int i = 0; i < group_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, group_.get(i));
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
    if (!(obj instanceof com.grpc.group.GroupRequest)) {
      return super.equals(obj);
    }
    com.grpc.group.GroupRequest other = (com.grpc.group.GroupRequest) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getName()
        .equals(other.getName());
    result = result && (getCreator()
        == other.getCreator());
    result = result && (getUserCnt()
        == other.getUserCnt());
    result = result && getGroupList()
        .equals(other.getGroupList());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CREATOR_FIELD_NUMBER;
    hash = (53 * hash) + getCreator();
    hash = (37 * hash) + USERCNT_FIELD_NUMBER;
    hash = (53 * hash) + getUserCnt();
    if (getGroupCount() > 0) {
      hash = (37 * hash) + GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getGroupList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.group.GroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.group.GroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.group.GroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.group.GroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.group.GroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.group.GroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.group.GroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.group.GroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.group.GroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.group.GroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.group.GroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.group.GroupRequest parseFrom(
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
  public static Builder newBuilder(com.grpc.group.GroupRequest prototype) {
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
   * Protobuf type {@code com.grpc.group.GroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.group.GroupRequest)
      com.grpc.group.GroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.group.GroupOuterClass.internal_static_com_grpc_group_GroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.group.GroupOuterClass.internal_static_com_grpc_group_GroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.group.GroupRequest.class, com.grpc.group.GroupRequest.Builder.class);
    }

    // Construct using com.grpc.group.GroupRequest.newBuilder()
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
        getGroupFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      name_ = "";

      creator_ = 0;

      userCnt_ = 0;

      if (groupBuilder_ == null) {
        group_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
      } else {
        groupBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.group.GroupOuterClass.internal_static_com_grpc_group_GroupRequest_descriptor;
    }

    @java.lang.Override
    public com.grpc.group.GroupRequest getDefaultInstanceForType() {
      return com.grpc.group.GroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.group.GroupRequest build() {
      com.grpc.group.GroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.group.GroupRequest buildPartial() {
      com.grpc.group.GroupRequest result = new com.grpc.group.GroupRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.name_ = name_;
      result.creator_ = creator_;
      result.userCnt_ = userCnt_;
      if (groupBuilder_ == null) {
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          group_ = java.util.Collections.unmodifiableList(group_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.group_ = group_;
      } else {
        result.group_ = groupBuilder_.build();
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
      if (other instanceof com.grpc.group.GroupRequest) {
        return mergeFrom((com.grpc.group.GroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.group.GroupRequest other) {
      if (other == com.grpc.group.GroupRequest.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getCreator() != 0) {
        setCreator(other.getCreator());
      }
      if (other.getUserCnt() != 0) {
        setUserCnt(other.getUserCnt());
      }
      if (groupBuilder_ == null) {
        if (!other.group_.isEmpty()) {
          if (group_.isEmpty()) {
            group_ = other.group_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureGroupIsMutable();
            group_.addAll(other.group_);
          }
          onChanged();
        }
      } else {
        if (!other.group_.isEmpty()) {
          if (groupBuilder_.isEmpty()) {
            groupBuilder_.dispose();
            groupBuilder_ = null;
            group_ = other.group_;
            bitField0_ = (bitField0_ & ~0x00000010);
            groupBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGroupFieldBuilder() : null;
          } else {
            groupBuilder_.addAllMessages(other.group_);
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
      com.grpc.group.GroupRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.group.GroupRequest) e.getUnfinishedMessage();
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

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int creator_ ;
    /**
     * <code>int32 creator = 3;</code>
     */
    public int getCreator() {
      return creator_;
    }
    /**
     * <code>int32 creator = 3;</code>
     */
    public Builder setCreator(int value) {
      
      creator_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 creator = 3;</code>
     */
    public Builder clearCreator() {
      
      creator_ = 0;
      onChanged();
      return this;
    }

    private int userCnt_ ;
    /**
     * <code>int32 userCnt = 4;</code>
     */
    public int getUserCnt() {
      return userCnt_;
    }
    /**
     * <code>int32 userCnt = 4;</code>
     */
    public Builder setUserCnt(int value) {
      
      userCnt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 userCnt = 4;</code>
     */
    public Builder clearUserCnt() {
      
      userCnt_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.grpc.group.Group> group_ =
      java.util.Collections.emptyList();
    private void ensureGroupIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        group_ = new java.util.ArrayList<com.grpc.group.Group>(group_);
        bitField0_ |= 0x00000010;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.group.Group, com.grpc.group.Group.Builder, com.grpc.group.GroupOrBuilder> groupBuilder_;

    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public java.util.List<com.grpc.group.Group> getGroupList() {
      if (groupBuilder_ == null) {
        return java.util.Collections.unmodifiableList(group_);
      } else {
        return groupBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public int getGroupCount() {
      if (groupBuilder_ == null) {
        return group_.size();
      } else {
        return groupBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public com.grpc.group.Group getGroup(int index) {
      if (groupBuilder_ == null) {
        return group_.get(index);
      } else {
        return groupBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public Builder setGroup(
        int index, com.grpc.group.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.set(index, value);
        onChanged();
      } else {
        groupBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public Builder setGroup(
        int index, com.grpc.group.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.set(index, builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public Builder addGroup(com.grpc.group.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.add(value);
        onChanged();
      } else {
        groupBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public Builder addGroup(
        int index, com.grpc.group.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupIsMutable();
        group_.add(index, value);
        onChanged();
      } else {
        groupBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public Builder addGroup(
        com.grpc.group.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.add(builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public Builder addGroup(
        int index, com.grpc.group.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.add(index, builderForValue.build());
        onChanged();
      } else {
        groupBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public Builder addAllGroup(
        java.lang.Iterable<? extends com.grpc.group.Group> values) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, group_);
        onChanged();
      } else {
        groupBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public Builder clearGroup() {
      if (groupBuilder_ == null) {
        group_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        groupBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public Builder removeGroup(int index) {
      if (groupBuilder_ == null) {
        ensureGroupIsMutable();
        group_.remove(index);
        onChanged();
      } else {
        groupBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public com.grpc.group.Group.Builder getGroupBuilder(
        int index) {
      return getGroupFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public com.grpc.group.GroupOrBuilder getGroupOrBuilder(
        int index) {
      if (groupBuilder_ == null) {
        return group_.get(index);  } else {
        return groupBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public java.util.List<? extends com.grpc.group.GroupOrBuilder> 
         getGroupOrBuilderList() {
      if (groupBuilder_ != null) {
        return groupBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(group_);
      }
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public com.grpc.group.Group.Builder addGroupBuilder() {
      return getGroupFieldBuilder().addBuilder(
          com.grpc.group.Group.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public com.grpc.group.Group.Builder addGroupBuilder(
        int index) {
      return getGroupFieldBuilder().addBuilder(
          index, com.grpc.group.Group.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.group.Group group = 5;</code>
     */
    public java.util.List<com.grpc.group.Group.Builder> 
         getGroupBuilderList() {
      return getGroupFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.group.Group, com.grpc.group.Group.Builder, com.grpc.group.GroupOrBuilder> 
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        groupBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.grpc.group.Group, com.grpc.group.Group.Builder, com.grpc.group.GroupOrBuilder>(
                group_,
                ((bitField0_ & 0x00000010) == 0x00000010),
                getParentForChildren(),
                isClean());
        group_ = null;
      }
      return groupBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.group.GroupRequest)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.group.GroupRequest)
  private static final com.grpc.group.GroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.group.GroupRequest();
  }

  public static com.grpc.group.GroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<GroupRequest>() {
    @java.lang.Override
    public GroupRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GroupRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.group.GroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

