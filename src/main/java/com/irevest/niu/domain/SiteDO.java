/*     */ package com.irevest.niu.domain;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SiteDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private String siteZw;
/*     */   private String siteDh;
/*     */   private String sitePy;
/*     */   private String siteJx;
/*     */   private Date siteCreatedate;
/*     */   private String remark;
/*     */   
/*     */   public void setId(Integer id)
/*     */   {
/*  37 */     this.id = id;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getId()
/*     */   {
/*  43 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setSiteZw(String siteZw)
/*     */   {
/*  49 */     this.siteZw = siteZw;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getSiteZw()
/*     */   {
/*  55 */     return this.siteZw;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setSiteDh(String siteDh)
/*     */   {
/*  61 */     this.siteDh = siteDh;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getSiteDh()
/*     */   {
/*  67 */     return this.siteDh;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setSitePy(String sitePy)
/*     */   {
/*  73 */     this.sitePy = sitePy;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getSitePy()
/*     */   {
/*  79 */     return this.sitePy;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setSiteJx(String siteJx)
/*     */   {
/*  85 */     this.siteJx = siteJx;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getSiteJx()
/*     */   {
/*  91 */     return this.siteJx;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setSiteCreatedate(Date siteCreatedate)
/*     */   {
/*  97 */     this.siteCreatedate = siteCreatedate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getSiteCreatedate()
/*     */   {
/* 103 */     return this.siteCreatedate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRemark(String remark)
/*     */   {
/* 109 */     this.remark = remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRemark()
/*     */   {
/* 115 */     return this.remark;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/SiteDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */