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
/*     */ public class RobOrderDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private Integer userId;
/*     */   private String orderId;
/*     */   private String robStatus;
/*     */   private String proofImage;
/*     */   private Date createDate;
/*     */   private Date modifyDate;
/*     */   private String remark;
/*     */   private String appCode;
/*     */   private Integer robScbs;
/*     */   private Double robAmount;
/*     */   private String robContext;
/*     */   
/*     */   public Integer getRobScbs()
/*     */   {
/*  44 */     return this.robScbs;
/*     */   }
/*     */   
/*  47 */   public void setRobScbs(Integer robScbs) { this.robScbs = robScbs; }
/*     */   
/*     */   public Double getRobAmount() {
/*  50 */     return this.robAmount;
/*     */   }
/*     */   
/*  53 */   public void setRobAmount(Double robAmount) { this.robAmount = robAmount; }
/*     */   
/*     */   public String getRobContext() {
/*  56 */     return this.robContext;
/*     */   }
/*     */   
/*  59 */   public void setRobContext(String robContext) { this.robContext = robContext; }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setId(Integer id)
/*     */   {
/*  65 */     this.id = id;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getId()
/*     */   {
/*  71 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserId(Integer userId)
/*     */   {
/*  77 */     this.userId = userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getUserId()
/*     */   {
/*  83 */     return this.userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setOrderId(String orderId)
/*     */   {
/*  89 */     this.orderId = orderId;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getOrderId()
/*     */   {
/*  95 */     return this.orderId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRobStatus(String robStatus)
/*     */   {
/* 101 */     this.robStatus = robStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRobStatus()
/*     */   {
/* 107 */     return this.robStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setProofImage(String proofImage)
/*     */   {
/* 113 */     this.proofImage = proofImage;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getProofImage()
/*     */   {
/* 119 */     return this.proofImage;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 125 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 131 */     return this.createDate;
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
/*     */   
/*     */ 
/*     */   public void setRemark(String remark)
/*     */   {
/* 149 */     this.remark = remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRemark()
/*     */   {
/* 155 */     return this.remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAppCode(String appCode)
/*     */   {
/* 161 */     this.appCode = appCode;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getAppCode()
/*     */   {
/* 167 */     return this.appCode;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/RobOrderDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */