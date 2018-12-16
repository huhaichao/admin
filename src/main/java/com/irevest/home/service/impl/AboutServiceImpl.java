package com.irevest.home.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.irevest.home.dao.AboutDao;
import com.irevest.home.domain.AboutDO;
import com.irevest.home.service.AboutService;




@Service
public class AboutServiceImpl implements AboutService {
	@Autowired
	private AboutDao bAboutMapper;
	
	@Override
	public AboutDO get(Long cid){
		return bAboutMapper.get(cid);
	}
	
	@Override
	public List<AboutDO> list(Map<String, Object> map){
		return bAboutMapper.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return bAboutMapper.count(map);
	}
	
	@Override
	public int save(AboutDO bAbout){
		return bAboutMapper.save(bAbout);
	}
	
	@Override
	public int update(AboutDO bAbout){
		return bAboutMapper.update(bAbout);
	}
	
	@Override
	public int remove(Long cid){
		return bAboutMapper.remove(cid);
	}
	
	@Override
	public int batchRemove(Long[] cids){
		return bAboutMapper.batchRemove(cids);
	}

	@Override
	public AboutDO getType(String type) {
		return bAboutMapper.getType(type);
	}
	
}
