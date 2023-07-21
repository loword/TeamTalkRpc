package com.loword.java.model.vo;

import com.loword.java.kernel.entity.BaseEntity;

public class AreaVo extends BaseEntity {
    /*省代码*/
    private String provinceCode;

    /*省*/
    private String province;

    /*市代码*/
    private String cityCode;

    /*市*/
    private String city;

    /*县代码*/
    private String countyCode;

    /*县*/
    private String county;

    /*乡代码*/
    private String townCode;

    /*乡*/
    private String town;

    /*村代码*/
    private String villageCode;

    /*村*/
    private String village;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public static class AreaTreeVo {
    }
}
