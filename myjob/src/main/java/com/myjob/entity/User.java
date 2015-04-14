package com.myjob.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.myjob.entity.values.UserStatus;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="sid",updatable=false)
	private long sid;
	
	@Column(name="name")
	private String name;

	@Column(name="status")
	@Enumerated
	private UserStatus status;
	
	@Column(name="create_date")
	private Date createDate;
	
	@OneToOne(cascade=CascadeType.ALL,optional=false)
	@PrimaryKeyJoinColumn
	private Account account;

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

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
