package com.myjob.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.myjob.entity.values.Gender;
import com.myjob.entity.values.MaritalStatus;
import com.myjob.entity.values.Qualification;
import com.myjob.entity.values.ResumeStatus;

@Entity
@Table(name="resume")
public class Resume {
	
	@Id
	@Column(name="sid",updatable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long sid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="user_sid",insertable=false,updatable=false)
	private long userSid;
	
	@Column(name="school")
	private String school;
	
	@Column(name="profession")
	private String profession;
	
	@Column(name="graduated_date")
	private Date graduatedDate;
	
	@Column(name="id_card")
	private String idCard;
	
	@Column(name="birthday")
	private Date birthday;
	
	@Column(name="gender")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(name="recruitment")
	private String recruitment;
	
	@Column(name="live_city")
	private String liveCity;
	
	@Column(name="marital_status")
	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;
	
	@Column(name="political_affiliation")
	private String politialAffiliation;
	
	@Column(name="qualification")
	@Enumerated(EnumType.STRING)
	private Qualification qualification;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="expected_job_profession")
	private String expectedJobProfession;
	
	@Column(name="expected_job_city")
	private String expectedJobCity;
	
	@Column(name="expected_salary")
	private Double expectedSalary;
	
	@Column(name="current_working_status")
	private String currentWorkingStatus;
	
	@Column(name="working_years")
	private Double workingYears;
	
	@Column(name="certifications")
	private String certifications;
	
	@Column(name="introduction")
	private String introduction;
	
	@Column(name="content")
	private String content;
	
	@Column(name="update_time")
	private Date updateTime;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private ResumeStatus status;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="user_sid",nullable=false,updatable=false)
	private User user;

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

	public long getUserSid() {
		return userSid;
	}

	public void setUserSid(long userSid) {
		this.userSid = userSid;
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

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
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

	public Double getWorkingYears() {
		return workingYears;
	}

	public void setWorkingYears(Double workingYears) {
		this.workingYears = workingYears;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public ResumeStatus getStatus() {
		return status;
	}

	public void setStatus(ResumeStatus status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
