package com.irevest.niu.service;

import com.irevest.niu.domain.NiuNotifyDO;
import java.util.List;
import java.util.Map;

public abstract interface NiuNotifyService
{
  public abstract NiuNotifyDO get(Integer paramInteger);
  
  public abstract List<NiuNotifyDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(NiuNotifyDO paramNiuNotifyDO);
  
  public abstract int update(NiuNotifyDO paramNiuNotifyDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/NiuNotifyService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */