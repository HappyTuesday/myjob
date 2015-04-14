package com.myjob.dao;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import com.myjob.common.QueryResult;
import com.myjob.criteria.JobQueryCriteria;
import com.myjob.entity.Job;

@Repository
public class JobDao extends BaseDao {
	
	private String[] searchedProperties = "company.category,company.description,company.name,description,name,profession,qualification,workingLocation.city,workingLocation.province".split(",");
	
	public Job get(long sid){
		return template.get(Job.class, sid);
	}
	
	public void create(Job job) {
		template.save(job);
	}
	
	public void update(Job job){
		template.update(job);
	}
	
	public QueryResult<Job> query(JobQueryCriteria qc){
		DetachedCriteria criteria = DetachedCriteria.forClass(Job.class);
		
		eq(criteria, "company.sid", qc.getCompanySid());
		eq(criteria, "status", qc.getStatus());
		in(criteria, "company.name", qc.getCompanyName());
		in(criteria, "company.category", qc.getCategory());
		in(criteria, "profession", qc.getProfoession());
		search(criteria, searchedProperties, qc);
		
		return executeQuery(criteria, qc);
	}
}
