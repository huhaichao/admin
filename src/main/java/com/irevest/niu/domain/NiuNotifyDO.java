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
/*     */ 
/*     */ 
/*     */ public class NiuNotifyDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private String from;
/*     */   private String to;
/*     */   private String title;
/*     */   private String context;
/*     */   private Integer notifyStatus;
/*     */   private Date createDate;
/*     */   private Date notifyDate;
/*     */   private Date modifyDate;
/*     */   
/*     */   public void setId(Integer id)
/*     */   {
/*  41 */     this.id = id;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getId()
/*     */   {
/*  47 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setFrom(String from)
/*     */   {
/*  53 */     this.from = from;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getFrom()
/*     */   {
/*  59 */     return this.from;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setTo(String to)
/*     */   {
/*  65 */     this.to = to;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getTo()
/*     */   {
/*  71 */     return this.to;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setTitle(String title)
/*     */   {
/*  77 */     this.title = title;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getTitle()
/*     */   {
/*  83 */     return this.title;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setContext(String context)
/*     */   {
/*  89 */     this.context = context;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getContext()
/*     */   {
/*  95 */     return this.context;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setNotifyStatus(Integer notifyStatus)
/*     */   {
/* 101 */     this.notifyStatus = notifyStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getNotifyStatus()
/*     */   {
/* 107 */     return this.notifyStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 113 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 119 */     return this.createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setNotifyDate(Date notifyDate)
/*     */   {
/* 125 */     this.notifyDate = notifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getNotifyDate()
/*     */   {
/* 131 */     return this.notifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setModifyDate(Date modifyDate)
/*     */   {
/* 137 */     this.modifyDate = modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getModifyDate()
/*     */   {
/* 143 */     return this.modifyDate;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/NiuNotifyDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */