package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.criteria.JobRequestQueryCriteria;
import com.myjob.entity.values.AccountType;
import com.myjob.service.JobResponseService;
import com.myjob.service.exception.ServiceException;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.JobRequestModel;
import com.myjob.web.model.JobResponseCreateModel;

@Controller
@RequestMapping("/job/response")
@Allow({AccountType.company,AccountType.user})
public class JobResponseController extends ControllerBase {
	
	@Resource
	private JobResponseService jobResponseService;
	
	@RequestMapping("/rejectRequest")
	@Allow(AccountType.company)
	@ResponseBody
	public boolean rejectRequest(@ModelAttribute JobResponseCreateModel model) throws ServiceException{
		jobResponseService.rejectRequest(model.getJobRequestSid(), model.getHrRemark());
		return true;
	}
	
	@RequestMapping("/acceptRequest")
	@Allow(AccountType.company)
	@ResponseBody
	public boolean acceptRequest(@ModelAttribute JobResponseCreateModel model) throws ServiceException{
		jobResponseService.acceptRequest(model.getJobRequestSid(), model.getHrRemark());
		return true;
	}
	
	@RequestMapping("/received")
	@Allow({AccountType.user})
	public String receivedResponse(@ModelAttribute JobRequestQueryCriteria criteria){
		return "job/response/received.list";
	}
	
	@RequestMapping("/sent")
	@Allow({AccountType.company})
	public String sentResponse(@ModelAttribute JobRequestQueryCriteria criteria){
		return "job/response/sent.list";
	}
	
	@RequestMapping("/received/data")
	@Allow({AccountType.user})
	@ResponseBody
	public Object receivedResponseData(@ModelAttribute JobRequestQueryCriteria criteria){
		return convertQueryResult(jobResponseService.queryReceivedResponses(criteria, loginAccountSid()),JobRequestModel.class);
	}
	
	@RequestMapping("/sent/data")
	@Allow({AccountType.company})
	@ResponseBody
	public Object sentResponseData(@ModelAttribute JobRequestQueryCriteria criteria){
		return convertQueryResult(jobResponseService.querySentResponses(criteria, loginAccountSid()),JobRequestModel.class);
	}
}
