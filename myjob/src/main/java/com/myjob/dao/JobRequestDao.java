package com.myjob.dao;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import com.myjob.entity.JobRequest;
import com.myjob.query.QueryResult;
import com.myjob.query.criteria.JobRequestQueryCriteria;

@Repository
public class JobRequestDao extends BaseDao {
	
	public JobRequest load(long sid){
		return template.load(JobRequest.class, sid);
	}
	
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
		criteria.createAlias("job", "job");
		criteria.createAlias("resume", "resume");
		
		eq(criteria, "job.company.sid", qc.getCompanySid());
		eq(criteria, "resume.user.sid", qc.getUserSid());
		eq(criteria, "resume.sid",qc.getResumeSid());
		eq(criteria, "job.sid", qc.getJobSid());
		in(criteria, "status", qc.getRequestStatus());
		
		search(criteria, qc.getKey(), "job.name", "job.company.name", "resume.user.name", "requestComment","hrRemark");
		
		return executeQuery(criteria, qc);
	}
}
