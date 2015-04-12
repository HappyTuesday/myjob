package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.values.AccountType;
import com.myjob.model.JobEditModel;

@Controller
@RequestMapping("/job/edit")
@AuthPassport({AccountType.company})
public class JobEditController {
	
	@RequestMapping(value="/{job_sid}",method=RequestMethod.GET)
	public String edit(@PathVariable long job_sid){
		return "/job/edit";
	}
	
	@RequestMapping(value="/{job_sid}",method=RequestMethod.POST)
	public String update(@PathVariable long job_sid,@ModelAttribute JobEditModel model){
		// TODO: call service to update 
		return "redirect:/jobs/my";
	}
}
