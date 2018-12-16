package com.irevest.niu.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 问题订单表
 * 
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-12-13 16:11:52
 */
public class QustionOrderDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer id;
	//未支付订单_id
	private Integer orderId;
	//未支付订单号
	private String orderNo;
	//处理人
	private String opUser;
	//处理状态
	private String status;
	//问题类型
	private String qustionType;
	//创建时间
	private Date createDate;
	//修改时间
	private Date modifyDate;
	//备注
	private String remark;

	/**
	 * 设置：主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：未支付订单_id
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：未支付订单_id
	 */
	public Integer getOrderId() {
		return orderId;
	}
	/**
	 * 设置：未支付订单号
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * 获取：未支付订单号
	 */
	public String getOrderNo() {
		return orderNo;
	}
	/**
	 * 设置：处理人
	 */
	public void setOpUser(String opUser) {
		this.opUser = opUser;
	}
	/**
	 * 获取：处理人
	 */
	public String getOpUser() {
		return opUser;
	}
	/**
	 * 设置：处理状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：处理状态
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：问题类型
	 */
	public void setQustionType(String qustionType) {
		this.qustionType = qustionType;
	}
	/**
	 * 获取：问题类型
	 */
	public String getQustionType() {
		return qustionType;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * 设置：修改时间
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getModifyDate() {
		return modifyDate;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
}
