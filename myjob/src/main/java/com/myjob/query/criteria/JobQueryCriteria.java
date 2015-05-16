package com.myjob.query.criteria;

import com.myjob.entity.values.JobStatus;
import com.myjob.entity.values.Qualification;

public class JobQueryCriteria extends QueryCriteria {
	
	private Long companySid;
	
	private String[] profession;
	
	private Qualification[] qualification;
	
	private String[] city;
	
	private JobStatus status = JobStatus.active;

	public Long getCompanySid() {
		return companySid;
	}

	public void setCompanySid(Long companySid) {
		this.companySid = companySid;
	}

	public Qualification[] getQualification() {
		return qualification;
	}

	public void setQualification(Qualification[] qualification) {
		this.qualification = qualification;
	}

	public String[] getCity() {
		return city;
	}

	public void setCity(String[] city) {
		this.city = city;
	}

	public JobStatus getStatus() {
		return status;
	}

	public void setStatus(JobStatus status) {
		this.status = status;
	}

	public String[] getProfession() {
		return profession;
	}

	public void setProfession(String[] profession) {
		this.profession = profession;
	}
}
