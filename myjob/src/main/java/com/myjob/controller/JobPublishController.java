package com.myjob.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.Job;
import com.myjob.entity.values.AccountType;
import com.myjob.model.JobCreateModel;
import com.myjob.service.JobService;

@Controller
@RequestMapping("/job/publish")
@AuthPassport({AccountType.company})
public class JobPublishController extends ControllerBase {
	
	@Resource
	private JobService jobService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String publish(@ModelAttribute JobCreateModel model){
		return "/job/publish";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute JobCreateModel model){
		jobService.create(convert(model, Job.class));
		return "redirect:/job/search/my";
	}
}
