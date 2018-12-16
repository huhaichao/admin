package com.irevest.niu.dao;

import com.irevest.niu.domain.UserBackDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface UserBackDao
{
  public abstract UserBackDO get(Integer paramInteger);
  
  public abstract List<UserBackDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(UserBackDO paramUserBackDO);
  
  public abstract int update(UserBackDO paramUserBackDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/UserBackDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */