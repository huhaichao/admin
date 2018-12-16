 package com.irevest.niu.domain;
 import java.io.Serializable;
 import java.util.Date;
 public class UserDepositDO
   implements Serializable
 {
   private static final long serialVersionUID = 1L;
   private Integer id;
   private String depositNo;
   private String tradeChannelsNo;
   private Integer userId;
   private Double amount;
   private Date createDate;
   private String status;
   private Date modifyDate;
   private String appCode;
   private String orderNo;
   private String fromAccount;
   private String ip;
   private String tradeType;
   private String prepayId;
   private String timeEnd;
   private String bankType;
   private String remark;
   
   public void setId(Integer id)
   {
/*  57 */     this.id = id;
   }
   
 
   public Integer getId()
   {
/*  63 */     return this.id;
   }
   
 
   public void setDepositNo(String depositNo)
   {
/*  69 */     this.depositNo = depositNo;
   }
   
 
   public String getDepositNo()
   {
/*  75 */     return this.depositNo;
   }
   
 
   public void setTradeChannelsNo(String tradeChannelsNo)
   {
/*  81 */     this.tradeChannelsNo = tradeChannelsNo;
   }
   
 
   public String getTradeChannelsNo()
   {
/*  87 */     return this.tradeChannelsNo;
   }
   
 
   public void setUserId(Integer userId)
   {
/*  93 */     this.userId = userId;
   }
   
 
   public Integer getUserId()
   {
/*  99 */     return this.userId;
   }
   
 
   public void setAmount(Double amount)
   {
/* 105 */     this.amount = amount;
   }
   
 
   public Double getAmount()
   {
/* 111 */     return this.amount;
   }
   
 
   public void setCreateDate(Date createDate)
   {
/* 117 */     this.createDate = createDate;
   }
   
 
   public Date getCreateDate()
   {
/* 123 */     return this.createDate;
   }
   
 
   public void setStatus(String status)
   {
/* 129 */     this.status = status;
   }
   
 
   public String getStatus()
   {
/* 135 */     return this.status;
   }
   
 
   public void setModifyDate(Date modifyDate)
   {
/* 141 */     this.modifyDate = modifyDate;
   }
   
 
   public Date getModifyDate()
   {
/* 147 */     return this.modifyDate;
   }
   
 
   public void setAppCode(String appCode)
   {
/* 153 */     this.appCode = appCode;
   }
   
 
   public String getAppCode()
   {
/* 159 */     return this.appCode;
   }
   
 
   public void setOrderNo(String orderNo)
   {
/* 165 */     this.orderNo = orderNo;
   }
   
 
   public String getOrderNo()
   {
/* 171 */     return this.orderNo;
   }
   
 
   public void setFromAccount(String fromAccount)
   {
/* 177 */     this.fromAccount = fromAccount;
   }
   
 
   public String getFromAccount()
   {
/* 183 */     return this.fromAccount;
   }
   
 
   public void setIp(String ip)
   {
/* 189 */     this.ip = ip;
   }
   
 
   public String getIp()
   {
/* 195 */     return this.ip;
   }
   
 
   public void setTradeType(String tradeType)
   {
/* 201 */     this.tradeType = tradeType;
   }
   
 
   public String getTradeType()
   {
/* 207 */     return this.tradeType;
   }
   
 
   public void setPrepayId(String prepayId)
   {
/* 213 */     this.prepayId = prepayId;
   }
   
 
   public String getPrepayId()
   {
/* 219 */     return this.prepayId;
   }
   
 
   public void setTimeEnd(String timeEnd)
   {
/* 225 */     this.timeEnd = timeEnd;
   }
   
 
   public String getTimeEnd()
   {
/* 231 */     return this.timeEnd;
   }
   
 
   public void setBankType(String bankType)
   {
/* 237 */     this.bankType = bankType;
   }
   
 
   public String getBankType()
   {
/* 243 */     return this.bankType;
   }
   
 
   public void setRemark(String remark)
   {
/* 249 */     this.remark = remark;
   }
   
 
   public String getRemark()
   {
/* 255 */     return this.remark;
   }
 }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/UserDepositDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */