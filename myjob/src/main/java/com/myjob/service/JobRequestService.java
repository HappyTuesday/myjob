package com.myjob.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.common.QueryResult;
import com.myjob.criteria.JobRequestQueryCriteria;
import com.myjob.dao.JobRequestDao;
import com.myjob.entity.JobRequest;

@Service
public class JobRequestService {
	@Resource
	private JobRequestDao jobRequestDao;
	
	public QueryResult<JobRequest> querySentRequests(JobRequestQueryCriteria criteria,long userSid){
		criteria.setUserSid(userSid);
		return jobRequestDao.query(criteria);
	}
	
	public QueryResult<JobRequest> queryReceivedRequests(JobRequestQueryCriteria criteria,long companySid){
		criteria.setCompanySid(companySid);
		return jobRequestDao.query(criteria);
	}
}
