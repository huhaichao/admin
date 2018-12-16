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
/*     */ public class UserAccountDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private String accountNo;
/*     */   private Integer userId;
/*     */   private Double amountBalance;
/*     */   private Double coolAmount;
/*     */   private Date createDate;
/*     */   private Date modifyDate;
/*     */   private String status;
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
/*     */   public void setAccountNo(String accountNo)
/*     */   {
/*  51 */     this.accountNo = accountNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getAccountNo()
/*     */   {
/*  57 */     return this.accountNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserId(Integer userId)
/*     */   {
/*  63 */     this.userId = userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getUserId()
/*     */   {
/*  69 */     return this.userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAmountBalance(Double amountBalance)
/*     */   {
/*  75 */     this.amountBalance = amountBalance;
/*     */   }
/*     */   
/*     */ 
/*     */   public Double getAmountBalance()
/*     */   {
/*  81 */     return this.amountBalance;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCoolAmount(Double coolAmount)
/*     */   {
/*  87 */     this.coolAmount = coolAmount;
/*     */   }
/*     */   
/*     */ 
/*     */   public Double getCoolAmount()
/*     */   {
/*  93 */     return this.coolAmount;
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
/*     */   public void setStatus(String status)
/*     */   {
/* 123 */     this.status = status;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getStatus()
/*     */   {
/* 129 */     return this.status;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/UserAccountDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */