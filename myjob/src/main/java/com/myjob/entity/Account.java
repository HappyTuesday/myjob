package com.myjob.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.myjob.entity.values.AccountType;

@Entity
@Table(name="account")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid",updatable=false)
	private long sid;
	
	@Column(name="login_name",updatable=false)
	private String loginName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="account_type",updatable=false)
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	@OneToOne(cascade=CascadeType.ALL,optional=true)
	@PrimaryKeyJoinColumn
	private User user;
	
	@OneToOne(cascade=CascadeType.ALL,optional=true)
	@PrimaryKeyJoinColumn
	private Company company;

	public long getSid() {
		return sid;
	}
	
	public void setSid(long sid) {
		this.sid = sid;
	}
	
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType type) {
		this.accountType = type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}