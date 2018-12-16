/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.OrderAuditDao;
/*    */ import com.irevest.niu.domain.OrderAuditDO;
/*    */ import com.irevest.niu.service.OrderAuditService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class OrderAuditServiceImpl
/*    */   implements OrderAuditService
/*    */ {
/*    */   @Autowired
/*    */   private OrderAuditDao orderAuditDao;
/*    */   
/*    */   public OrderAuditDO get(Integer id)
/*    */   {
/* 22 */     return this.orderAuditDao.get(id);
/*    */   }
/*    */   
/*    */   public List<OrderAuditDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.orderAuditDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.orderAuditDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(OrderAuditDO orderAudit)
/*    */   {
/* 37 */     return this.orderAuditDao.save(orderAudit);
/*    */   }
/*    */   
/*    */   public int update(OrderAuditDO orderAudit)
/*    */   {
/* 42 */     return this.orderAuditDao.update(orderAudit);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.orderAuditDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.orderAuditDao.batchRemove(ids);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/OrderAuditServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */