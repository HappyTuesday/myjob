package com.myjob.web.model;

import java.util.Date;

import com.myjob.entity.values.JobRequestStatus;

public class JobResponseModel {
	private long jobSid;
	
	private long resumeSid;
	
	private String requestComment;
	
	private String hrRemark;
	
	private String jobRequestStatus;
	
	private JobModel job;
	
	private ResumeModel resume;
	
	private Date responseTime;

	public long getJobSid() {
		return jobSid;
	}

	public void setJobSid(long jobSid) {
		this.jobSid = jobSid;
	}

	public long getResumeSid() {
		return resumeSid;
	}

	public void setResumeSid(long resumeSid) {
		this.resumeSid = resumeSid;
	}

	public String getRequestComment() {
		return requestComment;
	}

	public void setRequestComment(String requestComment) {
		this.requestComment = requestComment;
	}

	public String getHrRemark() {
		return hrRemark;
	}

	public void setHrRemark(String hrRemark) {
		this.hrRemark = hrRemark;
	}
	

	public String getJobRequestStatus() {
		return jobRequestStatus;
	}

	public void setJobRequestStatus(String jobRequestStatus) {
		this.jobRequestStatus = jobRequestStatus;
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

	public Date getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}
}