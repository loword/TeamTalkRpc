package com.loword.java.service;


import java.util.List;
import java.util.Map;

import com.loword.java.kernel.entity.IMUser;
import com.loword.java.kernel.entity.user_area;

/**
 * Created by wx on 2017/10/27.
 */
public interface IUserService  {

    IMUser getUserById(Integer id);

    IMUser getUserByName(String name);

    public int getCountUser();

    List<IMUser> getAllUser(Map<String, Object> columnMap);

    List<IMUser> getAllUser();

    Boolean addUser(IMUser user, user_area uArea);

    Boolean deleteUser(Integer id);

    Boolean updateUser(IMUser user, user_area uArea);

    Boolean updatePassword(IMUser user);

}
