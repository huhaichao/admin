package com.irevest.niu.service.impl;

import com.irevest.niu.dao.UserTradeDao;
import com.irevest.niu.domain.UserTradeDO;
import com.irevest.niu.domain.UserTradesDO;
import com.irevest.niu.service.UserTradeService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTradeServiceImpl implements UserTradeService {
	@Autowired
	private UserTradeDao userTradeDao;

	public UserTradeDO get(Integer id) {
		/* 22 */return this.userTradeDao.get(id);
	}

	public List<UserTradeDO> list(Map<String, Object> map) {
		/* 27 */return this.userTradeDao.list(map);
	}

	public int count(Map<String, Object> map) {
		/* 32 */return this.userTradeDao.count(map);
	}

	public int save(UserTradeDO userTrade) {
		/* 37 */return this.userTradeDao.save(userTrade);
	}

	public int update(UserTradeDO userTrade) {
		/* 42 */return this.userTradeDao.update(userTrade);
	}

	public int remove(Integer id) {
		/* 47 */return this.userTradeDao.remove(id);
	}

	public int batchRemove(Integer[] ids) {
		/* 52 */return this.userTradeDao.batchRemove(ids);
	}

	@Override
	public List<UserTradesDO> listTrades(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return userTradeDao.listTrades(paramMap);
	}

	@Override
	public int countTrades(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return userTradeDao.countTrades(paramMap);
	}

}
