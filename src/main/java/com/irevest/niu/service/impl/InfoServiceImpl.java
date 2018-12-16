/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.InfoDao;
/*    */ import com.irevest.niu.domain.InfoDO;
/*    */ import com.irevest.niu.service.InfoService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class InfoServiceImpl
/*    */   implements InfoService
/*    */ {
/*    */   @Autowired
/*    */   private InfoDao infoDao;
/*    */   
/*    */   public InfoDO get(Integer id)
/*    */   {
/* 22 */     return this.infoDao.get(id);
/*    */   }
/*    */   
/*    */   public List<InfoDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.infoDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.infoDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(InfoDO info)
/*    */   {
/* 37 */     return this.infoDao.save(info);
/*    */   }
/*    */   
/*    */   public int update(InfoDO info)
/*    */   {
/* 42 */     return this.infoDao.update(info);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.infoDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.infoDao.batchRemove(ids);
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/InfoServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */