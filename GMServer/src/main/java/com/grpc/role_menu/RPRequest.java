// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: role_menu.proto

package com.grpc.role_menu;

/**
 * Protobuf type {@code com.grpc.role_menu.RPRequest}
 */
public  final class RPRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.role_menu.RPRequest)
    RPRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RPRequest.newBuilder() to construct.
  private RPRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RPRequest() {
    id_ = 0;
    roleId_ = 0;
    menuId_ = 0;
    rp_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RPRequest(
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

            roleId_ = input.readInt32();
            break;
          }
          case 16: {

            menuId_ = input.readInt32();
            break;
          }
          case 32: {

            id_ = input.readInt32();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              rp_ = new java.util.ArrayList<com.grpc.role_menu.RP>();
              mutable_bitField0_ |= 0x00000008;
            }
            rp_.add(
                input.readMessage(com.grpc.role_menu.RP.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        rp_ = java.util.Collections.unmodifiableList(rp_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.role_menu.RoleMenu.internal_static_com_grpc_role_menu_RPRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.role_menu.RoleMenu.internal_static_com_grpc_role_menu_RPRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.role_menu.RPRequest.class, com.grpc.role_menu.RPRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 4;
  private int id_;
  /**
   * <code>int32 id = 4;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int ROLE_ID_FIELD_NUMBER = 1;
  private int roleId_;
  /**
   * <code>int32 role_id = 1;</code>
   */
  public int getRoleId() {
    return roleId_;
  }

  public static final int MENU_ID_FIELD_NUMBER = 2;
  private int menuId_;
  /**
   * <code>int32 menu_id = 2;</code>
   */
  public int getMenuId() {
    return menuId_;
  }

  public static final int RP_FIELD_NUMBER = 5;
  private java.util.List<com.grpc.role_menu.RP> rp_;
  /**
   * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
   */
  public java.util.List<com.grpc.role_menu.RP> getRpList() {
    return rp_;
  }
  /**
   * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
   */
  public java.util.List<? extends com.grpc.role_menu.RPOrBuilder> 
      getRpOrBuilderList() {
    return rp_;
  }
  /**
   * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
   */
  public int getRpCount() {
    return rp_.size();
  }
  /**
   * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
   */
  public com.grpc.role_menu.RP getRp(int index) {
    return rp_.get(index);
  }
  /**
   * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
   */
  public com.grpc.role_menu.RPOrBuilder getRpOrBuilder(
      int index) {
    return rp_.get(index);
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
    if (roleId_ != 0) {
      output.writeInt32(1, roleId_);
    }
    if (menuId_ != 0) {
      output.writeInt32(2, menuId_);
    }
    if (id_ != 0) {
      output.writeInt32(4, id_);
    }
    for (int i = 0; i < rp_.size(); i++) {
      output.writeMessage(5, rp_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (roleId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, roleId_);
    }
    if (menuId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, menuId_);
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, id_);
    }
    for (int i = 0; i < rp_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, rp_.get(i));
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
    if (!(obj instanceof com.grpc.role_menu.RPRequest)) {
      return super.equals(obj);
    }
    com.grpc.role_menu.RPRequest other = (com.grpc.role_menu.RPRequest) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && (getRoleId()
        == other.getRoleId());
    result = result && (getMenuId()
        == other.getMenuId());
    result = result && getRpList()
        .equals(other.getRpList());
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
    hash = (37 * hash) + ROLE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRoleId();
    hash = (37 * hash) + MENU_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMenuId();
    if (getRpCount() > 0) {
      hash = (37 * hash) + RP_FIELD_NUMBER;
      hash = (53 * hash) + getRpList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.role_menu.RPRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.role_menu.RPRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.role_menu.RPRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.role_menu.RPRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.role_menu.RPRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.role_menu.RPRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.role_menu.RPRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.role_menu.RPRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.role_menu.RPRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.role_menu.RPRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.role_menu.RPRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.role_menu.RPRequest parseFrom(
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
  public static Builder newBuilder(com.grpc.role_menu.RPRequest prototype) {
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
   * Protobuf type {@code com.grpc.role_menu.RPRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.role_menu.RPRequest)
      com.grpc.role_menu.RPRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.role_menu.RoleMenu.internal_static_com_grpc_role_menu_RPRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.role_menu.RoleMenu.internal_static_com_grpc_role_menu_RPRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.role_menu.RPRequest.class, com.grpc.role_menu.RPRequest.Builder.class);
    }

    // Construct using com.grpc.role_menu.RPRequest.newBuilder()
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
        getRpFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      roleId_ = 0;

      menuId_ = 0;

      if (rpBuilder_ == null) {
        rp_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        rpBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.role_menu.RoleMenu.internal_static_com_grpc_role_menu_RPRequest_descriptor;
    }

    @java.lang.Override
    public com.grpc.role_menu.RPRequest getDefaultInstanceForType() {
      return com.grpc.role_menu.RPRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.role_menu.RPRequest build() {
      com.grpc.role_menu.RPRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.role_menu.RPRequest buildPartial() {
      com.grpc.role_menu.RPRequest result = new com.grpc.role_menu.RPRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.roleId_ = roleId_;
      result.menuId_ = menuId_;
      if (rpBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          rp_ = java.util.Collections.unmodifiableList(rp_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.rp_ = rp_;
      } else {
        result.rp_ = rpBuilder_.build();
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
      if (other instanceof com.grpc.role_menu.RPRequest) {
        return mergeFrom((com.grpc.role_menu.RPRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.role_menu.RPRequest other) {
      if (other == com.grpc.role_menu.RPRequest.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getRoleId() != 0) {
        setRoleId(other.getRoleId());
      }
      if (other.getMenuId() != 0) {
        setMenuId(other.getMenuId());
      }
      if (rpBuilder_ == null) {
        if (!other.rp_.isEmpty()) {
          if (rp_.isEmpty()) {
            rp_ = other.rp_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureRpIsMutable();
            rp_.addAll(other.rp_);
          }
          onChanged();
        }
      } else {
        if (!other.rp_.isEmpty()) {
          if (rpBuilder_.isEmpty()) {
            rpBuilder_.dispose();
            rpBuilder_ = null;
            rp_ = other.rp_;
            bitField0_ = (bitField0_ & ~0x00000008);
            rpBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRpFieldBuilder() : null;
          } else {
            rpBuilder_.addAllMessages(other.rp_);
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
      com.grpc.role_menu.RPRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.role_menu.RPRequest) e.getUnfinishedMessage();
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
     * <code>int32 id = 4;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 4;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 4;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int roleId_ ;
    /**
     * <code>int32 role_id = 1;</code>
     */
    public int getRoleId() {
      return roleId_;
    }
    /**
     * <code>int32 role_id = 1;</code>
     */
    public Builder setRoleId(int value) {
      
      roleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 role_id = 1;</code>
     */
    public Builder clearRoleId() {
      
      roleId_ = 0;
      onChanged();
      return this;
    }

    private int menuId_ ;
    /**
     * <code>int32 menu_id = 2;</code>
     */
    public int getMenuId() {
      return menuId_;
    }
    /**
     * <code>int32 menu_id = 2;</code>
     */
    public Builder setMenuId(int value) {
      
      menuId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 menu_id = 2;</code>
     */
    public Builder clearMenuId() {
      
      menuId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.grpc.role_menu.RP> rp_ =
      java.util.Collections.emptyList();
    private void ensureRpIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        rp_ = new java.util.ArrayList<com.grpc.role_menu.RP>(rp_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.role_menu.RP, com.grpc.role_menu.RP.Builder, com.grpc.role_menu.RPOrBuilder> rpBuilder_;

    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public java.util.List<com.grpc.role_menu.RP> getRpList() {
      if (rpBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rp_);
      } else {
        return rpBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public int getRpCount() {
      if (rpBuilder_ == null) {
        return rp_.size();
      } else {
        return rpBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public com.grpc.role_menu.RP getRp(int index) {
      if (rpBuilder_ == null) {
        return rp_.get(index);
      } else {
        return rpBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public Builder setRp(
        int index, com.grpc.role_menu.RP value) {
      if (rpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRpIsMutable();
        rp_.set(index, value);
        onChanged();
      } else {
        rpBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public Builder setRp(
        int index, com.grpc.role_menu.RP.Builder builderForValue) {
      if (rpBuilder_ == null) {
        ensureRpIsMutable();
        rp_.set(index, builderForValue.build());
        onChanged();
      } else {
        rpBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public Builder addRp(com.grpc.role_menu.RP value) {
      if (rpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRpIsMutable();
        rp_.add(value);
        onChanged();
      } else {
        rpBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public Builder addRp(
        int index, com.grpc.role_menu.RP value) {
      if (rpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRpIsMutable();
        rp_.add(index, value);
        onChanged();
      } else {
        rpBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public Builder addRp(
        com.grpc.role_menu.RP.Builder builderForValue) {
      if (rpBuilder_ == null) {
        ensureRpIsMutable();
        rp_.add(builderForValue.build());
        onChanged();
      } else {
        rpBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public Builder addRp(
        int index, com.grpc.role_menu.RP.Builder builderForValue) {
      if (rpBuilder_ == null) {
        ensureRpIsMutable();
        rp_.add(index, builderForValue.build());
        onChanged();
      } else {
        rpBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public Builder addAllRp(
        java.lang.Iterable<? extends com.grpc.role_menu.RP> values) {
      if (rpBuilder_ == null) {
        ensureRpIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rp_);
        onChanged();
      } else {
        rpBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public Builder clearRp() {
      if (rpBuilder_ == null) {
        rp_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        rpBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public Builder removeRp(int index) {
      if (rpBuilder_ == null) {
        ensureRpIsMutable();
        rp_.remove(index);
        onChanged();
      } else {
        rpBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public com.grpc.role_menu.RP.Builder getRpBuilder(
        int index) {
      return getRpFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public com.grpc.role_menu.RPOrBuilder getRpOrBuilder(
        int index) {
      if (rpBuilder_ == null) {
        return rp_.get(index);  } else {
        return rpBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public java.util.List<? extends com.grpc.role_menu.RPOrBuilder> 
         getRpOrBuilderList() {
      if (rpBuilder_ != null) {
        return rpBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rp_);
      }
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public com.grpc.role_menu.RP.Builder addRpBuilder() {
      return getRpFieldBuilder().addBuilder(
          com.grpc.role_menu.RP.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public com.grpc.role_menu.RP.Builder addRpBuilder(
        int index) {
      return getRpFieldBuilder().addBuilder(
          index, com.grpc.role_menu.RP.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.role_menu.RP rp = 5;</code>
     */
    public java.util.List<com.grpc.role_menu.RP.Builder> 
         getRpBuilderList() {
      return getRpFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.role_menu.RP, com.grpc.role_menu.RP.Builder, com.grpc.role_menu.RPOrBuilder> 
        getRpFieldBuilder() {
      if (rpBuilder_ == null) {
        rpBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.grpc.role_menu.RP, com.grpc.role_menu.RP.Builder, com.grpc.role_menu.RPOrBuilder>(
                rp_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        rp_ = null;
      }
      return rpBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.role_menu.RPRequest)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.role_menu.RPRequest)
  private static final com.grpc.role_menu.RPRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.role_menu.RPRequest();
  }

  public static com.grpc.role_menu.RPRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RPRequest>
      PARSER = new com.google.protobuf.AbstractParser<RPRequest>() {
    @java.lang.Override
    public RPRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RPRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RPRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RPRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.role_menu.RPRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

