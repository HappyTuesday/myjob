package com.myjob.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
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
	
	@Column(name="company_sid")
	private long company_sid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="update_time")
	private Date updateTime;
	
	@Column(name="working_location_sid")
	private long workingLocationSid;
	
	@Column(name="profession")
	private String profession;
	
	@Column(name="qualification")
	private Qualification qualification;
	
	@Column(name="working_years")
	private Double workingYears;
	
	@Column(name="description")
	private String descripton;
	
	@Column(name="amount")
	private Integer amount;
	
	@Column(name="status")
	@Enumerated
	private JobStatus status;
	
	@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@JoinColumn(name="company_sid",nullable=false)
	private Company company;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="working_location_sid",nullable=false)
	private GeographicSite workingLocation;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public long getCompany_sid() {
		return company_sid;
	}

	public void setCompany_sid(long company_sid) {
		this.company_sid = company_sid;
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

	public long getWorkingLocation() {
		return workingLocationSid;
	}

	public void setWorkingLocation(long workingLocationSid) {
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

	public String getDescripton() {
		return descripton;
	}

	public void setDescripton(String descripton) {
		this.descripton = descripton;
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

	public long getWorkingLocationSid() {
		return workingLocationSid;
	}

	public void setWorkingLocationSid(long workingLocationSid) {
		this.workingLocationSid = workingLocationSid;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setWorkingLocation(GeographicSite workingLocation) {
		this.workingLocation = workingLocation;
	}
}