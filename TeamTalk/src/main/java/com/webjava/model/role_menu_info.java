package com.webjava.model;

public class role_menu_info {
    private Integer id;

    private Integer roleId;

    private Integer menuId;

    public role_menu_info(){

    }

    public role_menu_info(Integer id, Integer roleId, Integer menuId) {
        this.id = id;
        this.roleId = roleId;
        this.menuId = menuId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}