package com.myjob.model;

import org.springframework.core.convert.ConversionService;

public class JobEditModel {
	private String name;
	private String profession;
	private String qualification;
	private Double workingYears;
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
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	private String descripton;
	private long sid;

}
