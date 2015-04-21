package com.myjob.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myjob.auth.AuthPassport;
import com.myjob.criteria.JobQueryCriteria;
import com.myjob.entity.values.AccountType;
import com.myjob.model.JobModel;
import com.myjob.service.JobService;

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
	@AuthPassport(AccountType.company)
	public String searchMy(@ModelAttribute JobQueryCriteria criteria){
		return "job.search";
	}
	
	@RequestMapping("/data")
	public Object searchData(@ModelAttribute JobQueryCriteria criteria){
		return convertQueryResult(jobService.search(criteria), JobModel.class);
	}
	
	@RequestMapping("/my/data")
	@AuthPassport(AccountType.company)
	public Object searchMyData(@ModelAttribute JobQueryCriteria criteria){
		return convertQueryResult(jobService.queryMyPublishedJobs(criteria,loginAccountSid()), JobModel.class);
	}
}
