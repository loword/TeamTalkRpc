package com.webjava.model;

public class menu_info {
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer parentId;

    public menu_info(){

    }

    public menu_info(Integer menuId, String menuName, String menuUrl, Integer parentId) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.parentId = parentId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}