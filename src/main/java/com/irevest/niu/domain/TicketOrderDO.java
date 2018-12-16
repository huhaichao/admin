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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TicketOrderDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private String orderNo;
/*     */   private String phoneNo;
/*     */   private Integer userId;
/*     */   private String ticketIdentity;
/*     */   private String identityType;
/*     */   private String ticketName;
/*     */   private String linkmanType;
/*     */   private String fromSite;
/*     */   private String toSite;
/*     */   private Date departureDate;
/*     */   private String trainNum;
/*     */   private String seatType;
/*     */   private Date createDate;
/*     */   private String orderStatus;
/*     */   private Date modifyDate;
/*     */   private Double orderAmount;
/*     */   private Integer robCount;
/*     */   private String remark;
/*     */   private String appCode;
/*     */   
/*     */   public void setId(Integer id)
/*     */   {
/*  63 */     this.id = id;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getId()
/*     */   {
/*  69 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setOrderNo(String orderNo)
/*     */   {
/*  75 */     this.orderNo = orderNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getOrderNo()
/*     */   {
/*  81 */     return this.orderNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setPhoneNo(String phoneNo)
/*     */   {
/*  87 */     this.phoneNo = phoneNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getPhoneNo()
/*     */   {
/*  93 */     return this.phoneNo;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserId(Integer userId)
/*     */   {
/*  99 */     this.userId = userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getUserId()
/*     */   {
/* 105 */     return this.userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setTicketIdentity(String ticketIdentity)
/*     */   {
/* 111 */     this.ticketIdentity = ticketIdentity;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getTicketIdentity()
/*     */   {
/* 117 */     return this.ticketIdentity;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setIdentityType(String identityType)
/*     */   {
/* 123 */     this.identityType = identityType;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getIdentityType()
/*     */   {
/* 129 */     return this.identityType;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setTicketName(String ticketName)
/*     */   {
/* 135 */     this.ticketName = ticketName;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getTicketName()
/*     */   {
/* 141 */     return this.ticketName;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setLinkmanType(String linkmanType)
/*     */   {
/* 147 */     this.linkmanType = linkmanType;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getLinkmanType()
/*     */   {
/* 153 */     return this.linkmanType;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setFromSite(String fromSite)
/*     */   {
/* 159 */     this.fromSite = fromSite;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getFromSite()
/*     */   {
/* 165 */     return this.fromSite;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setToSite(String toSite)
/*     */   {
/* 171 */     this.toSite = toSite;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getToSite()
/*     */   {
/* 177 */     return this.toSite;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setDepartureDate(Date departureDate)
/*     */   {
/* 183 */     this.departureDate = departureDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getDepartureDate()
/*     */   {
/* 189 */     return this.departureDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setTrainNum(String trainNum)
/*     */   {
/* 195 */     this.trainNum = trainNum;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getTrainNum()
/*     */   {
/* 201 */     return this.trainNum;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setSeatType(String seatType)
/*     */   {
/* 207 */     this.seatType = seatType;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getSeatType()
/*     */   {
/* 213 */     return this.seatType;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 219 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 225 */     return this.createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setOrderStatus(String orderStatus)
/*     */   {
/* 231 */     this.orderStatus = orderStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getOrderStatus()
/*     */   {
/* 237 */     return this.orderStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setModifyDate(Date modifyDate)
/*     */   {
/* 243 */     this.modifyDate = modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getModifyDate()
/*     */   {
/* 249 */     return this.modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setOrderAmount(Double orderAmount)
/*     */   {
/* 255 */     this.orderAmount = orderAmount;
/*     */   }
/*     */   
/*     */ 
/*     */   public Double getOrderAmount()
/*     */   {
/* 261 */     return this.orderAmount;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRobCount(Integer robCount)
/*     */   {
/* 267 */     this.robCount = robCount;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getRobCount()
/*     */   {
/* 273 */     return this.robCount;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRemark(String remark)
/*     */   {
/* 279 */     this.remark = remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRemark()
/*     */   {
/* 285 */     return this.remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAppCode(String appCode)
/*     */   {
/* 291 */     this.appCode = appCode;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getAppCode()
/*     */   {
/* 297 */     return this.appCode;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/TicketOrderDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */