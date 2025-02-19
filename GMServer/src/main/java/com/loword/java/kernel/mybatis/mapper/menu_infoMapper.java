package com.loword.java.kernel.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.loword.java.kernel.entity.menu_info;

import java.util.List;

@Repository
public interface menu_infoMapper {

    menu_info selectById(@Param("id") Integer id);

    menu_info selectByName(@Param("name") String userName);

    menu_info selectByUrl(@Param("url") String userName);

    List<menu_info> selectAll();

    int insertSelective(menu_info record);

    int deleteByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(menu_info record);
}