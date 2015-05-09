package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.entity.Job;
import com.myjob.entity.values.AccountType;
import com.myjob.service.JobService;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.JobCreateModel;

@Controller
@RequestMapping("/job/publish")
@Allow({AccountType.company})
public class JobPublishController extends ControllerBase {
	
	@Resource
	private JobService jobService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String publish(@ModelAttribute JobCreateModel model){
		return "job/publish";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute JobCreateModel model,BindingResult result){
		if(result.hasErrors()){
			return "job/publish";
		}
		
		Job job = convert(model, Job.class);
		job.setCompany(loginCompany());
		jobService.create(job);
		return "redirect:/job/search/my";
	}
}
