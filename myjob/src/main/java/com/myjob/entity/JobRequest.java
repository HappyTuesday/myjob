package com.myjob.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.myjob.entity.values.JobRequestStatus;

@Entity
@Table(name="job_request")
public class JobRequest implements Serializable {
	
	private static final long serialVersionUID = 6800535403816564306L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid")
	private long sid;

	@Column(name="job_sid",insertable=false,updatable=false)
	private long jobSid;
	
	@Column(name="resume_sid",insertable=false,updatable=false)
	private long resumeSid;
	
	@Column(name="request_time",updatable=false)
	private Date requestTime;
	
	@Column(name="response_time")
	private Date responseTime;
	
	@Column(name="request_comment")
	private String requestComment;
	
	@Column(name="hr_remark")
	private String hrRemark;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private JobRequestStatus status;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="job_sid",nullable=false,updatable=false)
	private Job job;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="resume_sid",nullable=false,updatable=false)
	private Resume resume;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

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

	public Date getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
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
