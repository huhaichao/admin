/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.ReturnOrderDao;
/*    */ import com.irevest.niu.domain.ReturnOrderDO;
/*    */ import com.irevest.niu.service.ReturnOrderService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class ReturnOrderServiceImpl
/*    */   implements ReturnOrderService
/*    */ {
/*    */   @Autowired
/*    */   private ReturnOrderDao returnOrderDao;
/*    */   
/*    */   public ReturnOrderDO get(Integer id)
/*    */   {
/* 22 */     return this.returnOrderDao.get(id);
/*    */   }
/*    */   
/*    */   public List<ReturnOrderDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.returnOrderDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.returnOrderDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(ReturnOrderDO returnOrder)
/*    */   {
/* 37 */     return this.returnOrderDao.save(returnOrder);
/*    */   }
/*    */   
/*    */   public int update(ReturnOrderDO returnOrder)
/*    */   {
/* 42 */     return this.returnOrderDao.update(returnOrder);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.returnOrderDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.returnOrderDao.batchRemove(ids);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/ReturnOrderServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */