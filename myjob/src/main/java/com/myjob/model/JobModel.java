package com.myjob.model;

import java.util.Date;

import com.myjob.entity.Company;
import com.myjob.entity.GeographicSite;
import com.myjob.entity.values.JobStatus;
import com.myjob.entity.values.Qualification;

public class JobModel {
	private long sid;
	private String name;
	private Date updateTime;
	private String profession;
	private String qualification;
	private Double workingYears;
	private String descripton;
	private Integer amount;
	private String status;
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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

}