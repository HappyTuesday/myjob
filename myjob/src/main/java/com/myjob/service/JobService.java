package com.myjob.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.common.QueryResult;
import com.myjob.criteria.JobQueryCriteria;
import com.myjob.dao.JobDao;
import com.myjob.entity.Job;
import com.myjob.entity.values.JobStatus;

@Service
public class JobService {
	@Resource
	private JobDao jobDao;
	
	public Job detail(long jobSid){
		return jobDao.get(jobSid);
	}
	
	public void disable(long jobSid){
		Job job=jobDao.get(jobSid);
		job.setStatus(JobStatus.disabled);
		jobDao.update(job);
	}
	
	public void update(Job job){
		Job jobp=jobDao.get(job.getSid());
		
		job.setStatus(jobp.getStatus());
		job.setWorkingLocationSid(jobp.getWorkingLocationSid());
		
		jobDao.update(job);
	}
	
	public void create(Job job){
		job.setUpdateTime(new Date());
		job.setStatus(JobStatus.active);
		jobDao.create(job);
	}
	
	public QueryResult<Job> search(JobQueryCriteria criteria){
		return jobDao.query(criteria);
	}
	
	public QueryResult<Job> queryMyPublishedJobs(JobQueryCriteria criteria,long companySid){
		criteria.setCompanySid(companySid);
		
		return jobDao.query(criteria);
	}
}
