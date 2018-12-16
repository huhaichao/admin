package com.irevest.niu.service;

import com.irevest.niu.domain.RobOrderDO;
import java.util.List;
import java.util.Map;

public abstract interface RobOrderService
{
  public abstract RobOrderDO get(Integer paramInteger);
  
  public abstract List<RobOrderDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(RobOrderDO paramRobOrderDO);
  
  public abstract int update(RobOrderDO paramRobOrderDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
  
  public abstract int removeOr(String paramString1, String paramString2);
  
  public abstract RobOrderDO getEntity(String paramString1, String paramString2);
  
  public abstract List<RobOrderDO> getEntitys(String paramString);
  
  public abstract int getCheckcount(String paramString);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/RobOrderService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */