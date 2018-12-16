package com.irevest.niu.service;

import com.irevest.niu.domain.BusinessDO;
import java.util.List;
import java.util.Map;

public abstract interface BusinessService
{
  public abstract BusinessDO get(Integer paramInteger);
  
  public abstract BusinessDO getBusiness(Integer paramInteger);
  
  public abstract List<BusinessDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(BusinessDO paramBusinessDO);
  
  public abstract int update(BusinessDO paramBusinessDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/BusinessService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */