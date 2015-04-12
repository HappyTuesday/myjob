package com.myjob.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.dao.JobDao;
import com.myjob.entity.Job;
import com.myjob.entity.criteria.JobQueryCriteria;
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
		// TODO: merge job to jobp
		jobDao.update(jobp);
	}
	
	public void create(Job job){
		job.setUpdateTime(new Date());
		jobDao.create(job);
	}
	
	public List<Job> search(JobQueryCriteria criteria){
		// TODO: call dao to query data
		return new ArrayList<Job>();
	}
}
