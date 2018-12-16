/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.UserDepositDao;
/*    */ import com.irevest.niu.domain.UserDepositDO;
/*    */ import com.irevest.niu.service.UserDepositService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class UserDepositServiceImpl
/*    */   implements UserDepositService
/*    */ {
/*    */   @Autowired
/*    */   private UserDepositDao userDepositDao;
/*    */   
/*    */   public UserDepositDO get(Integer id)
/*    */   {
/* 22 */     return this.userDepositDao.get(id);
/*    */   }
/*    */   
/*    */   public List<UserDepositDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.userDepositDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.userDepositDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(UserDepositDO userDeposit)
/*    */   {
/* 37 */     return this.userDepositDao.save(userDeposit);
/*    */   }
/*    */   
/*    */   public int update(UserDepositDO userDeposit)
/*    */   {
/* 42 */     return this.userDepositDao.update(userDeposit);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.userDepositDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.userDepositDao.batchRemove(ids);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/UserDepositServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */