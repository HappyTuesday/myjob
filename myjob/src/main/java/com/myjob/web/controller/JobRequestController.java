package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.criteria.JobRequestQueryCriteria;
import com.myjob.entity.values.AccountType;
import com.myjob.service.JobRequestService;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.JobRequestModel;

@Controller
@RequestMapping("/job/request")
@Allow({AccountType.user,AccountType.company})
public class JobRequestController extends ControllerBase {
	
	@Resource
	private JobRequestService jobRequestService;
	
	@RequestMapping(value="/post")
	@Allow(AccountType.user)
	@ResponseBody
	public Object postJobRequest(@ModelAttribute JobRequestModel model){
		return true;
	}
	
	@RequestMapping(value="/sent")
	@Allow({AccountType.user})
	public String sentRequests(@ModelAttribute JobRequestQueryCriteria criteria){
		return "job.requests";
	}
	
	@RequestMapping(value="/received")
	@Allow({AccountType.company})
	public String receivedRequests(@ModelAttribute JobRequestQueryCriteria criteria){
		return "job.requests";
	}
	
	@RequestMapping(value="/sent/data")
	@Allow({AccountType.user})
	@ResponseBody
	public Object sentRequestsData(@ModelAttribute JobRequestQueryCriteria criteria){
		return convertQueryResult(jobRequestService.querySentRequests(criteria, loginAccountSid()),JobRequestModel.class);
	}
	
	@RequestMapping(value="/received/data")
	@Allow({AccountType.company})
	@ResponseBody
	public Object receivedRequestsData(@ModelAttribute JobRequestQueryCriteria criteria){
		return convertQueryResult(jobRequestService.queryReceivedRequests(criteria, loginAccountSid()),JobRequestModel.class);
	}
}
