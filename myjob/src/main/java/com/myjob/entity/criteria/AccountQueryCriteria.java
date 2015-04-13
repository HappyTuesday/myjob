package com.myjob.entity.criteria;

public class AccountQueryCriteria extends QueryCriteria {

	private String loginName;
	
	private String email;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
