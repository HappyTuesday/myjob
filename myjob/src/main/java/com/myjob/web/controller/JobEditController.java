package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.entity.Job;
import com.myjob.entity.values.AccountType;
import com.myjob.service.JobService;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.JobEditModel;

@Controller
@RequestMapping("/job/edit")
@Allow(AccountType.company)
public class JobEditController extends ControllerBase {
	
	@Resource
	private JobService jobService;
	
	@RequestMapping(value="/{job_sid}",method=RequestMethod.GET)
	public String edit(@PathVariable long job_sid,Model models){
		JobEditModel model = convert(jobService.detail(job_sid), JobEditModel.class);
		models.addAttribute("model",model);
		return "job/edit";
	}
	
	@RequestMapping(value="/{job_sid}",method=RequestMethod.POST)
	public String update(@PathVariable long job_sid,@ModelAttribute JobEditModel model){
		Job job = convert(model, Job.class);
		job.setSid(job_sid);
		jobService.update(job);
		return "redirect:/job/search/my";
	}
}
