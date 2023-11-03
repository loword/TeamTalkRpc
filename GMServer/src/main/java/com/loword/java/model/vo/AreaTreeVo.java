package com.loword.java.model.vo;

import com.loword.java.kernel.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class AreaTreeVo extends BaseEntity {
    private String id;

    private String code;

    /*名称*/
    private String name;

    /*区域树*/
    private List<AreaTreeVo> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

}
