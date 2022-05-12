package com.grpc.java.service;


import com.grpc.java.kernel.entity.role_menu_info;

import java.util.List;

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
