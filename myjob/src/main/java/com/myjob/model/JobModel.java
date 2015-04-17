package com.myjob.model;

import java.util.Date;

import com.myjob.entity.Company;
import com.myjob.entity.GeographicSite;
import com.myjob.entity.values.JobStatus;
import com.myjob.entity.values.Qualification;

public class JobModel {
	private long sid;
	private long company_sid;
	private String name;
	private Date updateTime;
	private String profession;
	private Qualification qualification;
	private Double workingYears;
	private String descripton;
	private Integer amount;
	private JobStatus status;
	private Company company;
	private GeographicSite workingLocation;
}