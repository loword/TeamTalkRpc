// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: area.proto

package com.grpc.area;

public interface AreaTreeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.grpc.area.AreaTree)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string code = 2;</code>
   */
  java.lang.String getCode();
  /**
   * <code>string code = 2;</code>
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .com.grpc.area.AreaTree tree = 5;</code>
   */
  java.util.List<com.grpc.area.AreaTree> 
      getTreeList();
  /**
   * <code>repeated .com.grpc.area.AreaTree tree = 5;</code>
   */
  com.grpc.area.AreaTree getTree(int index);
  /**
   * <code>repeated .com.grpc.area.AreaTree tree = 5;</code>
   */
  int getTreeCount();
  /**
   * <code>repeated .com.grpc.area.AreaTree tree = 5;</code>
   */
  java.util.List<? extends com.grpc.area.AreaTreeOrBuilder> 
      getTreeOrBuilderList();
  /**
   * <code>repeated .com.grpc.area.AreaTree tree = 5;</code>
   */
  com.grpc.area.AreaTreeOrBuilder getTreeOrBuilder(
      int index);
}