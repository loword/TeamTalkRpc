// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manager.proto

package com.grpc.manager;

public interface ManagerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.grpc.manager.ManagerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 role_id = 7;</code>
   */
  java.util.List<java.lang.Integer> getRoleIdList();
  /**
   * <code>repeated int32 role_id = 7;</code>
   */
  int getRoleIdCount();
  /**
   * <code>repeated int32 role_id = 7;</code>
   */
  int getRoleId(int index);

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string username = 2;</code>
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 2;</code>
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string password = 3;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 3;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string token = 4;</code>
   */
  java.lang.String getToken();
  /**
   * <code>string token = 4;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <code>string introduction = 9;</code>
   */
  java.lang.String getIntroduction();
  /**
   * <code>string introduction = 9;</code>
   */
  com.google.protobuf.ByteString
      getIntroductionBytes();

  /**
   * <code>string avatar = 8;</code>
   */
  java.lang.String getAvatar();
  /**
   * <code>string avatar = 8;</code>
   */
  com.google.protobuf.ByteString
      getAvatarBytes();

  /**
   * <code>repeated .com.grpc.manager.Manager manager = 5;</code>
   */
  java.util.List<com.grpc.manager.Manager> 
      getManagerList();
  /**
   * <code>repeated .com.grpc.manager.Manager manager = 5;</code>
   */
  com.grpc.manager.Manager getManager(int index);
  /**
   * <code>repeated .com.grpc.manager.Manager manager = 5;</code>
   */
  int getManagerCount();
  /**
   * <code>repeated .com.grpc.manager.Manager manager = 5;</code>
   */
  java.util.List<? extends com.grpc.manager.ManagerOrBuilder> 
      getManagerOrBuilderList();
  /**
   * <code>repeated .com.grpc.manager.Manager manager = 5;</code>
   */
  com.grpc.manager.ManagerOrBuilder getManagerOrBuilder(
      int index);
}
