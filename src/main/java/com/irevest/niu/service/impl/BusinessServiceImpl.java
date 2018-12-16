/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.BusinessDao;
/*    */ import com.irevest.niu.domain.BusinessDO;
/*    */ import com.irevest.niu.service.BusinessService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class BusinessServiceImpl
/*    */   implements BusinessService
/*    */ {
/*    */   @Autowired
/*    */   private BusinessDao businessDao;
/*    */   
/*    */   public BusinessDO get(Integer id)
/*    */   {
/* 22 */     return this.businessDao.get(id);
/*    */   }
/*    */   
/*    */   public List<BusinessDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.businessDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.businessDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(BusinessDO business)
/*    */   {
/* 37 */     return this.businessDao.save(business);
/*    */   }
/*    */   
/*    */   public int update(BusinessDO business)
/*    */   {
/* 42 */     return this.businessDao.update(business);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.businessDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.businessDao.batchRemove(ids);
/*    */   }
/*    */   
/*    */ 
/*    */   public BusinessDO getBusiness(Integer userId)
/*    */   {
/* 58 */     return this.businessDao.getBusiness(userId);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/BusinessServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */