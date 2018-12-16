/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.NiuNotifyDao;
/*    */ import com.irevest.niu.domain.NiuNotifyDO;
/*    */ import com.irevest.niu.service.NiuNotifyService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class NiuNotifyServiceImpl
/*    */   implements NiuNotifyService
/*    */ {
/*    */   @Autowired
/*    */   private NiuNotifyDao niuNotifyDao;
/*    */   
/*    */   public NiuNotifyDO get(Integer id)
/*    */   {
/* 22 */     return this.niuNotifyDao.get(id);
/*    */   }
/*    */   
/*    */   public List<NiuNotifyDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.niuNotifyDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.niuNotifyDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(NiuNotifyDO notify)
/*    */   {
/* 37 */     return this.niuNotifyDao.save(notify);
/*    */   }
/*    */   
/*    */   public int update(NiuNotifyDO notify)
/*    */   {
/* 42 */     return this.niuNotifyDao.update(notify);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.niuNotifyDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.niuNotifyDao.batchRemove(ids);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/NiuNotifyServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */