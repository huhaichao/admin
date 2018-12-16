/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.TicketOrderDao;
/*    */ import com.irevest.niu.domain.TicketOrderDO;
/*    */ import com.irevest.niu.service.TicketOrderService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class TicketOrderServiceImpl
/*    */   implements TicketOrderService
/*    */ {
/*    */   @Autowired
/*    */   private TicketOrderDao ticketOrderDao;
/*    */   
/*    */   public TicketOrderDO get(Integer id)
/*    */   {
/* 22 */     return this.ticketOrderDao.get(id);
/*    */   }
/*    */   
/*    */   public List<TicketOrderDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.ticketOrderDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.ticketOrderDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(TicketOrderDO ticketOrder)
/*    */   {
/* 37 */     return this.ticketOrderDao.save(ticketOrder);
/*    */   }
/*    */   
/*    */   public int update(TicketOrderDO ticketOrder)
/*    */   {
/* 42 */     return this.ticketOrderDao.update(ticketOrder);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.ticketOrderDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.ticketOrderDao.batchRemove(ids);
/*    */   }
/*    */   
/*    */ 
/*    */   public TicketOrderDO getEntity(String orderNo)
/*    */   {
/* 58 */     return this.ticketOrderDao.getEntity(orderNo);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/TicketOrderServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */