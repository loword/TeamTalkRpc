// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: menu.proto

package com.grpc.menu;

/**
 * Protobuf type {@code com.grpc.menu.MenuRequest}
 */
public  final class MenuRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.menu.MenuRequest)
    MenuRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MenuRequest.newBuilder() to construct.
  private MenuRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MenuRequest() {
    id_ = 0;
    menuId_ = 0;
    menuName_ = "";
    menuUrl_ = "";
    parentId_ = 0;
    token_ = "";
    menu_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MenuRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            menuName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            menuUrl_ = s;
            break;
          }
          case 24: {

            parentId_ = input.readInt32();
            break;
          }
          case 32: {

            menuId_ = input.readInt32();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
              menu_ = new java.util.ArrayList<com.grpc.menu.Menu>();
              mutable_bitField0_ |= 0x00000040;
            }
            menu_.add(
                input.readMessage(com.grpc.menu.Menu.parser(), extensionRegistry));
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            token_ = s;
            break;
          }
          case 80: {

            id_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
        menu_ = java.util.Collections.unmodifiableList(menu_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.menu.MenuOuterClass.internal_static_com_grpc_menu_MenuRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.menu.MenuOuterClass.internal_static_com_grpc_menu_MenuRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.menu.MenuRequest.class, com.grpc.menu.MenuRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 10;
  private int id_;
  /**
   * <code>int32 id = 10;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int MENU_ID_FIELD_NUMBER = 4;
  private int menuId_;
  /**
   * <code>int32 menu_id = 4;</code>
   */
  public int getMenuId() {
    return menuId_;
  }

  public static final int MENU_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object menuName_;
  /**
   * <code>string menu_name = 1;</code>
   */
  public java.lang.String getMenuName() {
    java.lang.Object ref = menuName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      menuName_ = s;
      return s;
    }
  }
  /**
   * <code>string menu_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMenuNameBytes() {
    java.lang.Object ref = menuName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      menuName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MENU_URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object menuUrl_;
  /**
   * <code>string menu_url = 2;</code>
   */
  public java.lang.String getMenuUrl() {
    java.lang.Object ref = menuUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      menuUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string menu_url = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMenuUrlBytes() {
    java.lang.Object ref = menuUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      menuUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_ID_FIELD_NUMBER = 3;
  private int parentId_;
  /**
   * <code>int32 parent_id = 3;</code>
   */
  public int getParentId() {
    return parentId_;
  }

  public static final int TOKEN_FIELD_NUMBER = 6;
  private volatile java.lang.Object token_;
  /**
   * <code>string token = 6;</code>
   */
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <code>string token = 6;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MENU_FIELD_NUMBER = 5;
  private java.util.List<com.grpc.menu.Menu> menu_;
  /**
   * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
   */
  public java.util.List<com.grpc.menu.Menu> getMenuList() {
    return menu_;
  }
  /**
   * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
   */
  public java.util.List<? extends com.grpc.menu.MenuOrBuilder> 
      getMenuOrBuilderList() {
    return menu_;
  }
  /**
   * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
   */
  public int getMenuCount() {
    return menu_.size();
  }
  /**
   * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
   */
  public com.grpc.menu.Menu getMenu(int index) {
    return menu_.get(index);
  }
  /**
   * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
   */
  public com.grpc.menu.MenuOrBuilder getMenuOrBuilder(
      int index) {
    return menu_.get(index);
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
    if (!getMenuNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, menuName_);
    }
    if (!getMenuUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, menuUrl_);
    }
    if (parentId_ != 0) {
      output.writeInt32(3, parentId_);
    }
    if (menuId_ != 0) {
      output.writeInt32(4, menuId_);
    }
    for (int i = 0; i < menu_.size(); i++) {
      output.writeMessage(5, menu_.get(i));
    }
    if (!getTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, token_);
    }
    if (id_ != 0) {
      output.writeInt32(10, id_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMenuNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, menuName_);
    }
    if (!getMenuUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, menuUrl_);
    }
    if (parentId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, parentId_);
    }
    if (menuId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, menuId_);
    }
    for (int i = 0; i < menu_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, menu_.get(i));
    }
    if (!getTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, token_);
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, id_);
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
    if (!(obj instanceof com.grpc.menu.MenuRequest)) {
      return super.equals(obj);
    }
    com.grpc.menu.MenuRequest other = (com.grpc.menu.MenuRequest) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && (getMenuId()
        == other.getMenuId());
    result = result && getMenuName()
        .equals(other.getMenuName());
    result = result && getMenuUrl()
        .equals(other.getMenuUrl());
    result = result && (getParentId()
        == other.getParentId());
    result = result && getToken()
        .equals(other.getToken());
    result = result && getMenuList()
        .equals(other.getMenuList());
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
    hash = (37 * hash) + MENU_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMenuId();
    hash = (37 * hash) + MENU_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getMenuName().hashCode();
    hash = (37 * hash) + MENU_URL_FIELD_NUMBER;
    hash = (53 * hash) + getMenuUrl().hashCode();
    hash = (37 * hash) + PARENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getParentId();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    if (getMenuCount() > 0) {
      hash = (37 * hash) + MENU_FIELD_NUMBER;
      hash = (53 * hash) + getMenuList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.menu.MenuRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.menu.MenuRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.menu.MenuRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.menu.MenuRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.menu.MenuRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.menu.MenuRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.menu.MenuRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.menu.MenuRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.menu.MenuRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.menu.MenuRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.menu.MenuRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.menu.MenuRequest parseFrom(
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
  public static Builder newBuilder(com.grpc.menu.MenuRequest prototype) {
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
   * Protobuf type {@code com.grpc.menu.MenuRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.menu.MenuRequest)
      com.grpc.menu.MenuRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.menu.MenuOuterClass.internal_static_com_grpc_menu_MenuRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.menu.MenuOuterClass.internal_static_com_grpc_menu_MenuRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.menu.MenuRequest.class, com.grpc.menu.MenuRequest.Builder.class);
    }

    // Construct using com.grpc.menu.MenuRequest.newBuilder()
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
        getMenuFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      menuId_ = 0;

      menuName_ = "";

      menuUrl_ = "";

      parentId_ = 0;

      token_ = "";

      if (menuBuilder_ == null) {
        menu_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000040);
      } else {
        menuBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.menu.MenuOuterClass.internal_static_com_grpc_menu_MenuRequest_descriptor;
    }

    @java.lang.Override
    public com.grpc.menu.MenuRequest getDefaultInstanceForType() {
      return com.grpc.menu.MenuRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.menu.MenuRequest build() {
      com.grpc.menu.MenuRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.menu.MenuRequest buildPartial() {
      com.grpc.menu.MenuRequest result = new com.grpc.menu.MenuRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.menuId_ = menuId_;
      result.menuName_ = menuName_;
      result.menuUrl_ = menuUrl_;
      result.parentId_ = parentId_;
      result.token_ = token_;
      if (menuBuilder_ == null) {
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
          menu_ = java.util.Collections.unmodifiableList(menu_);
          bitField0_ = (bitField0_ & ~0x00000040);
        }
        result.menu_ = menu_;
      } else {
        result.menu_ = menuBuilder_.build();
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
      if (other instanceof com.grpc.menu.MenuRequest) {
        return mergeFrom((com.grpc.menu.MenuRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.menu.MenuRequest other) {
      if (other == com.grpc.menu.MenuRequest.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getMenuId() != 0) {
        setMenuId(other.getMenuId());
      }
      if (!other.getMenuName().isEmpty()) {
        menuName_ = other.menuName_;
        onChanged();
      }
      if (!other.getMenuUrl().isEmpty()) {
        menuUrl_ = other.menuUrl_;
        onChanged();
      }
      if (other.getParentId() != 0) {
        setParentId(other.getParentId());
      }
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        onChanged();
      }
      if (menuBuilder_ == null) {
        if (!other.menu_.isEmpty()) {
          if (menu_.isEmpty()) {
            menu_ = other.menu_;
            bitField0_ = (bitField0_ & ~0x00000040);
          } else {
            ensureMenuIsMutable();
            menu_.addAll(other.menu_);
          }
          onChanged();
        }
      } else {
        if (!other.menu_.isEmpty()) {
          if (menuBuilder_.isEmpty()) {
            menuBuilder_.dispose();
            menuBuilder_ = null;
            menu_ = other.menu_;
            bitField0_ = (bitField0_ & ~0x00000040);
            menuBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMenuFieldBuilder() : null;
          } else {
            menuBuilder_.addAllMessages(other.menu_);
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
      com.grpc.menu.MenuRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.menu.MenuRequest) e.getUnfinishedMessage();
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
     * <code>int32 id = 10;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 10;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 10;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int menuId_ ;
    /**
     * <code>int32 menu_id = 4;</code>
     */
    public int getMenuId() {
      return menuId_;
    }
    /**
     * <code>int32 menu_id = 4;</code>
     */
    public Builder setMenuId(int value) {
      
      menuId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 menu_id = 4;</code>
     */
    public Builder clearMenuId() {
      
      menuId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object menuName_ = "";
    /**
     * <code>string menu_name = 1;</code>
     */
    public java.lang.String getMenuName() {
      java.lang.Object ref = menuName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        menuName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string menu_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMenuNameBytes() {
      java.lang.Object ref = menuName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        menuName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string menu_name = 1;</code>
     */
    public Builder setMenuName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      menuName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string menu_name = 1;</code>
     */
    public Builder clearMenuName() {
      
      menuName_ = getDefaultInstance().getMenuName();
      onChanged();
      return this;
    }
    /**
     * <code>string menu_name = 1;</code>
     */
    public Builder setMenuNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      menuName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object menuUrl_ = "";
    /**
     * <code>string menu_url = 2;</code>
     */
    public java.lang.String getMenuUrl() {
      java.lang.Object ref = menuUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        menuUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string menu_url = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMenuUrlBytes() {
      java.lang.Object ref = menuUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        menuUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string menu_url = 2;</code>
     */
    public Builder setMenuUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      menuUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string menu_url = 2;</code>
     */
    public Builder clearMenuUrl() {
      
      menuUrl_ = getDefaultInstance().getMenuUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string menu_url = 2;</code>
     */
    public Builder setMenuUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      menuUrl_ = value;
      onChanged();
      return this;
    }

    private int parentId_ ;
    /**
     * <code>int32 parent_id = 3;</code>
     */
    public int getParentId() {
      return parentId_;
    }
    /**
     * <code>int32 parent_id = 3;</code>
     */
    public Builder setParentId(int value) {
      
      parentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 parent_id = 3;</code>
     */
    public Builder clearParentId() {
      
      parentId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object token_ = "";
    /**
     * <code>string token = 6;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token = 6;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token = 6;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string token = 6;</code>
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }
    /**
     * <code>string token = 6;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.grpc.menu.Menu> menu_ =
      java.util.Collections.emptyList();
    private void ensureMenuIsMutable() {
      if (!((bitField0_ & 0x00000040) == 0x00000040)) {
        menu_ = new java.util.ArrayList<com.grpc.menu.Menu>(menu_);
        bitField0_ |= 0x00000040;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.menu.Menu, com.grpc.menu.Menu.Builder, com.grpc.menu.MenuOrBuilder> menuBuilder_;

    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public java.util.List<com.grpc.menu.Menu> getMenuList() {
      if (menuBuilder_ == null) {
        return java.util.Collections.unmodifiableList(menu_);
      } else {
        return menuBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public int getMenuCount() {
      if (menuBuilder_ == null) {
        return menu_.size();
      } else {
        return menuBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public com.grpc.menu.Menu getMenu(int index) {
      if (menuBuilder_ == null) {
        return menu_.get(index);
      } else {
        return menuBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public Builder setMenu(
        int index, com.grpc.menu.Menu value) {
      if (menuBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMenuIsMutable();
        menu_.set(index, value);
        onChanged();
      } else {
        menuBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public Builder setMenu(
        int index, com.grpc.menu.Menu.Builder builderForValue) {
      if (menuBuilder_ == null) {
        ensureMenuIsMutable();
        menu_.set(index, builderForValue.build());
        onChanged();
      } else {
        menuBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public Builder addMenu(com.grpc.menu.Menu value) {
      if (menuBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMenuIsMutable();
        menu_.add(value);
        onChanged();
      } else {
        menuBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public Builder addMenu(
        int index, com.grpc.menu.Menu value) {
      if (menuBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMenuIsMutable();
        menu_.add(index, value);
        onChanged();
      } else {
        menuBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public Builder addMenu(
        com.grpc.menu.Menu.Builder builderForValue) {
      if (menuBuilder_ == null) {
        ensureMenuIsMutable();
        menu_.add(builderForValue.build());
        onChanged();
      } else {
        menuBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public Builder addMenu(
        int index, com.grpc.menu.Menu.Builder builderForValue) {
      if (menuBuilder_ == null) {
        ensureMenuIsMutable();
        menu_.add(index, builderForValue.build());
        onChanged();
      } else {
        menuBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public Builder addAllMenu(
        java.lang.Iterable<? extends com.grpc.menu.Menu> values) {
      if (menuBuilder_ == null) {
        ensureMenuIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, menu_);
        onChanged();
      } else {
        menuBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public Builder clearMenu() {
      if (menuBuilder_ == null) {
        menu_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000040);
        onChanged();
      } else {
        menuBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public Builder removeMenu(int index) {
      if (menuBuilder_ == null) {
        ensureMenuIsMutable();
        menu_.remove(index);
        onChanged();
      } else {
        menuBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public com.grpc.menu.Menu.Builder getMenuBuilder(
        int index) {
      return getMenuFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public com.grpc.menu.MenuOrBuilder getMenuOrBuilder(
        int index) {
      if (menuBuilder_ == null) {
        return menu_.get(index);  } else {
        return menuBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public java.util.List<? extends com.grpc.menu.MenuOrBuilder> 
         getMenuOrBuilderList() {
      if (menuBuilder_ != null) {
        return menuBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(menu_);
      }
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public com.grpc.menu.Menu.Builder addMenuBuilder() {
      return getMenuFieldBuilder().addBuilder(
          com.grpc.menu.Menu.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public com.grpc.menu.Menu.Builder addMenuBuilder(
        int index) {
      return getMenuFieldBuilder().addBuilder(
          index, com.grpc.menu.Menu.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
     */
    public java.util.List<com.grpc.menu.Menu.Builder> 
         getMenuBuilderList() {
      return getMenuFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.menu.Menu, com.grpc.menu.Menu.Builder, com.grpc.menu.MenuOrBuilder> 
        getMenuFieldBuilder() {
      if (menuBuilder_ == null) {
        menuBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.grpc.menu.Menu, com.grpc.menu.Menu.Builder, com.grpc.menu.MenuOrBuilder>(
                menu_,
                ((bitField0_ & 0x00000040) == 0x00000040),
                getParentForChildren(),
                isClean());
        menu_ = null;
      }
      return menuBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.menu.MenuRequest)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.menu.MenuRequest)
  private static final com.grpc.menu.MenuRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.menu.MenuRequest();
  }

  public static com.grpc.menu.MenuRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MenuRequest>
      PARSER = new com.google.protobuf.AbstractParser<MenuRequest>() {
    @java.lang.Override
    public MenuRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MenuRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MenuRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MenuRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.menu.MenuRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

