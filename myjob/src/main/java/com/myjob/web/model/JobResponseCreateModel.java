package com.myjob.web.model;

public class JobResponseCreateModel {
	
	private long jobRequestSid;
	
	private String hrRemark;

	public long getJobRequestSid() {
		return jobRequestSid;
	}

	public void setJobRequestSid(long jobRequestSid) {
		this.jobRequestSid = jobRequestSid;
	}

	public String getHrRemark() {
		return hrRemark;
	}

	public void setHrRemark(String hrRemark) {
		this.hrRemark = hrRemark;
	}
}