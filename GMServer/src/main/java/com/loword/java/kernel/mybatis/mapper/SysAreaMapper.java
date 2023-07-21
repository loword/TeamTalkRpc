package com.loword.java.kernel.mybatis.mapper;

import java.util.List;

import com.loword.java.model.vo.AreaVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.loword.java.kernel.entity.sys_area;

@Repository
public interface SysAreaMapper {

	sys_area selectById(@Param("id") Integer id);

	List<sys_area> selectByPingYin(@Param("pingyin") String pingyin);

    List<sys_area> selectByShortName(@Param("shortName") String shortName);

    List<sys_area> selectByPosition(@Param("lng") Float lng,@Param("lat") Float lat);

    List<sys_area> selectAll(sys_area record);

    List<AreaVo> selectAreaTree(sys_area record);

    int insertSysArea(sys_area record);

    int updateSysArea(sys_area record);
}
