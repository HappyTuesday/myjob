package com.myjob.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.myjob.entity.Job;

@Repository
public class JobDao {
	@Resource HibernateTemplate template;
	
	public Job get(long sid){
		return template.get(Job.class, sid);
	}
	
	public void create(Job job) {
		template.save(job);
	}
	
	public void update(Job job){
		template.update(job);
	}
}
