package com.loword.java.service;


import java.util.List;

import com.loword.java.kernel.entity.IMUser;

/**
 * Created by wx on 2017/10/27.
 */
public interface IUserService  {

    IMUser getUserById(Integer id);

    IMUser getUserByName(String name);

    List<IMUser> getAllUser();

    Boolean addUser(IMUser user);

    Boolean deleteUser(Integer id);

    Boolean updateUser(IMUser user);

    Boolean updatePassword(IMUser user);

}
