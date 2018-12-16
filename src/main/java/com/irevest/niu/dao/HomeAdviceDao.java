package com.irevest.niu.dao;

import com.irevest.niu.domain.HomeAdviceDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 意见信息表
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-12-11 23:32:43
 */
@Mapper
public interface HomeAdviceDao {

	HomeAdviceDO get(Long cid);
	
	List<HomeAdviceDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(HomeAdviceDO homeAdvice);
	
	int update(HomeAdviceDO homeAdvice);
	
	int remove(Long cid);
	
	int batchRemove(Long[] cids);
}
