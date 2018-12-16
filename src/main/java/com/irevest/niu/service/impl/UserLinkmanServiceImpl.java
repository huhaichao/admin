/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.UserLinkmanDao;
/*    */ import com.irevest.niu.domain.UserLinkmanDO;
/*    */ import com.irevest.niu.service.UserLinkmanService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class UserLinkmanServiceImpl
/*    */   implements UserLinkmanService
/*    */ {
/*    */   @Autowired
/*    */   private UserLinkmanDao userLinkmanDao;
/*    */   
/*    */   public UserLinkmanDO get(Integer id)
/*    */   {
/* 22 */     return this.userLinkmanDao.get(id);
/*    */   }
/*    */   
/*    */   public List<UserLinkmanDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.userLinkmanDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.userLinkmanDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(UserLinkmanDO userLinkman)
/*    */   {
/* 37 */     return this.userLinkmanDao.save(userLinkman);
/*    */   }
/*    */   
/*    */   public int update(UserLinkmanDO userLinkman)
/*    */   {
/* 42 */     return this.userLinkmanDao.update(userLinkman);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.userLinkmanDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.userLinkmanDao.batchRemove(ids);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/UserLinkmanServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */