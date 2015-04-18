package com.myjob.model;

import java.util.Date;

import com.myjob.entity.values.JobRequestStatus;

public class JobResponseModel {
	private long jobSid;
	private long resumeSid;
	private String requestComment;
	private String hrRemark;
	private String status;
	private JobModel job;
	private ResumeModel resume;
	private Date responseTime;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}