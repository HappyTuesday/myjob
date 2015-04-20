package com.myjob.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.Job;
import com.myjob.entity.values.AccountType;
import com.myjob.model.JobEditModel;
import com.myjob.service.JobService;

@Controller
@RequestMapping("/job/edit")
@AuthPassport({AccountType.company})
public class JobEditController extends ControllerBase {
	
	@Resource
	private JobService jobService;
	
	@RequestMapping(value="/{job_sid}",method=RequestMethod.GET)
	public String edit(@PathVariable long job_sid,Model models){
		JobEditModel model = convert(jobService.detail(job_sid), JobEditModel.class);
		models.addAttribute(model);
		return "job.edit";
	}
	
	@RequestMapping(value="/{job_sid}",method=RequestMethod.POST)
	public String update(@PathVariable long job_sid,@ModelAttribute JobEditModel model){
		jobService.update(convert(model, Job.class));
		return "redirect:/jobs/my";
	}
}
