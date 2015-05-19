package com.myjob.web.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.myjob.entity.values.JobStatus;
import com.myjob.entity.values.Qualification;

public class JobModel {
	
	private long sid;

	private String name;

	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	private Date updateTime;

	private String profession;

	private String qualification;

	private Double workingYears;
	
	private String description;
	
	private Integer amount;
	
	private Double salary;
	
	private String jobStatus;
	
	private CompanyModel company;
	
	private GeographicSiteModel workingLocation;

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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
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
	
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getjobStatus() {
		return jobStatus;
	}

	public void setjobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public CompanyModel getCompany() {
		return company;
	}

	public void setCompany(CompanyModel company) {
		this.company = company;
	}

	public GeographicSiteModel getWorkingLocation() {
		return workingLocation;
	}

	public void setWorkingLocation(GeographicSiteModel workingLocation) {
		this.workingLocation = workingLocation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
