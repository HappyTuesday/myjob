package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.values.AccountType;
import com.myjob.model.JobCreateModel;

@Controller
@RequestMapping("/job/publish")
@AuthPassport({AccountType.company})
public class JobPublishController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String publish(@ModelAttribute JobCreateModel model){
		return "/job/publish";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute JobCreateModel model){
		// TODO: call service to create a new job.
		return "redirect:/job/search/my";
	}
}
