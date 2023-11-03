package com.loword.java.service;



import java.util.List;

import com.loword.java.kernel.entity.IMGroup;

/**
 * Created by wx on 2017/10/27.
 */
public interface IGroupService {

    IMGroup getGroupById(Integer id);

    IMGroup getGroupByName(String name);

    List<IMGroup> getAllGroup();

    Boolean addGroup(IMGroup user);

    Boolean deleteGroup(Integer id);

    Boolean updateGroup(IMGroup user);

    IMGroup getAreaGroup(String name);

}
