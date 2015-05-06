package com.myjob.web.model;

public class JobRequestCreateModel {
	
	private long jobSid;
	
	private String requestComment;

	public long getJobSid() {
		return jobSid;
	}

	public void setJobSid(long jobSid) {
		this.jobSid = jobSid;
	}

	public String getRequestComment() {
		return requestComment;
	}

	public void setRequestComment(String requestComment) {
		this.requestComment = requestComment;
	}
}