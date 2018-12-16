package com.irevest.niu.dao;

import com.irevest.niu.domain.OrderAuditDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface OrderAuditDao
{
  public abstract OrderAuditDO get(Integer paramInteger);
  
  public abstract List<OrderAuditDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(OrderAuditDO paramOrderAuditDO);
  
  public abstract int update(OrderAuditDO paramOrderAuditDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/OrderAuditDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */