// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: group.proto

package com.grpc.group;

public interface GroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.grpc.group.Group)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 creator = 3;</code>
   */
  int getCreator();

  /**
   * <code>int32 userCnt = 4;</code>
   */
  int getUserCnt();

  /**
   * <code>int32 status = 5;</code>
   */
  int getStatus();

  /**
   * <code>int32 updated = 6;</code>
   */
  int getUpdated();

  /**
   * <code>int32 created = 7;</code>
   */
  int getCreated();
}