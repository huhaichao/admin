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
/*     */ public class InfoDO
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private Integer id;
/*     */   private String userPhoneno;
/*     */   private String userSex;
/*     */   private Date userBirthday;
/*     */   private String userImage;
/*     */   private String userName;
/*     */   private String password;
/*     */   private String userWxno;
/*     */   private String userRole;
/*     */   private Date createDate;
/*     */   private String userStatus;
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
/*     */   public void setUserPhoneno(String userPhoneno)
/*     */   {
/*  61 */     this.userPhoneno = userPhoneno;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getUserPhoneno()
/*     */   {
/*  67 */     return this.userPhoneno;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserSex(String userSex)
/*     */   {
/*  73 */     this.userSex = userSex;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getUserSex()
/*     */   {
/*  79 */     return this.userSex;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserBirthday(Date userBirthday)
/*     */   {
/*  85 */     this.userBirthday = userBirthday;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getUserBirthday()
/*     */   {
/*  91 */     return this.userBirthday;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserImage(String userImage)
/*     */   {
/*  97 */     this.userImage = userImage;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getUserImage()
/*     */   {
/* 103 */     return this.userImage;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserName(String userName)
/*     */   {
/* 109 */     this.userName = userName;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getUserName()
/*     */   {
/* 115 */     return this.userName;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setPassword(String password)
/*     */   {
/* 121 */     this.password = password;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getPassword()
/*     */   {
/* 127 */     return this.password;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserWxno(String userWxno)
/*     */   {
/* 133 */     this.userWxno = userWxno;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getUserWxno()
/*     */   {
/* 139 */     return this.userWxno;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserRole(String userRole)
/*     */   {
/* 145 */     this.userRole = userRole;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getUserRole()
/*     */   {
/* 151 */     return this.userRole;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 157 */     this.createDate = createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 163 */     return this.createDate;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setUserStatus(String userStatus)
/*     */   {
/* 169 */     this.userStatus = userStatus;
/*     */   }
/*     */   
/*     */ 
/*     */   public String getUserStatus()
/*     */   {
/* 175 */     return this.userStatus;
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


/* Location:              /sy/BOOT-INF/classes/!/com/irevest/niu/domain/InfoDO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */