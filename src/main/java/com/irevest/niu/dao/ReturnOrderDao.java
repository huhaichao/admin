package com.irevest.niu.dao;

import com.irevest.niu.domain.ReturnOrderDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface ReturnOrderDao
{
  public abstract ReturnOrderDO get(Integer paramInteger);
  
  public abstract List<ReturnOrderDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(ReturnOrderDO paramReturnOrderDO);
  
  public abstract int update(ReturnOrderDO paramReturnOrderDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/ReturnOrderDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */