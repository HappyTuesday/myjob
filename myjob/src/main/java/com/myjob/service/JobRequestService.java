package com.myjob.service;

import java.util.Calendar;
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
import com.myjob.service.exception.ServiceLogicException;

@Service
public class JobRequestService {
	
	@Resource
	private JobRequestDao jobRequestDao;
	
	@Resource
	private JobService jobService;
	
	@Resource
	private ResumeService resumeService;
	
	public void createJobRequest(JobRequest jobRequest,long userSid){
		jobRequest.setRequestTime(new Date());
		jobRequest.setStatus(JobRequestStatus.requested);
		
		JobRequest previousRequest = getlastedRequestWithUserAndJob(userSid,jobRequest.getJobSid());
		if(previousRequest != null){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(previousRequest.getRequestTime());
			calendar.add(Calendar.DATE, 7);
			if(calendar.getTime().after(jobRequest.getRequestTime())){
				throw new ServiceLogicException("This job has been requested with a week ago.");
			}
		}
		
		Resume activeResume = resumeService.getActiveResume(userSid);
		jobRequest.setResume(activeResume);
		
		Job job = jobService.load(jobRequest.getJobSid());
		jobRequest.setJob(job);
		
		
		
		jobRequestDao.create(jobRequest);
	}
	
	private JobRequest getlastedRequestWithUserAndJob(long userSid,long jobSid) {
		JobRequestQueryCriteria criteria = new JobRequestQueryCriteria();
		criteria.setUserSid(userSid);
		criteria.setJobSid(jobSid);
		criteria.setRequestStatus(new JobRequestStatus[]{JobRequestStatus.approved,JobRequestStatus.rejected,JobRequestStatus.requested});
		criteria.setOrderby("requestTime");
		criteria.setDesc(true);
		criteria.setPageSize(1);
		QueryResult<JobRequest> requests = jobRequestDao.query(criteria);
		if(requests.getRecords().size() > 0){
			return requests.getRecords().get(0);
		}else{
			return null;
		}
	}
	
	public void cancelJobRequest(long jobRequestSid){
		JobRequest jobRequest = jobRequestDao.get(jobRequestSid);
		
		if(jobRequest.getStatus() != JobRequestStatus.requested){
			throw new ServiceLogicException("Only the job request that in requested status can be canceled");
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
