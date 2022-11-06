// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.user.grpc;

public interface UserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.user.grpc.UserRequest)
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
   * <code>int32 sex = 9;</code>
   */
  int getSex();

  /**
   * <code>string nick = 3;</code>
   */
  java.lang.String getNick();
  /**
   * <code>string nick = 3;</code>
   */
  com.google.protobuf.ByteString
      getNickBytes();

  /**
   * <code>string password = 4;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 4;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string salt = 5;</code>
   */
  java.lang.String getSalt();
  /**
   * <code>string salt = 5;</code>
   */
  com.google.protobuf.ByteString
      getSaltBytes();

  /**
   * <code>string phone = 6;</code>
   */
  java.lang.String getPhone();
  /**
   * <code>string phone = 6;</code>
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <code>string email = 7;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 7;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>int32 departid = 8;</code>
   */
  int getDepartid();

  /**
   * <code>repeated .com.user.grpc.User user = 10;</code>
   */
  java.util.List<com.user.grpc.User> 
      getUserList();
  /**
   * <code>repeated .com.user.grpc.User user = 10;</code>
   */
  com.user.grpc.User getUser(int index);
  /**
   * <code>repeated .com.user.grpc.User user = 10;</code>
   */
  int getUserCount();
  /**
   * <code>repeated .com.user.grpc.User user = 10;</code>
   */
  java.util.List<? extends com.user.grpc.UserOrBuilder> 
      getUserOrBuilderList();
  /**
   * <code>repeated .com.user.grpc.User user = 10;</code>
   */
  com.user.grpc.UserOrBuilder getUserOrBuilder(
      int index);
}
