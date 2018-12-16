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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UserTradeDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private String tradeNo;
/*     */   private String orderNo;
/*     */   private Double amount;
/*     */   private Double factAmount;
/*     */   private Double fee;
/*     */   private String fromAccount;
/*     */   private String toAccount;
/*     */   private String status;
/*     */   private Date createDate;
/*     */   private Date modifyDate;
/*     */   private String remark;
/*     */   
/*     */   public void setId(Integer id)
/*     */   {
/*  47 */     this.id = id;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getId()
/*     */   {
/*  53 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setTradeNo(String tradeNo)
/*     */   {
/*  59 */     this.tradeNo = tradeNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getTradeNo()
/*     */   {
/*  65 */     return this.tradeNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setOrderNo(String orderNo)
/*     */   {
/*  71 */     this.orderNo = orderNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getOrderNo()
/*     */   {
/*  77 */     return this.orderNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAmount(Double amount)
/*     */   {
/*  83 */     this.amount = amount;
/*     */   }
/*     */   
/*     */ 
/*     */   public Double getAmount()
/*     */   {
/*  89 */     return this.amount;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setFactAmount(Double factAmount)
/*     */   {
/*  95 */     this.factAmount = factAmount;
/*     */   }
/*     */   
/*     */ 
/*     */   public Double getFactAmount()
/*     */   {
/* 101 */     return this.factAmount;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setFee(Double fee)
/*     */   {
/* 107 */     this.fee = fee;
/*     */   }
/*     */   
/*     */ 
/*     */   public Double getFee()
/*     */   {
/* 113 */     return this.fee;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setFromAccount(String fromAccount)
/*     */   {
/* 119 */     this.fromAccount = fromAccount;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getFromAccount()
/*     */   {
/* 125 */     return this.fromAccount;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setToAccount(String toAccount)
/*     */   {
/* 131 */     this.toAccount = toAccount;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getToAccount()
/*     */   {
/* 137 */     return this.toAccount;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setStatus(String status)
/*     */   {
/* 143 */     this.status = status;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getStatus()
/*     */   {
/* 149 */     return this.status;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 155 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 161 */     return this.createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setModifyDate(Date modifyDate)
/*     */   {
/* 167 */     this.modifyDate = modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getModifyDate()
/*     */   {
/* 173 */     return this.modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRemark(String remark)
/*     */   {
/* 179 */     this.remark = remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRemark()
/*     */   {
/* 185 */     return this.remark;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/UserTradeDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */