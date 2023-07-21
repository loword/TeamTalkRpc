package com.loword.java.service.implement;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Resource;

import com.loword.java.model.vo.AreaVo;
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
		int timeNow = (int) (System.currentTimeMillis()/1000);
		area.setCreateTime(timeNow);
		return areaMapper.insertSysArea(area);
	}

	@Override
	public List<sys_area> listArea(sys_area area) {
		if(area.getLevelCode() == null) {
			area.setLevelCode(0);
		}
		return areaMapper.selectAll(area);
	}

	@Override
	public List<AreaVo> listAreaTree(sys_area area) {
		return areaMapper.selectAreaTree(area);
	}

	@Override
	public int updateArea(sys_area area) {
		int timeNow = (int) (System.currentTimeMillis()/1000);
		area.setUpdateTime(timeNow);
		return areaMapper.updateSysArea(area);
	}

}
