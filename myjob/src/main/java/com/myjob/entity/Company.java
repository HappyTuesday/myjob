package com.myjob.entity;

import java.util.Date;

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

import com.myjob.entity.values.CompanyStatus;

@Entity
@Table(name="company")
public class Company {
	@Id
	@Column(name="sid",insertable=false,updatable=false)
	private long sid;
	
	@Column(name="name")
	private String name;

	@Column(name="location_sid",insertable=false,updatable=false)
	private long locationSid;
	
	@Column(name="category")
	private String category;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private CompanyStatus status;
	
	@Column(name="create_date")
	private Date createDate;
	
	@OneToOne(cascade=CascadeType.ALL,optional=false)
	@JoinColumn(name="sid",nullable=false)
	private Account account;
	
	@OneToOne(cascade=CascadeType.ALL,optional=false)
	@JoinColumn(name="location_sid",nullable=false)
	private GeographicSite location;

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

	public long getLocation_sid() {
		return locationSid;
	}

	public void setLocation_sid(long location_sid) {
		this.locationSid = location_sid;
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

	public CompanyStatus getStatus() {
		return status;
	}

	public void setStatus(CompanyStatus status) {
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

	public GeographicSite getLocation() {
		return location;
	}

	public void setLocation(GeographicSite location) {
		this.location = location;
	}
}
