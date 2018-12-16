package com.irevest.niu.dao;

import com.irevest.niu.domain.RobOrderDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public abstract interface RobOrderDao
{
  public abstract RobOrderDO get(Integer paramInteger);
  
  public abstract List<RobOrderDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(RobOrderDO paramRobOrderDO);
  
  public abstract int update(RobOrderDO paramRobOrderDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
  
  public abstract int removeOr(@Param("userId") String paramString1, @Param("orderId") String paramString2);
  
  public abstract RobOrderDO getEntity(@Param("orderNo") String paramString1, @Param("userId") String paramString2);
  
  public abstract List<RobOrderDO> getEntitys(@Param("orderNo") String paramString);
  
  public abstract int getCheckcount(@Param("orderNo") String paramString);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/RobOrderDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */