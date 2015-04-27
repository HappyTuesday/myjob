package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.criteria.JobQueryCriteria;
import com.myjob.entity.values.AccountType;
import com.myjob.service.JobService;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.JobModel;

@Controller
@RequestMapping("/job/search")
public class JobSearchController extends ControllerBase {
	
	@Resource
	private JobService jobService;
	
	@RequestMapping
	public String search(@ModelAttribute JobQueryCriteria criteria){
		return "job.search";
	}
	
	@RequestMapping("/my")
	@Allow(AccountType.company)
	public String searchMy(@ModelAttribute JobQueryCriteria criteria){
		return "job.search.my";
	}
	
	@RequestMapping("/data")
	@ResponseBody
	public Object searchData(@ModelAttribute JobQueryCriteria criteria){
		return convertQueryResult(jobService.search(criteria), JobModel.class);
	}
	
	@RequestMapping("/my/data")
	@Allow(AccountType.company)
	@ResponseBody
	public Object searchMyData(@ModelAttribute JobQueryCriteria criteria){
		return convertQueryResult(jobService.queryMyPublishedJobs(criteria,loginAccountSid()), JobModel.class);
	}
}
