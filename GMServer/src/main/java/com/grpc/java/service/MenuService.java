package com.grpc.java.service;


import com.grpc.java.kernel.entity.menu_info;

import java.util.List;

/**
 * Created by wx on 2017/10/27.
 */
public interface MenuService {

    menu_info getId(Integer id);

    menu_info getName(String name);

    menu_info getUrl(String url);

    Boolean add(menu_info user);

    List<menu_info> getAll();

    Boolean delete(Integer id);

    Boolean update(menu_info user);

}
