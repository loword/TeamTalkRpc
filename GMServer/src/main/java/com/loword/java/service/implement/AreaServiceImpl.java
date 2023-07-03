package com.loword.java.service.implement;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loword.java.kernel.entity.sys_area;
import com.loword.java.kernel.mybatis.mapper.SysAreaMapper;
import com.loword.java.service.AreaService;

/**
 * 
 * @author loword
 *
 */
@Service("areaService")
public class AreaServiceImpl implements AreaService {

    @Resource
    private SysAreaMapper areaMapper;
	
	@Override
	public sys_area getById(Integer areaId) {
		return areaMapper.selectById(areaId);
	}

	@Override
	public List<sys_area> getByShortName(String shortName) {
		return areaMapper.selectByShortName(shortName);
	}

	@Override
	public List<sys_area> getByPinyin(String pinyin) {
		return areaMapper.selectByPingYin(pinyin);
	}

	@Override
	public int addArea(sys_area area) {
		area.setStatus(0);
		area.setCreateTime(LocalDateTime.now());
		return areaMapper.insertSysArea(area);
	}

	@Override
	public List<sys_area> listArea(sys_area area) {
		return areaMapper.selectAll(area);
	}

	@Override
	public int updateArea(sys_area area) {
		area.setUpdateTime(LocalDateTime.now());
		return areaMapper.updateSysArea(area);
	}

}
