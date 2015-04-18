package com.myjob.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.myjob.entity.User;
import com.myjob.entity.values.Gender;
import com.myjob.entity.values.Qualification;
import com.myjob.entity.values.ResumeStatus;

public class ResumeCreateModel {
	private String school;
	private String profession;
	private Date graduatedDate;
	private String idCard;
	private Date birthday;
	private Gender gender;
	private String qualification;
	private Double workingYears;
	private String introduction;
	private String content;	
	private String status;
	private UserModel user;

}
