package com.loword.java.service;


import java.util.List;

import com.loword.java.kernel.entity.role_menu_info;

/**
 * Created by wx on 2017/10/27.
 */
public interface Role_MenuService {

    role_menu_info getId(Integer id);

    role_menu_info getMenuId(Integer id);

    role_menu_info getRoleId(Integer id);

    List<role_menu_info> getAll();

    Boolean add(role_menu_info user);

    Boolean delete(Integer id);

    Boolean update(role_menu_info user);

}
