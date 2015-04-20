package com.myjob.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.auth.AuthPassport;
import com.myjob.criteria.JobRequestQueryCriteria;
import com.myjob.entity.values.AccountType;
import com.myjob.model.JobResponseModel;
import com.myjob.service.JobResponseService;

@Controller
@RequestMapping("/job/response")
@AuthPassport({AccountType.company,AccountType.user})
public class JobResponseController extends ControllerBase {
	
	@Resource
	private JobResponseService jobResponseService;
	
	@RequestMapping("/received")
	@AuthPassport({AccountType.user})
	public String receivedResponse(@ModelAttribute JobRequestQueryCriteria criteria){
		return "job.responses";
	}
	
	@RequestMapping("/sent")
	@AuthPassport({AccountType.company})
	public String sentResponse(@ModelAttribute JobRequestQueryCriteria criteria){
		return "job.responses";
	}
	
	@RequestMapping("/received/data")
	@AuthPassport({AccountType.user})
	@ResponseBody
	public Object receivedResponseData(@ModelAttribute JobRequestQueryCriteria criteria){
		return convertQueryResult(jobResponseService.queryReceivedResponses(criteria, loginAccountSid()),JobResponseModel.class);
	}
	
	@RequestMapping("/sent/data")
	@AuthPassport({AccountType.company})
	@ResponseBody
	public Object sentResponseData(@ModelAttribute JobRequestQueryCriteria criteria){
		return convertQueryResult(jobResponseService.querySentResponses(criteria, loginAccountSid()),JobResponseModel.class);
	}
}
