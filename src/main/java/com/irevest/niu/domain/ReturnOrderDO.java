/*     */ package com.irevest.niu.domain;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class ReturnOrderDO implements java.io.Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private Integer userId;
/*     */   private String returnNo;
/*     */   private String orderNo;
/*     */   private String depositNo;
/*     */   private String tradeChannelsNo;
/*     */   private String tradeChannelsReturnNo;
/*     */   private Double returnAmount;
/*     */   private Double orderAmount;
/*     */   private String returnStatus;
/*     */   private String returnType;
/*     */   private Date createDate;
/*     */   private Date modifyDate;
/*     */   private Date retunTime;
/*     */   private String remark;
/*     */   private String appcode;
/*     */   private String refundAccount;
/*     */   private String refundRequestSource;
/*     */   private String refundRecvAccout;
/*     */   
/*     */   public String getDepositNo() {
/*  29 */     return this.depositNo;
/*     */   }
/*     */   
/*  32 */   public void setDepositNo(String depositNo) { this.depositNo = depositNo; }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setId(Integer id)
/*     */   {
/*  67 */     this.id = id;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getId()
/*     */   {
/*  73 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserId(Integer userId)
/*     */   {
/*  79 */     this.userId = userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getUserId()
/*     */   {
/*  85 */     return this.userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setReturnNo(String returnNo)
/*     */   {
/*  91 */     this.returnNo = returnNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getReturnNo()
/*     */   {
/*  97 */     return this.returnNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setOrderNo(String orderNo)
/*     */   {
/* 103 */     this.orderNo = orderNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getOrderNo()
/*     */   {
/* 109 */     return this.orderNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setTradeChannelsNo(String tradeChannelsNo)
/*     */   {
/* 115 */     this.tradeChannelsNo = tradeChannelsNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getTradeChannelsNo()
/*     */   {
/* 121 */     return this.tradeChannelsNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setTradeChannelsReturnNo(String tradeChannelsReturnNo)
/*     */   {
/* 127 */     this.tradeChannelsReturnNo = tradeChannelsReturnNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getTradeChannelsReturnNo()
/*     */   {
/* 133 */     return this.tradeChannelsReturnNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setReturnAmount(Double returnAmount)
/*     */   {
/* 139 */     this.returnAmount = returnAmount;
/*     */   }
/*     */   
/*     */ 
/*     */   public Double getReturnAmount()
/*     */   {
/* 145 */     return this.returnAmount;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setOrderAmount(Double orderAmount)
/*     */   {
/* 151 */     this.orderAmount = orderAmount;
/*     */   }
/*     */   
/*     */ 
/*     */   public Double getOrderAmount()
/*     */   {
/* 157 */     return this.orderAmount;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setReturnStatus(String returnStatus)
/*     */   {
/* 163 */     this.returnStatus = returnStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getReturnStatus()
/*     */   {
/* 169 */     return this.returnStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setReturnType(String returnType)
/*     */   {
/* 175 */     this.returnType = returnType;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getReturnType()
/*     */   {
/* 181 */     return this.returnType;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 187 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 193 */     return this.createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setModifyDate(Date modifyDate)
/*     */   {
/* 199 */     this.modifyDate = modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getModifyDate()
/*     */   {
/* 205 */     return this.modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRetunTime(Date retunTime)
/*     */   {
/* 211 */     this.retunTime = retunTime;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getRetunTime()
/*     */   {
/* 217 */     return this.retunTime;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRemark(String remark)
/*     */   {
/* 223 */     this.remark = remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRemark()
/*     */   {
/* 229 */     return this.remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAppcode(String appcode)
/*     */   {
/* 235 */     this.appcode = appcode;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getAppcode()
/*     */   {
/* 241 */     return this.appcode;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRefundAccount(String refundAccount)
/*     */   {
/* 247 */     this.refundAccount = refundAccount;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRefundAccount()
/*     */   {
/* 253 */     return this.refundAccount;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRefundRequestSource(String refundRequestSource)
/*     */   {
/* 259 */     this.refundRequestSource = refundRequestSource;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRefundRequestSource()
/*     */   {
/* 265 */     return this.refundRequestSource;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRefundRecvAccout(String refundRecvAccout)
/*     */   {
/* 271 */     this.refundRecvAccout = refundRecvAccout;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRefundRecvAccout()
/*     */   {
/* 277 */     return this.refundRecvAccout;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/ReturnOrderDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */