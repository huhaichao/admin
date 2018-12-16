/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.RobOrderDao;
/*    */ import com.irevest.niu.domain.RobOrderDO;
/*    */ import com.irevest.niu.service.RobOrderService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class RobOrderServiceImpl
/*    */   implements RobOrderService
/*    */ {
/*    */   @Autowired
/*    */   private RobOrderDao robOrderDao;
/*    */   
/*    */   public RobOrderDO get(Integer id)
/*    */   {
/* 22 */     return this.robOrderDao.get(id);
/*    */   }
/*    */   
/*    */   public List<RobOrderDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.robOrderDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.robOrderDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(RobOrderDO robOrder)
/*    */   {
/* 37 */     return this.robOrderDao.save(robOrder);
/*    */   }
/*    */   
/*    */   public int update(RobOrderDO robOrder)
/*    */   {
/* 42 */     return this.robOrderDao.update(robOrder);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.robOrderDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.robOrderDao.batchRemove(ids);
/*    */   }
/*    */   
/*    */ 
/*    */   public int removeOr(String userId, String orderId)
/*    */   {
/* 58 */     return this.robOrderDao.removeOr(userId, orderId);
/*    */   }
/*    */   
/*    */ 
/*    */   public RobOrderDO getEntity(String orderNo, String userId)
/*    */   {
/* 64 */     return this.robOrderDao.getEntity(orderNo, userId);
/*    */   }
/*    */   
/*    */ 
/*    */   public List<RobOrderDO> getEntitys(String orderNo)
/*    */   {
/* 70 */     return this.robOrderDao.getEntitys(orderNo);
/*    */   }
/*    */   
/*    */ 
/*    */   public int getCheckcount(String orderNo)
/*    */   {
/* 76 */     return this.robOrderDao.getCheckcount(orderNo);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/RobOrderServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */