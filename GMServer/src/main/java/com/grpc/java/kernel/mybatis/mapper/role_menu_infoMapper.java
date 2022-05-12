package com.grpc.java.kernel.mybatis.mapper;

import com.grpc.java.kernel.entity.role_menu_info;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface role_menu_infoMapper {
    role_menu_info selectById(@Param("id") Integer id);

    role_menu_info selectByMenuId(@Param("id") Integer id);

    role_menu_info selectByRoleId(@Param("id") Integer id);

    List<role_menu_info> selectAll();

    int insertSelective(role_menu_info record);

    int deleteByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(role_menu_info record);
}