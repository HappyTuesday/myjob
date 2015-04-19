package com.myjob.model;

import java.util.Date;

import com.myjob.entity.values.JobRequestStatus;

public class JobRequestModel {
	private String hrRemark;
	
	private JobRequestStatus status;
	
	private JobModel job;
	
	private ResumeModel resume;
	
	private Date requestTime;	
	
	private String requestComment;

	public String getHrRemark() {
		return hrRemark;
	}

	public void setHrRemark(String hrRemark) {
		this.hrRemark = hrRemark;
	}

	public JobRequestStatus getStatus() {
		return status;
	}

	public void setStatus(JobRequestStatus status) {
		this.status = status;
	}

	public JobModel getJob() {
		return job;
	}

	public void setJob(JobModel job) {
		this.job = job;
	}

	public ResumeModel getResume() {
		return resume;
	}

	public void setResume(ResumeModel resume) {
		this.resume = resume;
	}

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public String getRequestComment() {
		return requestComment;
	}

	public void setRequestComment(String requestComment) {
		this.requestComment = requestComment;
	}
	
}