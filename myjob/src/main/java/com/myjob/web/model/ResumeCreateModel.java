package com.myjob.web.model;

import java.util.Date;

import com.myjob.entity.values.Gender;
import com.myjob.entity.values.MaritalStatus;
import com.myjob.entity.values.Qualification;

public class ResumeCreateModel {
	private String school;
	
	private String profession;
	
	private Date graduatedDate;
	
	private String idCard;
	
	private Date birthday;
	
	private Gender gender;
	
	private String recruitment;
	
	private String liveCity;
	
	private MaritalStatus maritalStatus;
	
	private String politialAffiliation;
	
	private Qualification qualification;
	
	private String phone;
	
	private String expectedJobProfession;
	
	private String expectedJobCity;
	
	private Double expectedSalary;
	
	private String currentWorkingStatus;
	
	private Double workingYears;
	
	private String certifications;
	
	private String introduction;
	
	private String content;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Date getGraduatedDate() {
		return graduatedDate;
	}

	public void setGraduatedDate(Date graduatedDate) {
		this.graduatedDate = graduatedDate;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRecruitment() {
		return recruitment;
	}

	public void setRecruitment(String recruitment) {
		this.recruitment = recruitment;
	}

	public String getLiveCity() {
		return liveCity;
	}

	public void setLiveCity(String liveCity) {
		this.liveCity = liveCity;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPolitialAffiliation() {
		return politialAffiliation;
	}

	public void setPolitialAffiliation(String politialAffiliation) {
		this.politialAffiliation = politialAffiliation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getExpectedJobProfession() {
		return expectedJobProfession;
	}

	public void setExpectedJobProfession(String expectedJobProfession) {
		this.expectedJobProfession = expectedJobProfession;
	}

	public String getExpectedJobCity() {
		return expectedJobCity;
	}

	public void setExpectedJobCity(String expectedJobCity) {
		this.expectedJobCity = expectedJobCity;
	}

	public Double getExpectedSalary() {
		return expectedSalary;
	}

	public void setExpectedSalary(Double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public String getCurrentWorkingStatus() {
		return currentWorkingStatus;
	}

	public void setCurrentWorkingStatus(String currentWorkingStatus) {
		this.currentWorkingStatus = currentWorkingStatus;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}
}
