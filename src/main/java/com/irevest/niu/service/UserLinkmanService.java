package com.irevest.niu.service;

import com.irevest.niu.domain.UserLinkmanDO;
import java.util.List;
import java.util.Map;

public abstract interface UserLinkmanService
{
  public abstract UserLinkmanDO get(Integer paramInteger);
  
  public abstract List<UserLinkmanDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(UserLinkmanDO paramUserLinkmanDO);
  
  public abstract int update(UserLinkmanDO paramUserLinkmanDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/UserLinkmanService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */