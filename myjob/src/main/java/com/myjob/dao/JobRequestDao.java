package com.myjob.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.myjob.entity.JobRequest;

@Repository
public class JobRequestDao {
	@Resource HibernateTemplate template;
	
	public JobRequest get(long sid){
		return template.get(JobRequest.class, sid);
	}
	
	public void create(JobRequest jobRequest) {
		template.save(jobRequest);
	}
	
	public void update(JobRequest jobRequest) {
		template.update(jobRequest);
	}
}
