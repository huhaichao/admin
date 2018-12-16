package com.irevest.home.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.irevest.home.domain.AboutDO;

/**
 * 关于我们
 * @author yxx
 * @date 2018-07-10
 *
 */
@Mapper
public interface AboutDao {
	
	AboutDO getType(String type);

	AboutDO get(Long cid);
	
	List<AboutDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(AboutDO about);
	
	int update(AboutDO about);
	
	int remove(Long cid);
	
	int batchRemove(Long[] cids);
}
