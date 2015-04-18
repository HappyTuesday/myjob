package com.myjob.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.auth.AuthPassport;
import com.myjob.criteria.JobRequestQueryCriteria;
import com.myjob.entity.values.AccountType;
import com.myjob.model.JobRequestModel;
import com.myjob.service.JobRequestService;

@Controller
@RequestMapping("/job/request")
@AuthPassport({AccountType.user,AccountType.company})
public class JobRequestController extends ControllerBase {
	
	@Resource
	private JobRequestService jobRequestService;
	
	@RequestMapping(value="/sent")
	@AuthPassport({AccountType.user})
	public String sentRequests(@ModelAttribute JobRequestQueryCriteria criteria){
		return "/job/requests";
	}
	
	@RequestMapping(value="/received")
	@AuthPassport({AccountType.company})
	public String receivedRequests(@ModelAttribute JobRequestQueryCriteria criteria){
		return "job/requests";
	}
	
	@RequestMapping(value="/sent/data")
	@AuthPassport({AccountType.user})
	@ResponseBody
	public Object sentRequestsData(@ModelAttribute JobRequestQueryCriteria criteria){
		return convertQueryResult(jobRequestService.querySentRequests(criteria, loginAccountSid()),JobRequestModel.class);
	}
	
	@RequestMapping(value="/received/data")
	@AuthPassport({AccountType.company})
	@ResponseBody
	public Object receivedRequestsData(@ModelAttribute JobRequestQueryCriteria criteria){
		return convertQueryResult(jobRequestService.queryReceivedRequests(criteria, loginAccountSid()),JobRequestModel.class);
	}
}
