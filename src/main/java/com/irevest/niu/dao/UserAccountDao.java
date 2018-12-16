package com.irevest.niu.dao;

import com.irevest.niu.domain.UserAccountDO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface UserAccountDao
{
  public abstract UserAccountDO get(Integer paramInteger);
  
  public abstract List<UserAccountDO> list(Map<String, Object> paramMap);
  
  public abstract int count(Map<String, Object> paramMap);
  
  public abstract int save(UserAccountDO paramUserAccountDO);
  
  public abstract int update(UserAccountDO paramUserAccountDO);
  
  public abstract int remove(Integer paramInteger);
  
  public abstract int batchRemove(Integer[] paramArrayOfInteger);
}


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/dao/UserAccountDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */