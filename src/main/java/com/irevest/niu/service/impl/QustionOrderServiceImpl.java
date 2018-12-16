package com.irevest.niu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.irevest.niu.dao.QustionOrderDao;
import com.irevest.niu.domain.QustionOrderDO;
import com.irevest.niu.service.QustionOrderService;



@Service
public class QustionOrderServiceImpl implements QustionOrderService {
	@Autowired
	private QustionOrderDao qustionOrderDao;
	
	@Override
	public QustionOrderDO get(Integer id){
		return qustionOrderDao.get(id);
	}
	
	@Override
	public List<QustionOrderDO> list(Map<String, Object> map){
		return qustionOrderDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return qustionOrderDao.count(map);
	}
	
	@Override
	public int save(QustionOrderDO qustionOrder){
		return qustionOrderDao.save(qustionOrder);
	}
	
	@Override
	public int update(QustionOrderDO qustionOrder){
		return qustionOrderDao.update(qustionOrder);
	}
	
	@Override
	public int remove(Integer id){
		return qustionOrderDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return qustionOrderDao.batchRemove(ids);
	}
	
}
