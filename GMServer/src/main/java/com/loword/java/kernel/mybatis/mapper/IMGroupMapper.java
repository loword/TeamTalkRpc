package com.loword.java.kernel.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.loword.java.kernel.entity.IMGroup;

import java.util.List;

@Repository
public interface IMGroupMapper {
    IMGroup selectGroupById(@Param("id") Integer Id);

    IMGroup selectGroupByName(@Param("name") String Name);

    List<IMGroup> selectAllGroup();

    int deleteByPrimaryKey(@Param("id") Integer id);

    int insertSelective(IMGroup record);

    int updateByPrimaryKeySelective(IMGroup record);

    IMGroup selectAreaGroup(@Param("name") String Name);
}