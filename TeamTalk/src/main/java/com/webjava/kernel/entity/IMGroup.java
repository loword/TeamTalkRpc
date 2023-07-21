package com.webjava.kernel.entity;

public class IMGroup {
    private Integer id;

    private String name="";

    private String avatar="";

    private Integer creator=0 ;

    private Byte type=0;

    private Integer userCnt;

    private Byte status=0;

    private Integer version=0;

    private Integer lastChated=0;

    private Integer updated=0;

    private Integer created=0;

    public IMGroup(){

    }

    public IMGroup(Integer id, String name, String avatar, Integer creator, Byte type, Integer userCnt, Byte status, Integer version, Integer lastChated, Integer updated, Integer created) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.creator = creator;
        this.type = type;
        this.userCnt = userCnt;
        this.status = status;
        this.version = version;
        this.lastChated = lastChated;
        this.updated = updated;
        this.created = created;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public void setuserCnt(Integer userCnt) {
        this.userCnt = userCnt;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setlastChated(Integer lastChated) {
        this.lastChated = lastChated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAvatar() {
        return avatar;
    }

    public Integer getCreator() {
        return creator;
    }

    public Byte getType() {
        return type;
    }

    public Integer getUserCnt() {
        return userCnt;
    }

    public Byte getStatus() {
        return status;
    }

    public Integer getVersion() {
        return version;
    }

    public Integer getlastChated() {
        return lastChated;
    }

    public Integer getUpdated() {
        return updated;
    }

    public Integer getCreated() {
        return created;
    }
}