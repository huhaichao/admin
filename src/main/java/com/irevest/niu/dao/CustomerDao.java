package com.irevest.niu.dao;

import com.irevest.niu.domain.CustomerDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface CustomerDao
{
  public abstract CustomerDO get(Integer paramInteger);
  
  public abstract List<CustomerDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(CustomerDO paramCustomerDO);
  
  public abstract int update(CustomerDO paramCustomerDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/CustomerDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */