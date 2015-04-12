package com.myjob.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.dao.JobRequestDao;
import com.myjob.entity.JobRequest;
import com.myjob.entity.criteria.QueryCriteria;

@Service
public class JobRequestService {
	@Resource
	private JobRequestDao jobRequestDao;
	
	public List<JobRequest> querySentRequests(QueryCriteria criteria,long userSid){
		// TODO: call jobrequestdao to query data
		return new ArrayList<JobRequest>();
	}
	
	public List<JobRequest> queryReceivedRequests(QueryCriteria criteria,long companySid){
		// TODO: call jobrequestdao to query data
		return new ArrayList<JobRequest>();
	}
}
