package com.irevest.niu.dao;

import com.irevest.niu.domain.SiteDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface SiteDao
{
  public abstract SiteDO get(Integer paramInteger);
  
  public abstract List<SiteDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(SiteDO paramSiteDO);
  
  public abstract int update(SiteDO paramSiteDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
  
  public abstract int removeAll();
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/SiteDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */