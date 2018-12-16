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
/*     */ public class UserLinkmanDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private Integer userId;
/*     */   private String indentity;
/*     */   private String indentityType;
/*     */   private String linkmanType;
/*     */   private String name;
/*     */   private Date createDate;
/*     */   private String appCode;
/*     */   private String status;
/*     */   private Date modifyDate;
/*     */   private String area;
/*     */   private String province;
/*     */   private String city;
/*     */   private String prefecture;
/*     */   private String birthday;
/*     */   private String addrcode;
/*     */   private String remark;
/*     */   
/*     */   public void setId(Integer id)
/*     */   {
/*  57 */     this.id = id;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getId()
/*     */   {
/*  63 */     return this.id;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserId(Integer userId)
/*     */   {
/*  69 */     this.userId = userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public Integer getUserId()
/*     */   {
/*  75 */     return this.userId;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setIndentity(String indentity)
/*     */   {
/*  81 */     this.indentity = indentity;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getIndentity()
/*     */   {
/*  87 */     return this.indentity;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setIndentityType(String indentityType)
/*     */   {
/*  93 */     this.indentityType = indentityType;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getIndentityType()
/*     */   {
/*  99 */     return this.indentityType;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setLinkmanType(String linkmanType)
/*     */   {
/* 105 */     this.linkmanType = linkmanType;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getLinkmanType()
/*     */   {
/* 111 */     return this.linkmanType;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setName(String name)
/*     */   {
/* 117 */     this.name = name;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getName()
/*     */   {
/* 123 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 129 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 135 */     return this.createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAppCode(String appCode)
/*     */   {
/* 141 */     this.appCode = appCode;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getAppCode()
/*     */   {
/* 147 */     return this.appCode;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setStatus(String status)
/*     */   {
/* 153 */     this.status = status;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getStatus()
/*     */   {
/* 159 */     return this.status;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setModifyDate(Date modifyDate)
/*     */   {
/* 165 */     this.modifyDate = modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getModifyDate()
/*     */   {
/* 171 */     return this.modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setArea(String area)
/*     */   {
/* 177 */     this.area = area;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getArea()
/*     */   {
/* 183 */     return this.area;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setProvince(String province)
/*     */   {
/* 189 */     this.province = province;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getProvince()
/*     */   {
/* 195 */     return this.province;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCity(String city)
/*     */   {
/* 201 */     this.city = city;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getCity()
/*     */   {
/* 207 */     return this.city;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setPrefecture(String prefecture)
/*     */   {
/* 213 */     this.prefecture = prefecture;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getPrefecture()
/*     */   {
/* 219 */     return this.prefecture;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setBirthday(String birthday)
/*     */   {
/* 225 */     this.birthday = birthday;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getBirthday()
/*     */   {
/* 231 */     return this.birthday;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setAddrcode(String addrcode)
/*     */   {
/* 237 */     this.addrcode = addrcode;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getAddrcode()
/*     */   {
/* 243 */     return this.addrcode;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRemark(String remark)
/*     */   {
/* 249 */     this.remark = remark;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getRemark()
/*     */   {
/* 255 */     return this.remark;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/UserLinkmanDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */