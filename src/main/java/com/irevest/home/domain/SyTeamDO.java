package com.irevest.home.domain;

import java.io.Serializable;



/**
 * 
 * 
 * @author yxx
 * @email yangxingxing1008@163.com
 * @date 2018-07-11 10:05:08
 */
public class SyTeamDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long tSyId;
	//名字
	private String tSyName;
	//图像地址
	private String tSySrc;
	//TWITTER地址
	private String tSyTwitterUrl;
	//SKYPE地址
	private String tSySkypeUrl;
	//FACEBOOK地址
	private String tSyFacebookUrl;
	//详细简介
	private String tSyContent;

	/**
	 * 设置：
	 */
	public void setTSyId(Long tSyId) {
		this.tSyId = tSyId;
	}
	/**
	 * 获取：
	 */
	public Long getTSyId() {
		return tSyId;
	}
	/**
	 * 设置：名字
	 */
	public void setTSyName(String tSyName) {
		this.tSyName = tSyName;
	}
	/**
	 * 获取：名字
	 */
	public String getTSyName() {
		return tSyName;
	}
	/**
	 * 设置：图像地址
	 */
	public void setTSySrc(String tSySrc) {
		this.tSySrc = tSySrc;
	}
	/**
	 * 获取：图像地址
	 */
	public String getTSySrc() {
		return tSySrc;
	}
	/**
	 * 设置：TWITTER地址
	 */
	public void setTSyTwitterUrl(String tSyTwitterUrl) {
		this.tSyTwitterUrl = tSyTwitterUrl;
	}
	/**
	 * 获取：TWITTER地址
	 */
	public String getTSyTwitterUrl() {
		return tSyTwitterUrl;
	}
	/**
	 * 设置：SKYPE地址
	 */
	public void setTSySkypeUrl(String tSySkypeUrl) {
		this.tSySkypeUrl = tSySkypeUrl;
	}
	/**
	 * 获取：SKYPE地址
	 */
	public String getTSySkypeUrl() {
		return tSySkypeUrl;
	}
	/**
	 * 设置：FACEBOOK地址
	 */
	public void setTSyFacebookUrl(String tSyFacebookUrl) {
		this.tSyFacebookUrl = tSyFacebookUrl;
	}
	/**
	 * 获取：FACEBOOK地址
	 */
	public String getTSyFacebookUrl() {
		return tSyFacebookUrl;
	}
	/**
	 * 设置：详细简介
	 */
	public void setTSyContent(String tSyContent) {
		this.tSyContent = tSyContent;
	}
	/**
	 * 获取：详细简介
	 */
	public String getTSyContent() {
		return tSyContent;
	}
}
