package com.irevest.niu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.irevest.niu.dao.HomeStationDao;
import com.irevest.niu.domain.HomeStationDO;
import com.irevest.niu.service.HomeStationService;



@Service
public class HomeStationServiceImpl implements HomeStationService {
	@Autowired
	private HomeStationDao homeStationDao;
	
	@Override
	public HomeStationDO get(Long cid){
		return homeStationDao.get(cid);
	}
	
	@Override
	public List<HomeStationDO> list(Map<String, Object> map){
		return homeStationDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return homeStationDao.count(map);
	}
	
	@Override
	public int save(HomeStationDO homeStation){
		return homeStationDao.save(homeStation);
	}
	
	@Override
	public int update(HomeStationDO homeStation){
		return homeStationDao.update(homeStation);
	}
	
	@Override
	public int remove(Long cid){
		return homeStationDao.remove(cid);
	}
	
	@Override
	public int batchRemove(Long[] cids){
		return homeStationDao.batchRemove(cids);
	}
	
}
