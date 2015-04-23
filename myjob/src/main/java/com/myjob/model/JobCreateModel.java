package com.myjob.model;

import com.myjob.entity.values.Qualification;

public class JobCreateModel {
	private String name;
	
	private String profession;
	
	private Qualification qualification;
	
	private GeographicSiteModel workingLocation;
	
	private double workingYears;
	
	private String description;
	
	private int amount;

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

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public double getWorkingYears() {
		return workingYears;
	}

	public void setWorkingYears(double workingYears) {
		this.workingYears = workingYears;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public GeographicSiteModel getWorkingLocation() {
		return workingLocation;
	}

	public void setWorkingLocation(GeographicSiteModel workingLocation) {
		this.workingLocation = workingLocation;
	}
}
