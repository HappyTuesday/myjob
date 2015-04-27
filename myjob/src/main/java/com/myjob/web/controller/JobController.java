package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.entity.values.AccountType;
import com.myjob.service.JobService;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.JobModel;

@Controller
@RequestMapping("/job")
@Allow({AccountType.company,AccountType.user})
public class JobController extends ControllerBase {
	
	@Resource
	private JobService jobService;
	
	@RequestMapping(value="/{job_sid}")
	public String detail(@PathVariable long job_sid,Model models){
		JobModel model = convert(jobService.detail(job_sid), JobModel.class);
		models.addAttribute(model);
		return "job.detail";
	}
	
	@RequestMapping(value="/unshelve/{job_sid}",method=RequestMethod.POST)
	@Allow({AccountType.company})
	@ResponseBody
	public Object unshelve(@PathVariable long job_sid){
		jobService.disable(job_sid);
		return true;
	}
	
	@RequestMapping(value="/refresh/{job_sid}",method=RequestMethod.POST)
	@Allow({AccountType.company})
	@ResponseBody
	public Object refresh(@PathVariable long job_sid){
		jobService.refresh(job_sid);
		return true;
	}
}
