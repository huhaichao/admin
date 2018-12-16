package com.irevest.home.service;

import com.irevest.home.domain.SyTeamDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-07-11 10:05:08
 */
public interface SyTeamService {
	
	SyTeamDO get(Integer tSyId);
	
	List<SyTeamDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SyTeamDO syTeam);
	
	int update(SyTeamDO syTeam);
	
	int remove(Integer tSyId);
	
	int batchRemove(Integer[] tSyIds);
	
	List<SyTeamDO> allList();
}
