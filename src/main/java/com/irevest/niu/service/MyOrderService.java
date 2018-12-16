package com.irevest.niu.service;

import com.irevest.niu.domain.MyOrderDO;
import java.util.List;
import java.util.Map;

public abstract interface MyOrderService
{
  public abstract List<MyOrderDO> selectTicketList(Map<String, Object> paramMap);
  
  public abstract List<MyOrderDO> selectTicketListRob(Map<String, Object> paramMap);
  
  public abstract List<MyOrderDO> selectTicketListRobDel(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/MyOrderService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */