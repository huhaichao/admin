package com.irevest.niu.domain;

import java.io.Serializable;
import java.util.Date;

public class UserTradesDO
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String id;
  private String orderNo;
  private String orderAmount;
  private String factAmount;
  private String fEe;
  private String shUserId;
  private String businessName;
  private String businessAccount;
  private String staTus;
  private String userId;
  private String fromSite;
  private String toSite;
  private Date createDate;
  private Date modifyate;
  
  public String getId()
  {
    return this.id;
  }
  
  public void setId(String id)
  {
    this.id = id;
  }
  
  public Date getCreateDate()
  {
    return this.createDate;
  }
  
  public Date getModifyate()
  {
    return this.modifyate;
  }
  
  public void setCreateDate(Date createDate)
  {
    this.createDate = createDate;
  }
  
  public void setModifyate(Date modifyate)
  {
    this.modifyate = modifyate;
  }
  
  public String getOrderNo()
  {
    return this.orderNo;
  }
  
  public String getOrderAmount()
  {
    return this.orderAmount;
  }
  
  public String getFactAmount()
  {
    return this.factAmount;
  }
  
  public String getfEe()
  {
    return this.fEe;
  }
  
  public String getShUserId()
  {
    return this.shUserId;
  }
  
  public String getBusinessName()
  {
    return this.businessName;
  }
  
  public String getBusinessAccount()
  {
    return this.businessAccount;
  }
  
  public String getStaTus()
  {
    return this.staTus;
  }
  
  public String getUserId()
  {
    return this.userId;
  }
  
  public String getFromSite()
  {
    return this.fromSite;
  }
  
  public String getToSite()
  {
    return this.toSite;
  }
  
  public void setOrderNo(String orderNo)
  {
    this.orderNo = orderNo;
  }
  
  public void setOrderAmount(String orderAmount)
  {
    this.orderAmount = orderAmount;
  }
  
  public void setFactAmount(String factAmount)
  {
    this.factAmount = factAmount;
  }
  
  public void setfEe(String fEe)
  {
    this.fEe = fEe;
  }
  
  public void setShUserId(String shUserId)
  {
    this.shUserId = shUserId;
  }
  
  public void setBusinessName(String businessName)
  {
    this.businessName = businessName;
  }
  
  public void setBusinessAccount(String businessAccount)
  {
    this.businessAccount = businessAccount;
  }
  
  public void setStaTus(String staTus)
  {
    this.staTus = staTus;
  }
  
  public void setUserId(String userId)
  {
    this.userId = userId;
  }
  
  public void setFromSite(String fromSite)
  {
    this.fromSite = fromSite;
  }
  
  public void setToSite(String toSite)
  {
    this.toSite = toSite;
  }
}
