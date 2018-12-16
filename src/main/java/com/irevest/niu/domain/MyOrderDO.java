/*     */ package com.irevest.niu.domain;
/*     */ 
/*     */ import java.io.Serializable;
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
/*     */ public class MyOrderDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private String id;
/*     */   private String userId;
/*     */   private String orderNo;
/*     */   private String ticketIdentity;
/*     */   private String identityType;
/*     */   private String ticketName;
/*     */   private String linkmanType;
/*     */   private String fromSite;
/*     */   private String toSite;
/*     */   private String departureDate;
/*     */   private String trainNum;
/*     */   private String seatType;
/*     */   private String robAmount;
/*     */   private String robStatus;
/*     */   private String remark;
/*     */   private String orderAmount;
/*     */   private String orderStatus;
/*     */   
/*     */   public String getOrderAmount()
/*     */   {
/*  53 */     return this.orderAmount;
/*     */   }
/*     */   
/*  56 */   public void setOrderAmount(String orderAmount) { this.orderAmount = orderAmount; }
/*     */   
/*     */   public String getOrderStatus() {
/*  59 */     return this.orderStatus;
/*     */   }
/*     */   
/*  62 */   public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
/*     */   
/*     */   public String getRemark() {
/*  65 */     return this.remark;
/*     */   }
/*     */   
/*  68 */   public void setRemark(String remark) { this.remark = remark; }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setTicketIdentity(String ticketIdentity)
/*     */   {
/*  74 */     this.ticketIdentity = ticketIdentity;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getTicketIdentity()
/*     */   {
/*  80 */     return this.ticketIdentity;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setIdentityType(String identityType)
/*     */   {
/*  86 */     this.identityType = identityType;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getIdentityType()
/*     */   {
/*  92 */     return this.identityType;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setTicketName(String ticketName)
/*     */   {
/*  98 */     this.ticketName = ticketName;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getTicketName()
/*     */   {
/* 104 */     return this.ticketName;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setLinkmanType(String linkmanType)
/*     */   {
/* 110 */     this.linkmanType = linkmanType;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getLinkmanType()
/*     */   {
/* 116 */     return this.linkmanType;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setFromSite(String fromSite)
/*     */   {
/* 122 */     this.fromSite = fromSite;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getFromSite()
/*     */   {
/* 128 */     return this.fromSite;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setToSite(String toSite)
/*     */   {
/* 134 */     this.toSite = toSite;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getToSite()
/*     */   {
/* 140 */     return this.toSite;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setDepartureDate(String departureDate)
/*     */   {
/* 146 */     this.departureDate = departureDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getDepartureDate()
/*     */   {
/* 152 */     return this.departureDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setTrainNum(String trainNum)
/*     */   {
/* 158 */     this.trainNum = trainNum;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getTrainNum()
/*     */   {
/* 164 */     return this.trainNum;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setSeatType(String seatType)
/*     */   {
/* 170 */     this.seatType = seatType;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getSeatType()
/*     */   {
/* 176 */     return this.seatType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String getUserId()
/*     */   {
/* 183 */     return this.userId;
/*     */   }
/*     */   
/* 186 */   public String getRobAmount() { return this.robAmount; }
/*     */   
/*     */   public void setRobAmount(String robAmount) {
/* 189 */     this.robAmount = robAmount;
/*     */   }
/*     */   
/* 192 */   public String getRobStatus() { return this.robStatus; }
/*     */   
/*     */   public void setRobStatus(String robStatus) {
/* 195 */     this.robStatus = robStatus;
/*     */   }
/*     */   
/* 198 */   public void setUserId(String userId) { this.userId = userId; }
/*     */   
/*     */   public String getOrderNo() {
/* 201 */     return this.orderNo;
/*     */   }
/*     */   
/* 204 */   public void setOrderNo(String orderNo) { this.orderNo = orderNo; }
/*     */   
/*     */   public String getId() {
/* 207 */     return this.id;
/*     */   }
/*     */   
/* 210 */   public void setId(String id) { this.id = id; }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/MyOrderDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */