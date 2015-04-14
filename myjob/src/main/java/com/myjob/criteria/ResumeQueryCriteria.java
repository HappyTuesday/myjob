package com.myjob.criteria;

import java.util.Date;

import com.myjob.entity.values.Gender;
import com.myjob.entity.values.ResumeStatus;

public class ResumeQueryCriteria extends QueryCriteria {
	
	private Long userSid;
	
	private Gender[] gender;
	
	private Date[] graduateDate;
	
	private String[] profession;
	
	private String[] school;
	
	private Integer[] workingYears;
	
	private ResumeStatus status;

	public Long getUserSid() {
		return userSid;
	}

	public void setUserSid(Long userSid) {
		this.userSid = userSid;
	}

	public Gender[] getGender() {
		return gender;
	}

	public void setGender(Gender[] gender) {
		this.gender = gender;
	}

	public Date[] getGraduateDate() {
		return graduateDate;
	}

	public void setGraduateDate(Date[] graduateDate) {
		this.graduateDate = graduateDate;
	}

	public String[] getProfession() {
		return profession;
	}

	public void setProfession(String[] profession) {
		this.profession = profession;
	}

	public String[] getSchool() {
		return school;
	}

	public void setSchool(String[] school) {
		this.school = school;
	}

	public Integer[] getWorkingYears() {
		return workingYears;
	}

	public void setWorkingYears(Integer[] workingYears) {
		this.workingYears = workingYears;
	}

	public ResumeStatus getStatus() {
		return status;
	}

	public void setStatus(ResumeStatus status) {
		this.status = status;
	}
}
