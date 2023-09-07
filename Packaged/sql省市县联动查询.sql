SELECT a.area_code province_code,a.short_name province,b.area_code city_code,b.short_name city,
c.area_code county_code,c.short_name county,d.area_code village_code,d.short_name village 
FROM sys_area a 
INNER JOIN sys_area b ON a.area_code=b.parent_code
INNER JOIN sys_area c ON b.area_code=c.parent_code
INNER JOIN sys_area d ON c.area_code=d.parent_code
WHERE d.short_name = '中卫'
AND d.level_code = 4;



	SELECT a.area_code province_code, a.short_name province, b.area_code city_code, b.short_name city,
	  c.area_code county_code, c.short_name county, d.area_code town_code, d.short_name town,
	  e.area_code village_code,e.short_name village
	FROM sys_area a
	INNER JOIN sys_area b ON a.area_code=b.parent_code
	INNER JOIN sys_area c ON b.area_code=c.parent_code
	INNER JOIN sys_area d ON c.area_code=d.parent_code
	INNER JOIN sys_area e ON d.area_code=e.parent_code
	WHERE a.status = 0
	<if test="id != null">
	  and a.id = #{id}
	</if>
	<if test="levelCode != null">
	  and a.level_code = #{levelCode}
	</if>
  	<if test="parentCode != null and parentCode != ''">
  		and a.parent_code = #{parentCode}
  	</if>
  	<if test="areaCode != null and areaCode != ''">
  		and e.area_code = #{areaCode}
  	</if>
  	<if test="name != null and name != ''">
  		and a.name = #{name}
  	</if>
  	<if test="shortName != null and shortName != ''">
  		and e.short_name = #{shortName}
  	</if>
  	<if test="pinyin != null and pinyin != ''">
  		and e.pinyin = #{pinyin}
  	</if>
  	<if test="lng != null and lng != 0">
  		and e.lng &gt; #{lng} -1 and e.lng &lt; #{lng}+1
  	</if>
  	<if test="lat != null and lat != 0">
  		and e.lat &gt; #{lat} -1 and e.lat &lt; #{lat}+1
  	</if>