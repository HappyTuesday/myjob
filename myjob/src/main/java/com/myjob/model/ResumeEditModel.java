package com.myjob.model;

import java.util.Date;

import com.myjob.entity.values.Gender;
import com.myjob.entity.values.Qualification;
import com.myjob.entity.values.ResumeStatus;

public class ResumeEditModel {
	private long sid;
	
	private String school;
	
	private String profession;
	
	private Date graduatedDate;
	
	private String idCard;
	
	private String birthday;
	
	private Gender gender;
	
	private Qualification qualification;
	
	private Double workingYears;
	
	private String introduction;
	
	private String content;	
	
	private ResumeStatus status;

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

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
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

	public ResumeStatus getStatus() {
		return status;
	}

	public void setStatus(ResumeStatus status) {
		this.status = status;
	}
}
