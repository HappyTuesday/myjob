package com.myjob.query.filter;

import java.util.List;

import com.myjob.entity.values.Qualification;

public class JobFilter {
	private List<String> profession;
	
	private List<Qualification> qualification;
	
	private List<String> city;

	public List<String> getProfession() {
		return profession;
	}

	public void setProfession(List<String> profession) {
		this.profession = profession;
	}

	public List<Qualification> getQualification() {
		return qualification;
	}

	public void setQualification(List<Qualification> qualification) {
		this.qualification = qualification;
	}

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}
}
