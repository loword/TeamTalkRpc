package com.loword.java.kernel.entity;

public class user_area {

    /**
     * 主键
     */
    private Integer id;

	/**
	 * 关联用户主键
	 */
	private Integer userId;

    /**
     * 地址类型
     */
    private Integer areaType;

	/**
	 * 原地址类型
	 */
	private Integer normalAreaType;

    /**
     * 省级行政代码
     */
    private String provinceCode;

    /**
     * 市行政代码
     */
    private String cityCode;

    /**
     * 区县行政代码
     */
    private String countyCode;

	/**
	 * 区县
	 */
	private String county;

    /**
     * 乡镇行政代码
     */
    private String townCode;

	/**
	 * 乡镇
	 */
	private String town;

	/**
	 * 村行政代码
	 */
	private String villageCode;

    /**
     * 村名称
     */
    private String village;

	/**
	 * 邮政编码
	 */
	private String zipCode;

	/**
	 * 区号
	 */
	private String telphoneCode;

	/**
	 * 详细名称
	 */
	private String detailName;

    /**
     * 简称
     */
    private String shortName;

    /**
     * 组合名
     */
    private String mergerName;

    /**
     * 拼音
     */
    private String pinyin;

    /**
     * 经度
     */
    private Float lng;

    /**
     * 纬度
     */
    private Float lat;

	/**
	 * 是否默认
	 */
	private Integer isDefault;
    /**
     *
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;
    
    /**
     * 创建时间
     */
    private Integer createTime;
    
    /**
     * 创建人
     */
    private Integer createUser;

    /**
     * 修改时间
     */
    private Integer updateTime;
    
    /**
     * 修改人
     */
    private Integer updateUser;
    
	public Integer getId() {
		return id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getNormalAreaType() {
		return normalAreaType;
	}

	public void setNormalAreaType(Integer normalAreaType) {
		this.normalAreaType = normalAreaType;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAreaType() {
		return areaType;
	}

	public void setAreaType(Integer type) {
		this.areaType = type;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getTelphoneCode() {
		return telphoneCode;
	}

	public void setTelphoneCode(String telphoneCode) {
		this.telphoneCode = telphoneCode;
	}

	public String getDetailName() {
		return detailName;
	}

	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getMergerName() {
		return mergerName;
	}

	public void setMergerName(String mergerName) {
		this.mergerName = mergerName;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public Float getLng() {
		return lng;
	}

	public void setLng(Float lng) {
		this.lng = lng;
	}

	public Float getLat() {
		return lat;
	}

	public void setLat(Float lat) {
		this.lat = lat;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Integer getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}
}
