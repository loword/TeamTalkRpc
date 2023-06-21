package com.loword.java.service;


import java.util.List;

import com.loword.java.kernel.entity.role_info;

/**
 * Created by wx on 2017/10/27.
 */
public interface RoleService {

    role_info getId(Integer id);

    role_info getName(String name);

    Boolean add(role_info user);

    List<role_info> getAll();

    Boolean delete(Integer id);

    Boolean update(role_info user);

}
