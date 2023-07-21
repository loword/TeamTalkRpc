package com.loword.java.kernel.entity;

public class IMGroupMember {
    private Integer id;

    private Integer groupid;

    private Integer userid;

    private Integer status;

    private Integer created;

    private Integer updated;

    public IMGroupMember(){

    }

    public IMGroupMember(Integer id, Integer groupid, Integer userid, Integer status, Integer created, Integer updated) {
        this.id = id;
        this.groupid = groupid;
        this.userid = userid;
        this.status = status;
        this.created = created;
        this.updated = updated;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public Integer getId() {
        return id;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public Integer getUserid() {
        return userid;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getCreated() {
        return created;
    }

    public Integer getUpdated() {
        return updated;
    }
}