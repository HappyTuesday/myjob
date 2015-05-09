package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.criteria.JobRequestQueryCriteria;
import com.myjob.entity.JobRequest;
import com.myjob.entity.values.AccountType;
import com.myjob.service.JobRequestService;
import com.myjob.service.exception.ServiceException;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.JobRequestCreateModel;
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
	public Object postJobRequest(@ModelAttribute JobRequestCreateModel model) throws ServiceException{
		JobRequest jobRequest = convert(model, JobRequest.class);
		jobRequestService.createJobRequest(jobRequest,loginUser().getSid());
		return true;
	}
	
	@RequestMapping(value="/cancel/{jobRequestSid}")
	@Allow(AccountType.user)
	@ResponseBody
	public Object cancelRequest(@PathVariable long jobRequestSid) throws ServiceException{
		jobRequestService.cancelJobRequest(jobRequestSid);
		return true;
	}
	
	@RequestMapping(value="/sent")
	@Allow({AccountType.user})
	public String sentRequests(@ModelAttribute JobRequestQueryCriteria criteria){
		return "job/request/sent.list";
	}
	
	@RequestMapping(value="/received")
	@Allow({AccountType.company})
	public String receivedRequests(@ModelAttribute JobRequestQueryCriteria criteria){
		return "job/request/received.list";
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
