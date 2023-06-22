// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: menu.proto

package com.grpc.menu;

public interface MenuResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.grpc.menu.MenuResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 10;</code>
   */
  int getId();

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

  /**
   * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
   */
  java.util.List<com.grpc.menu.Menu> 
      getMenuList();
  /**
   * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
   */
  com.grpc.menu.Menu getMenu(int index);
  /**
   * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
   */
  int getMenuCount();
  /**
   * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
   */
  java.util.List<? extends com.grpc.menu.MenuOrBuilder> 
      getMenuOrBuilderList();
  /**
   * <code>repeated .com.grpc.menu.Menu menu = 5;</code>
   */
  com.grpc.menu.MenuOrBuilder getMenuOrBuilder(
      int index);

  /**
   * <code>int32 status_id = 6;</code>
   */
  int getStatusId();
}