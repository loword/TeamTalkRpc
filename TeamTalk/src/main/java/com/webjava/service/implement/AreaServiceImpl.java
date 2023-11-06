package com.webjava.service.implement;

import com.webjava.kernel.mybatis.mapper.SysAreaMapper;
import com.webjava.kernel.entity.SysArea;
import com.webjava.service.AreaService;
import com.webjava.model.vo.AreaVo;
import com.webjava.model.vo.CustomCityData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
	public List<CustomCityData> listAreaTree(SysArea area){
		List<AreaVo> areaList = areaMapper.selectAreaTree(area);
		CustomCityData villageVo = new CustomCityData();
		List<CustomCityData> villageList = new ArrayList<CustomCityData>();
		CustomCityData townVo = new CustomCityData();
		List<CustomCityData> townList = new ArrayList<CustomCityData>();
		CustomCityData countyVo = new CustomCityData();
		List<CustomCityData> countyList = new ArrayList<CustomCityData>();
		for(int i=0; i<areaList.size(); i++){
			AreaVo ri = areaList.get(i);

			if(townVo.getId() == null) {  //首行乡镇添加数据
				villageVo.setId(ri.getVillageCode());
				villageVo.setName(ri.getVillage());
				villageList.add(villageVo);

				townVo = new CustomCityData();
				townVo.setId(ri.getTownCode());
				townVo.setName(ri.getTown());
				townVo.setList(villageList);
				townList.add(townVo);
			} else if (!ri.getTownCode().equals(townVo.getId()) && ri.getCountyCode().equals(countyVo.getId())) {  //判断不同乡镇主要逻辑
				if (villageList.size() > 0) { //不同乡镇保留数据
					villageList =  new ArrayList<CustomCityData>();
					CustomCityData villageVo1 = new CustomCityData();
					villageVo1.setId(ri.getVillageCode());
					villageVo1.setName(ri.getVillage());
					villageList.add(villageVo1);
				}

				townVo = new CustomCityData();
				townVo.setId(ri.getTownCode());
				townVo.setName(ri.getTown());
				townVo.setList(villageList);
				townList.add(townVo);
			} else if (ri.getTownCode().equals(townVo.getId()) && ri.getCountyCode().equals(countyVo.getId())) { //相同乡镇统一归类
				villageVo = new CustomCityData();
				villageVo.setId(ri.getVillageCode());
				villageVo.setName(ri.getVillage());
				villageList.add(villageVo);
			}

			if(countyVo.getId() == null) {
				countyVo = new CustomCityData();
				countyVo.setId(ri.getCountyCode());
				countyVo.setName(ri.getCounty());
				countyVo.setList(townList);
				countyList.add(countyVo);
			} else if(!ri.getCountyCode().equals(countyVo.getId())) {
				if (townList.size() > 0) {
					townList = new ArrayList<CustomCityData>();
					CustomCityData townVo1 = new CustomCityData();
					townVo1.setId(ri.getTownCode());
					townVo1.setName(ri.getTown());
					townList.add(townVo1);
				}

				countyVo = new CustomCityData();
				countyVo.setId(ri.getCountyCode());
				countyVo.setName(ri.getCounty());
				countyVo.setList(townList);
				countyList.add(countyVo);
			}
		}
		return countyList;
	}

}

