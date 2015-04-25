package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.criteria.JobRequestQueryCriteria;
import com.myjob.entity.values.AccountType;
import com.myjob.service.JobResponseService;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.JobResponseModel;

@Controller
@RequestMapping("/job/response")
@Allow({AccountType.company,AccountType.user})
public class JobResponseController extends ControllerBase {
	
	@Resource
	private JobResponseService jobResponseService;
	
	@RequestMapping("/received")
	@Allow({AccountType.user})
	public String receivedResponse(@ModelAttribute JobRequestQueryCriteria criteria){
		return "job.responses";
	}
	
	@RequestMapping("/sent")
	@Allow({AccountType.company})
	public String sentResponse(@ModelAttribute JobRequestQueryCriteria criteria){
		return "job.responses";
	}
	
	@RequestMapping("/received/data")
	@Allow({AccountType.user})
	@ResponseBody
	public Object receivedResponseData(@ModelAttribute JobRequestQueryCriteria criteria){
		return convertQueryResult(jobResponseService.queryReceivedResponses(criteria, loginAccountSid()),JobResponseModel.class);
	}
	
	@RequestMapping("/sent/data")
	@Allow({AccountType.company})
	@ResponseBody
	public Object sentResponseData(@ModelAttribute JobRequestQueryCriteria criteria){
		return convertQueryResult(jobResponseService.querySentResponses(criteria, loginAccountSid()),JobResponseModel.class);
	}
}
