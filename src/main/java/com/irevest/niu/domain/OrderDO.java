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
/*     */ public class OrderDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private Integer userId;
/*     */   private Integer orderId;
/*     */   private String robStatus;
/*     */   private String proofImage;
/*     */   private Date createDate;
/*     */   private Date modifyDate;
/*     */   private String remark;
/*     */   
/*     */   public void setId(Integer id)
/*     */   {
/*  39 */     this.id = id;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getId()
/*     */   {
/*  45 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserId(Integer userId)
/*     */   {
/*  51 */     this.userId = userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getUserId()
/*     */   {
/*  57 */     return this.userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setOrderId(Integer orderId)
/*     */   {
/*  63 */     this.orderId = orderId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getOrderId()
/*     */   {
/*  69 */     return this.orderId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRobStatus(String robStatus)
/*     */   {
/*  75 */     this.robStatus = robStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRobStatus()
/*     */   {
/*  81 */     return this.robStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setProofImage(String proofImage)
/*     */   {
/*  87 */     this.proofImage = proofImage;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getProofImage()
/*     */   {
/*  93 */     return this.proofImage;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/*  99 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 105 */     return this.createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setModifyDate(Date modifyDate)
/*     */   {
/* 111 */     this.modifyDate = modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getModifyDate()
/*     */   {
/* 117 */     return this.modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRemark(String remark)
/*     */   {
/* 123 */     this.remark = remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRemark()
/*     */   {
/* 129 */     return this.remark;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/OrderDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */