package com.myjob.dao;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import com.myjob.entity.JobRequest;
import com.myjob.entity.criteria.JobRequestQueryCriteria;
import com.myjob.entity.criteria.QueryResult;

@Repository
public class JobRequestDao extends BaseDao {
	
	private String[] searchedProperties = "job.name,job.company.name,resume.user.name,requestComment,hrRemark".split(",");
	
	public JobRequest get(long sid){
		return template.get(JobRequest.class, sid);
	}
	
	public void create(JobRequest jobRequest) {
		template.save(jobRequest);
	}
	
	public void update(JobRequest jobRequest) {
		template.update(jobRequest);
	}
	
	public QueryResult<JobRequest> query(JobRequestQueryCriteria qc){
		DetachedCriteria criteria = DetachedCriteria.forClass(JobRequest.class);
		
		eq(criteria, "job.company.sid", qc.getCompanySid());
		eq(criteria, "resume.user.sid", qc.getUserSid());
		eq(criteria, "resume.sid",qc.getResumeSid());
		eq(criteria, "job.sid", qc.getJobSid());
		eq(criteria, "status", qc.getRequestStatus());
		search(criteria, searchedProperties, qc);
		
		return executeQuery(criteria, qc);
	}
}
