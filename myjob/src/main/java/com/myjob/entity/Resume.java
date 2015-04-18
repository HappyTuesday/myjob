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
import com.myjob.entity.values.Qualification;
import com.myjob.entity.values.ResumeStatus;

@Entity
@Table(name="resume")
public class Resume {
	@Id
	@Column(name="sid",updatable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long sid;
	
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
	
	@Column(name="qualification")
	@Enumerated(EnumType.STRING)
	private Qualification qualification;
	
	@Column(name="working_years")
	private Double workingYears;
	
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
	@JoinColumn(name="user_sid",nullable=false)
	private User user;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
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
