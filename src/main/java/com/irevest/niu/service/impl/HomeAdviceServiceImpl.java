package com.irevest.niu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.irevest.niu.dao.HomeAdviceDao;
import com.irevest.niu.domain.HomeAdviceDO;
import com.irevest.niu.service.HomeAdviceService;



@Service
public class HomeAdviceServiceImpl implements HomeAdviceService {
	@Autowired
	private HomeAdviceDao homeAdviceDao;
	
	@Override
	public HomeAdviceDO get(Long cid){
		return homeAdviceDao.get(cid);
	}
	
	@Override
	public List<HomeAdviceDO> list(Map<String, Object> map){
		return homeAdviceDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return homeAdviceDao.count(map);
	}
	
	@Override
	public int save(HomeAdviceDO homeAdvice){
		return homeAdviceDao.save(homeAdvice);
	}
	
	@Override
	public int update(HomeAdviceDO homeAdvice){
		return homeAdviceDao.update(homeAdvice);
	}
	
	@Override
	public int remove(Long cid){
		return homeAdviceDao.remove(cid);
	}
	
	@Override
	public int batchRemove(Long[] cids){
		return homeAdviceDao.batchRemove(cids);
	}
	
}
