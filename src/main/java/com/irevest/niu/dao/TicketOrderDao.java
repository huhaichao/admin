package com.irevest.niu.dao;

import com.irevest.niu.domain.TicketOrderDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public abstract interface TicketOrderDao
{
  public abstract TicketOrderDO get(Integer paramInteger);
  
  public abstract List<TicketOrderDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(TicketOrderDO paramTicketOrderDO);
  
  public abstract int update(TicketOrderDO paramTicketOrderDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
  
  public abstract TicketOrderDO getEntity(@Param("orderNo") String paramString);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/TicketOrderDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */