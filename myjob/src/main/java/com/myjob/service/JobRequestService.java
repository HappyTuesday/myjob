package com.myjob.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.dao.JobRequestDao;
import com.myjob.entity.Job;
import com.myjob.entity.JobRequest;
import com.myjob.entity.Resume;
import com.myjob.entity.values.JobRequestStatus;
import com.myjob.query.QueryResult;
import com.myjob.query.criteria.JobRequestQueryCriteria;
import com.myjob.service.exception.ServiceException;
import com.myjob.service.exception.ServiceLogicException;

@Service
public class JobRequestService {
	
	@Resource
	private JobRequestDao jobRequestDao;
	
	@Resource
	private JobService jobService;
	
	@Resource
	private ResumeService resumeService;
	
	public void createJobRequest(JobRequest jobRequest,long userSid) throws ServiceException{
		jobRequest.setRequestTime(new Date());
		jobRequest.setStatus(JobRequestStatus.requested);
		
		Resume activeResume = resumeService.getActiveResume(userSid);
		jobRequest.setResume(activeResume);
		
		Job job = jobService.load(jobRequest.getJobSid());
		jobRequest.setJob(job);
		
		jobRequestDao.create(jobRequest);
	}
	
	public void cancelJobRequest(long jobRequestSid) throws ServiceException{
		JobRequest jobRequest = jobRequestDao.get(jobRequestSid);
		
		if(jobRequest.getStatus() != JobRequestStatus.requested){
			throw new ServiceLogicException(getClass(),"Only the job request that in requested status can be canceled");
		}
		
		jobRequest.setStatus(JobRequestStatus.canceled);
		
		jobRequestDao.update(jobRequest);
	}
	
	public QueryResult<JobRequest> querySentRequests(JobRequestQueryCriteria criteria,long userSid){
		criteria.setUserSid(userSid);
		criteria.setRequestStatus(new JobRequestStatus[]{JobRequestStatus.requested});
		return jobRequestDao.query(criteria);
	}
	
	public QueryResult<JobRequest> queryReceivedRequests(JobRequestQueryCriteria criteria,long companySid){
		criteria.setCompanySid(companySid);
		criteria.setRequestStatus(new JobRequestStatus[]{JobRequestStatus.requested});
		return jobRequestDao.query(criteria);
	}
}
