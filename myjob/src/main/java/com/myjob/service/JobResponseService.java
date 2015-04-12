package com.myjob.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myjob.entity.JobRequest;
import com.myjob.entity.criteria.QueryCriteria;

@Service
public class JobResponseService {
	
	public List<JobRequest> queryReceivedResponses(QueryCriteria criteria,long userSid) {
		// TODO: call dao to query data
		return new ArrayList<JobRequest>();
	}
	
	public List<JobRequest> querySentResponses(QueryCriteria criteria,long companySid){
		// TODO: call dao to query data
		return new ArrayList<JobRequest>();
	}
}
