// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.grpc.user;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.grpc.user.User)
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
   * <code>int32 sex = 3;</code>
   */
  int getSex();

  /**
   * <code>string domain = 4;</code>
   */
  java.lang.String getDomain();
  /**
   * <code>string domain = 4;</code>
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <code>string nick = 5;</code>
   */
  java.lang.String getNick();
  /**
   * <code>string nick = 5;</code>
   */
  com.google.protobuf.ByteString
      getNickBytes();

  /**
   * <code>string password = 6;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 6;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string salt = 7;</code>
   */
  java.lang.String getSalt();
  /**
   * <code>string salt = 7;</code>
   */
  com.google.protobuf.ByteString
      getSaltBytes();

  /**
   * <code>string phone = 8;</code>
   */
  java.lang.String getPhone();
  /**
   * <code>string phone = 8;</code>
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <code>string email = 9;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 9;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>int32 departid = 10;</code>
   */
  int getDepartid();

  /**
   * <code>string avatar = 11;</code>
   */
  java.lang.String getAvatar();
  /**
   * <code>string avatar = 11;</code>
   */
  com.google.protobuf.ByteString
      getAvatarBytes();

  /**
   * <code>int32 status = 12;</code>
   */
  int getStatus();

  /**
   * <code>int32 created = 13;</code>
   */
  int getCreated();

  /**
   * <code>int32 updated = 14;</code>
   */
  int getUpdated();

  /**
   * <code>int32 push_shield_status = 15;</code>
   */
  int getPushShieldStatus();

  /**
   * <code>string sign_info = 16;</code>
   */
  java.lang.String getSignInfo();
  /**
   * <code>string sign_info = 16;</code>
   */
  com.google.protobuf.ByteString
      getSignInfoBytes();
}
