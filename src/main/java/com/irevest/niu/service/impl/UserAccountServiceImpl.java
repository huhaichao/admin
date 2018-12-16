/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.UserAccountDao;
/*    */ import com.irevest.niu.domain.UserAccountDO;
/*    */ import com.irevest.niu.service.UserAccountService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class UserAccountServiceImpl
/*    */   implements UserAccountService
/*    */ {
/*    */   @Autowired
/*    */   private UserAccountDao userAccountDao;
/*    */   
/*    */   public UserAccountDO get(Integer id)
/*    */   {
/* 22 */     return this.userAccountDao.get(id);
/*    */   }
/*    */   
/*    */   public List<UserAccountDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.userAccountDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.userAccountDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(UserAccountDO userAccount)
/*    */   {
/* 37 */     return this.userAccountDao.save(userAccount);
/*    */   }
/*    */   
/*    */   public int update(UserAccountDO userAccount)
/*    */   {
/* 42 */     return this.userAccountDao.update(userAccount);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.userAccountDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.userAccountDao.batchRemove(ids);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/UserAccountServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */