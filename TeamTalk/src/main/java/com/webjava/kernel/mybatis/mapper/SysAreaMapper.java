package com.webjava.kernel.mybatis.mapper;

import com.webjava.kernel.entity.SysArea;
import com.webjava.model.vo.AreaVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysAreaMapper {

    List<AreaVo> selectAreaTree(SysArea record);
}
