// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: menu.proto

package com.menu.grpc;

public interface MenuOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.menu.grpc.Menu)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 menu_id = 4;</code>
   */
  int getMenuId();

  /**
   * <code>string menu_name = 1;</code>
   */
  java.lang.String getMenuName();
  /**
   * <code>string menu_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getMenuNameBytes();

  /**
   * <code>string menu_url = 2;</code>
   */
  java.lang.String getMenuUrl();
  /**
   * <code>string menu_url = 2;</code>
   */
  com.google.protobuf.ByteString
      getMenuUrlBytes();

  /**
   * <code>int32 parent_id = 3;</code>
   */
  int getParentId();
}
