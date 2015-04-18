package com.myjob.model;

import java.util.Date;

import com.myjob.entity.values.JobRequestStatus;

public class JobResponseModel {
	private long jobSid;
	private long resumeSid;
	private String requestComment;
	private String hrRemark;
	private JobRequestStatus status;
	private JobModel job;
	private ResumeModel resume;
	
	private Date requestTime;
}