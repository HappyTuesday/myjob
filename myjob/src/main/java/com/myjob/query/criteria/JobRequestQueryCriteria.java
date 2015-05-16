package com.myjob.query.criteria;

import com.myjob.entity.values.JobRequestStatus;

public class JobRequestQueryCriteria extends QueryCriteria {

	private Long companySid;
	
	private Long userSid;
	
	private Long resumeSid;
	
	private Long jobSid;
	
	private JobRequestStatus[] requestStatus;

	public Long getCompanySid() {
		return companySid;
	}

	public void setCompanySid(Long companySid) {
		this.companySid = companySid;
	}

	public Long getUserSid() {
		return userSid;
	}

	public void setUserSid(Long userSid) {
		this.userSid = userSid;
	}

	public Long getResumeSid() {
		return resumeSid;
	}

	public void setResumeSid(Long resumeSid) {
		this.resumeSid = resumeSid;
	}

	public JobRequestStatus[] getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(JobRequestStatus[] requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Long getJobSid() {
		return jobSid;
	}

	public void setJobSid(Long jobSid) {
		this.jobSid = jobSid;
	}
}
