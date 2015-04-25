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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.myjob.entity.values.JobStatus;
import com.myjob.entity.values.Qualification;

@Entity
@Table(name="job")
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid")
	private long sid;
	
	@Column(name="company_sid",insertable=false,updatable=false)
	private long companySid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="update_time")
	private Date updateTime;
	
	@Column(name="working_location_sid",insertable=false,updatable=false)
	private long workingLocationSid;
	
	@Column(name="profession")
	private String profession;
	
	@Column(name="qualification")
	@Enumerated(EnumType.STRING)
	private Qualification qualification;
	
	@Column(name="working_years")
	private Double workingYears;
	
	@Column(name="description")
	private String description;
	
	@Column(name="amount")
	private Integer amount;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private JobStatus status;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="company_sid",nullable=false,updatable=false)
	private Company company;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="working_location_sid",nullable=false)
	private GeographicSite workingLocation;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public long getCompanySid() {
		return companySid;
	}

	public void setCompanySid(long company_sid) {
		this.companySid = company_sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public long getWorkingLocationSid() {
		return workingLocationSid;
	}

	public void setWorkingLocationSid(long workingLocationSid) {
		this.workingLocationSid = workingLocationSid;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public Double getWorkingYears() {
		return workingYears;
	}

	public void setWorkingYears(Double workingYears) {
		this.workingYears = workingYears;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public JobStatus getStatus() {
		return status;
	}

	public void setStatus(JobStatus status) {
		this.status = status;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public GeographicSite getWorkingLocation() {
		return workingLocation;
	}

	public void setWorkingLocation(GeographicSite workingLocation) {
		this.workingLocation = workingLocation;
	}
}
