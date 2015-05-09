package com.myjob.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.common.QueryResult;
import com.myjob.criteria.JobRequestQueryCriteria;
import com.myjob.dao.JobRequestDao;
import com.myjob.entity.JobRequest;
import com.myjob.entity.values.JobRequestStatus;
import com.myjob.service.exception.ServiceException;
import com.myjob.service.exception.ServiceLogicException;

@Service
public class JobResponseService {
	
	@Resource
	private JobRequestDao jobRequestDao;
	
	public void acceptRequest(long jobRequestSid,String hrRemark) throws ServiceException{
		JobRequest jobRequest = jobRequestDao.load(jobRequestSid);
		
		if(jobRequest.getStatus() != JobRequestStatus.requested){
			throw new ServiceLogicException(getClass(), "invalid jobrequest status in the database. must be requested");
		}
		
		jobRequest.setHrRemark(hrRemark);
		jobRequest.setStatus(JobRequestStatus.approved);
		jobRequest.setResponseTime(new Date());
		jobRequestDao.update(jobRequest);
	}
	
	public void rejectRequest(long jobRequestSid,String hrRemark) throws ServiceException{
		JobRequest jobRequest = jobRequestDao.load(jobRequestSid);
		
		if(jobRequest.getStatus() != JobRequestStatus.requested){
			throw new ServiceLogicException(getClass(), "invalid jobrequest status in the database. must be requested");
		}
		
		jobRequest.setHrRemark(hrRemark);
		jobRequest.setStatus(JobRequestStatus.rejected);
		jobRequest.setResponseTime(new Date());
		jobRequestDao.update(jobRequest);
	}
	
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
