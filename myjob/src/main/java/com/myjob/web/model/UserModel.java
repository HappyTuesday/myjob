package com.myjob.web.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.myjob.entity.values.UserStatus;

public class UserModel {
	private long sid;
	
	private String name;
	
	private AccountModel account;

	@JsonFormat(pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createDate;
	
	private String userStatus;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountModel getAccount() {
		return account;
	}

	public void setAccount(AccountModel account) {
		this.account = account;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
}
