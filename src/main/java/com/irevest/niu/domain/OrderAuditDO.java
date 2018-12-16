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
/*     */ public class OrderAuditDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private Integer userId;
/*     */   private Integer robOrderId;
/*     */   private String auditStatus;
/*     */   private Integer auditUserId;
/*     */   private String auditName;
/*     */   private Date createDate;
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
/*     */   public void setRobOrderId(Integer robOrderId)
/*     */   {
/*  65 */     this.robOrderId = robOrderId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getRobOrderId()
/*     */   {
/*  71 */     return this.robOrderId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAuditStatus(String auditStatus)
/*     */   {
/*  77 */     this.auditStatus = auditStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getAuditStatus()
/*     */   {
/*  83 */     return this.auditStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAuditUserId(Integer auditUserId)
/*     */   {
/*  89 */     this.auditUserId = auditUserId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getAuditUserId()
/*     */   {
/*  95 */     return this.auditUserId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAuditName(String auditName)
/*     */   {
/* 101 */     this.auditName = auditName;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getAuditName()
/*     */   {
/* 107 */     return this.auditName;
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


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/OrderAuditDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */