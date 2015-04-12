package com.myjob.auth;

import java.io.Serializable;
import java.util.Date;

public class Ticket implements Serializable{
	private static final long serialVersionUID = -3129400788646863647L;
	
	private String loginName;
	private String password;
	private Date createTime;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
