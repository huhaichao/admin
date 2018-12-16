package com.irevest.niu.dao;

import com.irevest.niu.domain.InfoDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface InfoDao
{
  public abstract InfoDO get(Integer paramInteger);
  
  public abstract List<InfoDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(InfoDO paramInfoDO);
  
  public abstract int update(InfoDO paramInfoDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/InfoDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */