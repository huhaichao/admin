/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.CustomerDao;
/*    */ import com.irevest.niu.domain.CustomerDO;
/*    */ import com.irevest.niu.service.CustomerService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class CustomerServiceImpl
/*    */   implements CustomerService
/*    */ {
/*    */   @Autowired
/*    */   private CustomerDao customerDao;
/*    */   
/*    */   public CustomerDO get(Integer id)
/*    */   {
/* 22 */     return this.customerDao.get(id);
/*    */   }
/*    */   
/*    */   public List<CustomerDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.customerDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.customerDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(CustomerDO customer)
/*    */   {
/* 37 */     return this.customerDao.save(customer);
/*    */   }
/*    */   
/*    */   public int update(CustomerDO customer)
/*    */   {
/* 42 */     return this.customerDao.update(customer);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.customerDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.customerDao.batchRemove(ids);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/CustomerServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */