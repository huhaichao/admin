package com.irevest.niu.service;

import com.irevest.niu.domain.QustionOrderDO;

import java.util.List;
import java.util.Map;

/**
 * 问题订单表
 * 
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-12-13 16:11:52
 */
public interface QustionOrderService {
	
	QustionOrderDO get(Integer id);
	
	List<QustionOrderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(QustionOrderDO qustionOrder);
	
	int update(QustionOrderDO qustionOrder);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
