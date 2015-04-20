package com.myjob.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.values.AccountType;
import com.myjob.model.JobModel;
import com.myjob.service.JobService;

@Controller
@RequestMapping("/job")
@AuthPassport({AccountType.company,AccountType.user})
public class JobController extends ControllerBase {
	
	@Resource
	private JobService jobService;
	
	@RequestMapping(value="/{job_sid}")
	public String detail(@PathVariable long job_sid,Model models){
		JobModel model = convert(jobService.detail(job_sid), JobModel.class);
		models.addAttribute(model);
		return "job.detail";
	}
	
	@RequestMapping(value="/delete/{job_sid}",method=RequestMethod.POST)
	@AuthPassport({AccountType.company})
	@ResponseBody
	public Object delete(@PathVariable long job_sid){
		// TODO: call service to delete the job with the given job sid.
		return true;
	}
}
