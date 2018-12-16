package com.irevest.niu.dao;

import com.irevest.niu.domain.HomeStationDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 网站内容
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-12-11 14:10:07
 */
@Mapper
public interface HomeStationDao {

	HomeStationDO get(Long cid);
	
	List<HomeStationDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(HomeStationDO homeStation);
	
	int update(HomeStationDO homeStation);
	
	int remove(Long cid);
	
	int batchRemove(Long[] cids);
}
