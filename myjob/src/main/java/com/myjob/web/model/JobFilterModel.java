package com.myjob.web.model;

import java.util.List;

import com.myjob.entity.values.Qualification;

public class JobFilterModel {
	private List<DisplayModel<String>> profession;
	
	private List<DisplayModel<Qualification>> qualification;
	
	private List<DisplayModel<String>> city;

	public List<DisplayModel<Qualification>> getQualification() {
		return qualification;
	}

	public void setQualification(List<DisplayModel<Qualification>> qualification) {
		this.qualification = qualification;
	}

	public List<DisplayModel<String>> getCity() {
		return city;
	}

	public void setCity(List<DisplayModel<String>> city) {
		this.city = city;
	}

	public List<DisplayModel<String>> getProfession() {
		return profession;
	}

	public void setProfession(List<DisplayModel<String>> profession) {
		this.profession = profession;
	}
}
