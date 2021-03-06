package com.myjob.web.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.myjob.entity.values.Gender;
import com.myjob.entity.values.MaritalStatus;
import com.myjob.entity.values.Qualification;
import com.myjob.entity.values.ResumeStatus;

public class ResumeModel {
	private long sid;
	
	private String name;
	
	private String school;
	
	private String profession;

	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	private Date graduatedDate;

	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	private Date updateTime;
	
	private String idCard;

	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	private Date birthday;
	
	private String gender;
	
	private String recruitment;
	
	private String liveCity;
	
	private String maritalStatus;
	
	private String politialAffiliation;
	
	private String qualification;
	
	private String phone;
	
	private String expectedJobProfession;
	
	private String expectedJobCity;
	
	private Double expectedSalary;
	
	private String currentWorkingStatus;
	
	private Double workingYears;
	
	private String certifications;
	
	private String introduction;
	
	private String content;
	
	private String resumeStatus;
	
	private boolean isActive;
	
	private UserModel user;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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


	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getResumeStatus() {
		return resumeStatus;
	}

	public void setResumeStatus(String resumeStatus) {
		this.resumeStatus = resumeStatus;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
