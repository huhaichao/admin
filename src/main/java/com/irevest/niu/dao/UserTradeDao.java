package com.irevest.niu.dao;

import com.irevest.niu.domain.UserTradeDO;
import com.irevest.niu.domain.UserTradesDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface UserTradeDao
{
  public abstract UserTradeDO get(Integer paramInteger);
  
  public abstract List<UserTradeDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(UserTradeDO paramUserTradeDO);
  
  public abstract int update(UserTradeDO paramUserTradeDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
  
  public abstract List<UserTradesDO> listTrades(Map<String, Object> paramMap);
  
  public abstract int countTrades(Map<String, Object> paramMap);
}
