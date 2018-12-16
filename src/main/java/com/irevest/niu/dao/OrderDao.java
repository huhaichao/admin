package com.irevest.niu.dao;

import com.irevest.niu.domain.OrderDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface OrderDao
{
  public abstract OrderDO get(Integer paramInteger);
  
  public abstract List<OrderDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(OrderDO paramOrderDO);
  
  public abstract int update(OrderDO paramOrderDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/OrderDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */