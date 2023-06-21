package com.loword.java.service;


import java.util.List;

import com.loword.java.kernel.entity.menu_info;

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
