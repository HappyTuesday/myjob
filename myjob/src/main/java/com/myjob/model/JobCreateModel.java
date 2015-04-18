package com.myjob.model;

import com.myjob.entity.Company;
import com.myjob.entity.GeographicSite;
import com.myjob.entity.values.JobStatus;
import com.myjob.entity.values.Qualification;

public class JobCreateModel {
	private String name;
	private String profession;
	private String qualification;
	private Double workingYears;
	private String descripton;
	private Integer amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public GeographicSiteModel getWorkingLocation() {
		return workingLocation;
	}
	public void setWorkingLocation(GeographicSiteModel workingLocation) {
		this.workingLocation = workingLocation;
	}
	private GeographicSiteModel workingLocation;
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
