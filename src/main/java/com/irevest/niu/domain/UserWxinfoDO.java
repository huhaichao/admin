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
/*     */ public class UserWxinfoDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private Integer userId;
/*     */   private String nickname;
/*     */   private String openid;
/*     */   private String sessionKey;
/*     */   private String unionid;
/*     */   private String gender;
/*     */   private String phonenumber;
/*     */   private String countrycode;
/*     */   private String purephonenumber;
/*     */   private String city;
/*     */   private String province;
/*     */   private String country;
/*     */   private String language;
/*     */   private Date createDate;
/*     */   private Date modifyDate;
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
/*     */   public void setNickname(String nickname)
/*     */   {
/*  79 */     this.nickname = nickname;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getNickname()
/*     */   {
/*  85 */     return this.nickname;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setOpenid(String openid)
/*     */   {
/*  91 */     this.openid = openid;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getOpenid()
/*     */   {
/*  97 */     return this.openid;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setSessionKey(String sessionKey)
/*     */   {
/* 103 */     this.sessionKey = sessionKey;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getSessionKey()
/*     */   {
/* 109 */     return this.sessionKey;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUnionid(String unionid)
/*     */   {
/* 115 */     this.unionid = unionid;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getUnionid()
/*     */   {
/* 121 */     return this.unionid;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setGender(String gender)
/*     */   {
/* 127 */     this.gender = gender;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getGender()
/*     */   {
/* 133 */     return this.gender;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setPhonenumber(String phonenumber)
/*     */   {
/* 139 */     this.phonenumber = phonenumber;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getPhonenumber()
/*     */   {
/* 145 */     return this.phonenumber;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCountrycode(String countrycode)
/*     */   {
/* 151 */     this.countrycode = countrycode;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getCountrycode()
/*     */   {
/* 157 */     return this.countrycode;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setPurephonenumber(String purephonenumber)
/*     */   {
/* 163 */     this.purephonenumber = purephonenumber;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getPurephonenumber()
/*     */   {
/* 169 */     return this.purephonenumber;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCity(String city)
/*     */   {
/* 175 */     this.city = city;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getCity()
/*     */   {
/* 181 */     return this.city;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setProvince(String province)
/*     */   {
/* 187 */     this.province = province;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getProvince()
/*     */   {
/* 193 */     return this.province;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCountry(String country)
/*     */   {
/* 199 */     this.country = country;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getCountry()
/*     */   {
/* 205 */     return this.country;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setLanguage(String language)
/*     */   {
/* 211 */     this.language = language;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getLanguage()
/*     */   {
/* 217 */     return this.language;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 223 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 229 */     return this.createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setModifyDate(Date modifyDate)
/*     */   {
/* 235 */     this.modifyDate = modifyDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getModifyDate()
/*     */   {
/* 241 */     return this.modifyDate;
/*     */   }
/*     */ }


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/UserWxinfoDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */