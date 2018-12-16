package com.irevest.niu.service;

import com.irevest.niu.domain.SiteDO;
import java.util.List;
import java.util.Map;

public abstract interface SiteService
{
  public abstract SiteDO get(Integer paramInteger);
  
  public abstract List<SiteDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(SiteDO paramSiteDO);
  
  public abstract int update(SiteDO paramSiteDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
  
  public abstract int removeAll();
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/SiteService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */