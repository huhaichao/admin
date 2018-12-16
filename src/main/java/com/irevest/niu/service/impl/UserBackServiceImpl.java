/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.UserBackDao;
/*    */ import com.irevest.niu.domain.UserBackDO;
/*    */ import com.irevest.niu.service.UserBackService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class UserBackServiceImpl
/*    */   implements UserBackService
/*    */ {
/*    */   @Autowired
/*    */   private UserBackDao userBackDao;
/*    */   
/*    */   public UserBackDO get(Integer id)
/*    */   {
/* 22 */     return this.userBackDao.get(id);
/*    */   }
/*    */   
/*    */   public List<UserBackDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.userBackDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.userBackDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(UserBackDO userBack)
/*    */   {
/* 37 */     return this.userBackDao.save(userBack);
/*    */   }
/*    */   
/*    */   public int update(UserBackDO userBack)
/*    */   {
/* 42 */     return this.userBackDao.update(userBack);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.userBackDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.userBackDao.batchRemove(ids);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/UserBackServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */