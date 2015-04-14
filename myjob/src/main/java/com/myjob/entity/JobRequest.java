package com.myjob.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.myjob.entity.values.JobRequestStatus;

@Entity
@Table(name="job_request")
public class JobRequest {
	@Id
	@Column(name="job_sid",updatable=false)
	private long jobSid;
	
	@Id
	@Column(name="resume_sid",updatable=false)
	private long resumeSid;
	
	@Column(name="request_time",updatable=false)
	private Date requestTime;
	
	@Column(name="request_comment")
	private String requestComment;
	
	@Column(name="hr_remark")
	private String hrRemark;
	
	@Column(name="status")
	@Enumerated
	private JobRequestStatus status;
	
	@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@PrimaryKeyJoinColumn(name="job_sid")
	private Job job;
	
	@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@PrimaryKeyJoinColumn(name="resume_sid")
	private Resume resume;

	public long getJobSid() {
		return jobSid;
	}

	public void setJobSid(long jobSid) {
		this.jobSid = jobSid;
	}

	public long getResumeSid() {
		return resumeSid;
	}

	public void setResumeSid(long userSid) {
		this.resumeSid = userSid;
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

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}
}
