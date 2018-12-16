package com.irevest.home.dao;

import com.irevest.home.domain.SyTeamDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-07-11 10:05:08
 */
@Mapper
public interface SyTeamDao {

	SyTeamDO get(Integer tSyId);
	
	List<SyTeamDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(SyTeamDO syTeam);
	
	int update(SyTeamDO syTeam);
	
	int remove(Integer T_SY_ID);
	
	int batchRemove(Integer[] tSyIds);
	
	List<SyTeamDO> allList();
}
