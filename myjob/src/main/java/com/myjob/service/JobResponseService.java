package com.myjob.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.common.QueryResult;
import com.myjob.criteria.JobRequestQueryCriteria;
import com.myjob.dao.JobRequestDao;
import com.myjob.entity.JobRequest;
import com.myjob.entity.values.JobRequestStatus;

@Service
public class JobResponseService {
	
	@Resource
	private JobRequestDao jobRequestDao;
	
	public QueryResult<JobRequest> queryReceivedResponses(JobRequestQueryCriteria criteria,long userSid) {
		criteria.setUserSid(userSid);
		criteria.setRequestStatus(new JobRequestStatus[]{JobRequestStatus.approved,JobRequestStatus.rejected});
		return jobRequestDao.query(criteria);
	}
	
	public QueryResult<JobRequest> querySentResponses(JobRequestQueryCriteria criteria,long companySid){
		criteria.setCompanySid(companySid);
		criteria.setRequestStatus(new JobRequestStatus[]{JobRequestStatus.approved,JobRequestStatus.rejected});
		return jobRequestDao.query(criteria);
	}
}
