package com.irevest.niu.dao;

import com.irevest.niu.domain.UserDepositDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface UserDepositDao
{
  public abstract UserDepositDO get(Integer paramInteger);
  
  public abstract List<UserDepositDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(UserDepositDO paramUserDepositDO);
  
  public abstract int update(UserDepositDO paramUserDepositDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/UserDepositDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */