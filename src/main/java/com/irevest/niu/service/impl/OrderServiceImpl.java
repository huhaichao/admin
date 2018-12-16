/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.OrderDao;
/*    */ import com.irevest.niu.domain.OrderDO;
/*    */ import com.irevest.niu.service.OrderService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class OrderServiceImpl
/*    */   implements OrderService
/*    */ {
/*    */   @Autowired
/*    */   private OrderDao orderDao;
/*    */   
/*    */   public OrderDO get(Integer id)
/*    */   {
/* 22 */     return this.orderDao.get(id);
/*    */   }
/*    */   
/*    */   public List<OrderDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.orderDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.orderDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(OrderDO order)
/*    */   {
/* 37 */     return this.orderDao.save(order);
/*    */   }
/*    */   
/*    */   public int update(OrderDO order)
/*    */   {
/* 42 */     return this.orderDao.update(order);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.orderDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.orderDao.batchRemove(ids);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/OrderServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */