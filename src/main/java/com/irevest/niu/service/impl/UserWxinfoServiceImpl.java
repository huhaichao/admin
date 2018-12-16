/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.UserWxinfoDao;
/*    */ import com.irevest.niu.domain.UserWxinfoDO;
/*    */ import com.irevest.niu.service.UserWxinfoService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class UserWxinfoServiceImpl
/*    */   implements UserWxinfoService
/*    */ {
/*    */   @Autowired
/*    */   private UserWxinfoDao userWxinfoDao;
/*    */   
/*    */   public UserWxinfoDO get(Integer id)
/*    */   {
/* 22 */     return this.userWxinfoDao.get(id);
/*    */   }
/*    */   
/*    */   public List<UserWxinfoDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.userWxinfoDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.userWxinfoDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(UserWxinfoDO userWxinfo)
/*    */   {
/* 37 */     return this.userWxinfoDao.save(userWxinfo);
/*    */   }
/*    */   
/*    */   public int update(UserWxinfoDO userWxinfo)
/*    */   {
/* 42 */     return this.userWxinfoDao.update(userWxinfo);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.userWxinfoDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.userWxinfoDao.batchRemove(ids);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/UserWxinfoServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */