package com.irevest.niu.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 意见信息表
 * 
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-12-11 23:32:43
 */
public class HomeAdviceDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long cid;
	//提出人姓名
	private String name;
	//邮箱地址
	private String email;
	//内容
	private String content;
	//创建时间
	private Date gtmCreate;

	/**
	 * 设置：
	 */
	public void setCid(Long cid) {
		this.cid = cid;
	}
	/**
	 * 获取：
	 */
	public Long getCid() {
		return cid;
	}
	/**
	 * 设置：提出人姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：提出人姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：邮箱地址
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：邮箱地址
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：创建时间
	 */
	public void setGtmCreate(Date gtmCreate) {
		this.gtmCreate = gtmCreate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getGtmCreate() {
		return gtmCreate;
	}
}
