package com.loword.java.model.vo;

import com.loword.java.kernel.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class AreaTreeVo extends BaseEntity {
    private String code;

    /*省*/
    private String name;

    /*市代码*/
    private List children;

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
