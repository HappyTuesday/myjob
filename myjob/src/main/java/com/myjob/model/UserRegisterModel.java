package com.myjob.model;

import com.myjob.entity.Account;


public class UserRegisterModel {
	private String name;
	private Account account;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

}