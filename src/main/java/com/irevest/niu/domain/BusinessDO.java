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
/*     */ public class BusinessDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private Integer userId;
/*     */   private String businessIdentity;
/*     */   private String businessName;
/*     */   private String businessAddrr;
/*     */   private String businessPost;
/*     */   private String businessStatus;
/*     */   private String identityImage;
/*     */   private Date createDate;
/*     */   private Date modifyDate;
/*     */   private Integer benefitRate;
/*     */   private String remark;
/*     */   private String businessAccount;
/*     */   
/*     */   public String getBusinessAccount()
/*     */   {
/*  46 */     return this.businessAccount;
/*     */   }
/*     */   
/*  49 */   public void setBusinessAccount(String businessAccount) { this.businessAccount = businessAccount; }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setId(Integer id)
/*     */   {
/*  55 */     this.id = id;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getId()
/*     */   {
/*  61 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserId(Integer userId)
/*     */   {
/*  67 */     this.userId = userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getUserId()
/*     */   {
/*  73 */     return this.userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setBusinessIdentity(String businessIdentity)
/*     */   {
/*  79 */     this.businessIdentity = businessIdentity;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getBusinessIdentity()
/*     */   {
/*  85 */     return this.businessIdentity;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setBusinessName(String businessName)
/*     */   {
/*  91 */     this.businessName = businessName;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getBusinessName()
/*     */   {
/*  97 */     return this.businessName;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setBusinessAddrr(String businessAddrr)
/*     */   {
/* 103 */     this.businessAddrr = businessAddrr;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getBusinessAddrr()
/*     */   {
/* 109 */     return this.businessAddrr;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setBusinessPost(String businessPost)
/*     */   {
/* 115 */     this.businessPost = businessPost;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getBusinessPost()
/*     */   {
/* 121 */     return this.businessPost;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setBusinessStatus(String businessStatus)
/*     */   {
/* 127 */     this.businessStatus = businessStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getBusinessStatus()
/*     */   {
/* 133 */     return this.businessStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setIdentityImage(String identityImage)
/*     */   {
/* 139 */     this.identityImage = identityImage;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getIdentityImage()
/*     */   {
/* 145 */     return this.identityImage;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 151 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 157 */     return this.createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setModifyDate(Date modifyDate)
/*     */   {
/* 163 */     this.modifyDate = modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getModifyDate()
/*     */   {
/* 169 */     return this.modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setBenefitRate(Integer benefitRate)
/*     */   {
/* 175 */     this.benefitRate = benefitRate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getBenefitRate()
/*     */   {
/* 181 */     return this.benefitRate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRemark(String remark)
/*     */   {
/* 187 */     this.remark = remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRemark()
/*     */   {
/* 193 */     return this.remark;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/BusinessDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */