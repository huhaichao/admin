/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.MyOrderDao;
/*    */ import com.irevest.niu.domain.MyOrderDO;
/*    */ import com.irevest.niu.service.MyOrderService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class MyOrderServiceImpl
/*    */   implements MyOrderService
/*    */ {
/*    */   @Autowired
/*    */   private MyOrderDao myOrderDao;
/*    */   
/*    */   public List<MyOrderDO> selectTicketList(Map<String, Object> map)
/*    */   {
/* 26 */     return this.myOrderDao.selectTicketList(map);
/*    */   }
/*    */   
/*    */ 
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.myOrderDao.count(map);
/*    */   }
/*    */   
/*    */ 
/*    */   public List<MyOrderDO> selectTicketListRob(Map<String, Object> map)
/*    */   {
/* 38 */     return this.myOrderDao.selectTicketListRob(map);
/*    */   }
/*    */   
/*    */ 
/*    */   public List<MyOrderDO> selectTicketListRobDel(Map<String, Object> map)
/*    */   {
/* 44 */     return this.myOrderDao.selectTicketListRobDel(map);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/MyOrderServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */