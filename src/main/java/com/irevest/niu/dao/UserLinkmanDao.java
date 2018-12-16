package com.irevest.niu.dao;

import com.irevest.niu.domain.UserLinkmanDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface UserLinkmanDao
{
  public abstract UserLinkmanDO get(Integer paramInteger);
  
  public abstract List<UserLinkmanDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(UserLinkmanDO paramUserLinkmanDO);
  
  public abstract int update(UserLinkmanDO paramUserLinkmanDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/UserLinkmanDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */