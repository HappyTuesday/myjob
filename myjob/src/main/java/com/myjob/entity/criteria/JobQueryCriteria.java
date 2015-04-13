package com.myjob.entity.criteria;

import com.myjob.entity.values.JobStatus;

public class JobQueryCriteria extends QueryCriteria {
	
	private Long companySid;
	
	private String[] companyName;
	
	private String[] category;
	
	private String[] profoession;
	
	private String[] city;
	
	private Long[] workingYears;
	
	private JobStatus status = JobStatus.active;

	public Long getCompanySid() {
		return companySid;
	}

	public void setCompanySid(Long companySid) {
		this.companySid = companySid;
	}

	public String[] getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String[] companyName) {
		this.companyName = companyName;
	}

	public String[] getCategory() {
		return category;
	}

	public void setCategory(String[] category) {
		this.category = category;
	}

	public String[] getProfoession() {
		return profoession;
	}

	public void setProfoession(String[] profoession) {
		this.profoession = profoession;
	}

	public String[] getCity() {
		return city;
	}

	public void setCity(String[] city) {
		this.city = city;
	}

	public Long[] getWorkingYears() {
		return workingYears;
	}

	public void setWorkingYears(Long[] workingYears) {
		this.workingYears = workingYears;
	}

	public JobStatus getStatus() {
		return status;
	}

	public void setStatus(JobStatus status) {
		this.status = status;
	}
}
