package com.irevest.niu.dao;

import com.irevest.niu.domain.QustionOrderDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 问题订单表
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-12-13 16:11:52
 */
@Mapper
public interface QustionOrderDao {

	QustionOrderDO get(Integer id);
	
	List<QustionOrderDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(QustionOrderDO qustionOrder);
	
	int update(QustionOrderDO qustionOrder);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
