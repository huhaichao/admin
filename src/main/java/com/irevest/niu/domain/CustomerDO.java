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
/*     */ public class CustomerDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private Integer userId;
/*     */   private String customerIdentity;
/*     */   private String identityImage;
/*     */   private String customerName;
/*     */   private String customerAddrr;
/*     */   private String customerPost;
/*     */   private String customerAccount;
/*     */   private String customerPassword;
/*     */   private String customerStatus;
/*     */   private Date createDate;
/*     */   private Date modifyDate;
/*     */   private String remark;
/*     */   
/*     */   public void setId(Integer id)
/*     */   {
/*  49 */     this.id = id;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getId()
/*     */   {
/*  55 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserId(Integer userId)
/*     */   {
/*  61 */     this.userId = userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getUserId()
/*     */   {
/*  67 */     return this.userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCustomerIdentity(String customerIdentity)
/*     */   {
/*  73 */     this.customerIdentity = customerIdentity;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getCustomerIdentity()
/*     */   {
/*  79 */     return this.customerIdentity;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setIdentityImage(String identityImage)
/*     */   {
/*  85 */     this.identityImage = identityImage;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getIdentityImage()
/*     */   {
/*  91 */     return this.identityImage;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCustomerName(String customerName)
/*     */   {
/*  97 */     this.customerName = customerName;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getCustomerName()
/*     */   {
/* 103 */     return this.customerName;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCustomerAddrr(String customerAddrr)
/*     */   {
/* 109 */     this.customerAddrr = customerAddrr;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getCustomerAddrr()
/*     */   {
/* 115 */     return this.customerAddrr;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCustomerPost(String customerPost)
/*     */   {
/* 121 */     this.customerPost = customerPost;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getCustomerPost()
/*     */   {
/* 127 */     return this.customerPost;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCustomerAccount(String customerAccount)
/*     */   {
/* 133 */     this.customerAccount = customerAccount;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getCustomerAccount()
/*     */   {
/* 139 */     return this.customerAccount;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCustomerPassword(String customerPassword)
/*     */   {
/* 145 */     this.customerPassword = customerPassword;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getCustomerPassword()
/*     */   {
/* 151 */     return this.customerPassword;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCustomerStatus(String customerStatus)
/*     */   {
/* 157 */     this.customerStatus = customerStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getCustomerStatus()
/*     */   {
/* 163 */     return this.customerStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 169 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 175 */     return this.createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setModifyDate(Date modifyDate)
/*     */   {
/* 181 */     this.modifyDate = modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getModifyDate()
/*     */   {
/* 187 */     return this.modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRemark(String remark)
/*     */   {
/* 193 */     this.remark = remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRemark()
/*     */   {
/* 199 */     return this.remark;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/CustomerDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */