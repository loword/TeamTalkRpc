// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.grpc.user;

public interface UserResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.grpc.user.UserResponse)
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
   * <code>int32 sex = 10;</code>
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
   * <code>int32 status_id = 9;</code>
   */
  int getStatusId();

  /**
   * <code>repeated .com.grpc.user.User user = 11;</code>
   */
  java.util.List<com.grpc.user.User> 
      getUserList();
  /**
   * <code>repeated .com.grpc.user.User user = 11;</code>
   */
  com.grpc.user.User getUser(int index);
  /**
   * <code>repeated .com.grpc.user.User user = 11;</code>
   */
  int getUserCount();
  /**
   * <code>repeated .com.grpc.user.User user = 11;</code>
   */
  java.util.List<? extends com.grpc.user.UserOrBuilder> 
      getUserOrBuilderList();
  /**
   * <code>repeated .com.grpc.user.User user = 11;</code>
   */
  com.grpc.user.UserOrBuilder getUserOrBuilder(
      int index);

  /**
   * <code>string areaType = 12;</code>
   */
  java.lang.String getAreaType();
  /**
   * <code>string areaType = 12;</code>
   */
  com.google.protobuf.ByteString
      getAreaTypeBytes();

  /**
   * <code>string provinceCode = 13;</code>
   */
  java.lang.String getProvinceCode();
  /**
   * <code>string provinceCode = 13;</code>
   */
  com.google.protobuf.ByteString
      getProvinceCodeBytes();

  /**
   * <code>string cityCode = 14;</code>
   */
  java.lang.String getCityCode();
  /**
   * <code>string cityCode = 14;</code>
   */
  com.google.protobuf.ByteString
      getCityCodeBytes();

  /**
   * <code>string countyCode = 15;</code>
   */
  java.lang.String getCountyCode();
  /**
   * <code>string countyCode = 15;</code>
   */
  com.google.protobuf.ByteString
      getCountyCodeBytes();

  /**
   * <code>string county = 16;</code>
   */
  java.lang.String getCounty();
  /**
   * <code>string county = 16;</code>
   */
  com.google.protobuf.ByteString
      getCountyBytes();

  /**
   * <code>string townCode = 17;</code>
   */
  java.lang.String getTownCode();
  /**
   * <code>string townCode = 17;</code>
   */
  com.google.protobuf.ByteString
      getTownCodeBytes();

  /**
   * <code>string town = 18;</code>
   */
  java.lang.String getTown();
  /**
   * <code>string town = 18;</code>
   */
  com.google.protobuf.ByteString
      getTownBytes();

  /**
   * <code>string villageCode = 19;</code>
   */
  java.lang.String getVillageCode();
  /**
   * <code>string villageCode = 19;</code>
   */
  com.google.protobuf.ByteString
      getVillageCodeBytes();

  /**
   * <code>string mergerName = 20;</code>
   */
  java.lang.String getMergerName();
  /**
   * <code>string mergerName = 20;</code>
   */
  com.google.protobuf.ByteString
      getMergerNameBytes();

  /**
   * <code>string village = 21;</code>
   */
  java.lang.String getVillage();
  /**
   * <code>string village = 21;</code>
   */
  com.google.protobuf.ByteString
      getVillageBytes();

  /**
   * <code>int32 total = 22;</code>
   */
  int getTotal();
}
