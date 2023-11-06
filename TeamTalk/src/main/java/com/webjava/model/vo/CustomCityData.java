package com.webjava.model.vo;

import java.util.ArrayList;
import java.util.List;

public class CustomCityData {
    private String id;
    private String name;
    private List<CustomCityData> list = new ArrayList();

    public CustomCityData() {
    }

    public String toString() {
        return this.name;
    }

    public CustomCityData(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CustomCityData> getList() {
        return this.list;
    }

    public void setList(List<CustomCityData> list) {
        this.list = list;
    }
}