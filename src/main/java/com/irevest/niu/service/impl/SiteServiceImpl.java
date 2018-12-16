/*    */ package com.irevest.niu.service.impl;
/*    */ 
/*    */ import com.irevest.niu.dao.SiteDao;
/*    */ import com.irevest.niu.domain.SiteDO;
/*    */ import com.irevest.niu.service.SiteService;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class SiteServiceImpl
/*    */   implements SiteService
/*    */ {
/*    */   @Autowired
/*    */   private SiteDao siteDao;
/*    */   
/*    */   public SiteDO get(Integer id)
/*    */   {
/* 22 */     return this.siteDao.get(id);
/*    */   }
/*    */   
/*    */   public List<SiteDO> list(Map<String, Object> map)
/*    */   {
/* 27 */     return this.siteDao.list(map);
/*    */   }
/*    */   
/*    */   public int count(Map<String, Object> map)
/*    */   {
/* 32 */     return this.siteDao.count(map);
/*    */   }
/*    */   
/*    */   public int save(SiteDO site)
/*    */   {
/* 37 */     return this.siteDao.save(site);
/*    */   }
/*    */   
/*    */   public int update(SiteDO site)
/*    */   {
/* 42 */     return this.siteDao.update(site);
/*    */   }
/*    */   
/*    */   public int remove(Integer id)
/*    */   {
/* 47 */     return this.siteDao.remove(id);
/*    */   }
/*    */   
/*    */   public int batchRemove(Integer[] ids)
/*    */   {
/* 52 */     return this.siteDao.batchRemove(ids);
/*    */   }
/*    */   
/*    */ 
/*    */   public int removeAll()
/*    */   {
/* 58 */     return this.siteDao.removeAll();
/*    */   }
/*    */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/service/impl/SiteServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */