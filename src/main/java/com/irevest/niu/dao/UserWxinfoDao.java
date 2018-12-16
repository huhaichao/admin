package com.irevest.niu.dao;

import com.irevest.niu.domain.UserWxinfoDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface UserWxinfoDao
{
  public abstract UserWxinfoDO get(Integer paramInteger);
  
  public abstract List<UserWxinfoDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(UserWxinfoDO paramUserWxinfoDO);
  
  public abstract int update(UserWxinfoDO paramUserWxinfoDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/UserWxinfoDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */