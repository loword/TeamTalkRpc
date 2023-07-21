package com.loword.java.service;

import java.util.List;

import com.loword.java.kernel.entity.sys_area;
import com.loword.java.model.vo.AreaVo;

public interface AreaService {
	
	sys_area getById(Integer id);

	List<sys_area> getByShortName(String name);

	List<sys_area> getByPinyin(String pinyin);

	int addArea(sys_area area);

    List<sys_area> listArea(sys_area user);

	List<AreaVo> listAreaTree(sys_area user);

    int updateArea(sys_area user);
}
