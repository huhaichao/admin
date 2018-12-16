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
/*     */ public class UserBackDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private Integer userId;
/*     */   private String appCode;
/*     */   private String context;
/*     */   private Date createDate;
/*     */   private Integer handleUser;
/*     */   private String status;
/*     */   private Date modifyDate;
/*     */   private String remark;
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
/*     */   public void setUserId(Integer userId)
/*     */   {
/*  53 */     this.userId = userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getUserId()
/*     */   {
/*  59 */     return this.userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAppCode(String appCode)
/*     */   {
/*  65 */     this.appCode = appCode;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getAppCode()
/*     */   {
/*  71 */     return this.appCode;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setContext(String context)
/*     */   {
/*  77 */     this.context = context;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getContext()
/*     */   {
/*  83 */     return this.context;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/*  89 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/*  95 */     return this.createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setHandleUser(Integer handleUser)
/*     */   {
/* 101 */     this.handleUser = handleUser;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getHandleUser()
/*     */   {
/* 107 */     return this.handleUser;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setStatus(String status)
/*     */   {
/* 113 */     this.status = status;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getStatus()
/*     */   {
/* 119 */     return this.status;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setModifyDate(Date modifyDate)
/*     */   {
/* 125 */     this.modifyDate = modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getModifyDate()
/*     */   {
/* 131 */     return this.modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRemark(String remark)
/*     */   {
/* 137 */     this.remark = remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRemark()
/*     */   {
/* 143 */     return this.remark;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/UserBackDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */