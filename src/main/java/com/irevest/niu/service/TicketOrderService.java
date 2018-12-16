package com.irevest.niu.service;

import com.irevest.niu.domain.TicketOrderDO;
import java.util.List;
import java.util.Map;

public abstract interface TicketOrderService
{
  public abstract TicketOrderDO get(Integer paramInteger);
  
  public abstract List<TicketOrderDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(TicketOrderDO paramTicketOrderDO);
  
  public abstract int update(TicketOrderDO paramTicketOrderDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
  
  public abstract TicketOrderDO getEntity(String paramString);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/TicketOrderService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */