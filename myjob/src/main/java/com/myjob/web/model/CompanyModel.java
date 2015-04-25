package com.myjob.web.model;

import com.myjob.entity.values.CompanyStatus;

public class CompanyModel {
	private long sid;
	
	private CompanyStatus status;
	
	private String name;
	
	private String category;
	
	private String description;
	
	private AccountModel account;
	
	private GeographicSiteModel location;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public CompanyStatus getStatus() {
		return status;
	}

	public void setStatus(CompanyStatus status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AccountModel getAccount() {
		return account;
	}

	public void setAccount(AccountModel account) {
		this.account = account;
	}

	public GeographicSiteModel getLocation() {
		return location;
	}

	public void setLocation(GeographicSiteModel location) {
		this.location = location;
	}
}
