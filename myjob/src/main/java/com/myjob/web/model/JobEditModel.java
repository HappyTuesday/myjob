package com.myjob.web.model;

import com.myjob.entity.values.Qualification;

public class JobEditModel {
	
	private long sid;
	
	private String name;
	
	private String profession;
	
	private String qualification;
	
	private int amount;
	
	private Double salary;
	
	private GeographicSiteModel workingLocation;
	
	private Double workingYears;
	
	private String description;

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

	public GeographicSiteModel getWorkingLocation() {
		return workingLocation;
	}

	public void setWorkingLocation(GeographicSiteModel workingLocation) {
		this.workingLocation = workingLocation;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
