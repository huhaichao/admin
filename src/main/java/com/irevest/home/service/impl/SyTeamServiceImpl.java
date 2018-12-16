package com.irevest.home.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.irevest.home.dao.SyTeamDao;
import com.irevest.home.domain.SyTeamDO;
import com.irevest.home.service.SyTeamService;



@Service
public class SyTeamServiceImpl implements SyTeamService {
	@Autowired
	private SyTeamDao syTeamDao;
	
	@Override
	public SyTeamDO get(Integer tSyId){
		return syTeamDao.get(tSyId);
	}
	
	@Override
	public List<SyTeamDO> list(Map<String, Object> map){
		return syTeamDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return syTeamDao.count(map);
	}
	
	@Override
	public int save(SyTeamDO syTeam){
		return syTeamDao.save(syTeam);
	}
	
	@Override
	public int update(SyTeamDO syTeam){
		return syTeamDao.update(syTeam);
	}
	
	@Override
	public int remove(Integer tSyId){
		return syTeamDao.remove(tSyId);
	}
	
	@Override
	public int batchRemove(Integer[] tSyIds){
		return syTeamDao.batchRemove(tSyIds);
	}

	@Override
	public List<SyTeamDO> allList() {
		// TODO Auto-generated method stub
		return syTeamDao.allList();
	}


	
}
