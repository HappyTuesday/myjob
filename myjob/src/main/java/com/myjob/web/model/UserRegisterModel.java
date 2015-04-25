package com.myjob.web.model;

public class UserRegisterModel {
	private String name;
	
	private AccountModel account;

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
}