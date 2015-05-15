package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.entity.values.AccountType;
import com.myjob.service.ResumeService;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.ResumeModel;

@Controller
@RequestMapping("/resume")
@Allow({AccountType.company,AccountType.user})
public class ResumeController extends ControllerBase {
	
	@Resource
	private ResumeService resumeService;
	
	@RequestMapping(value="/{resume_sid}")
	public String detail(@PathVariable long resume_sid,Model models){
		ResumeModel model = convert(resumeService.detail(resume_sid), ResumeModel.class);
		models.addAttribute("resume",model);
		return "resume/detail";
	}
	
	@RequestMapping(value="/delete/{resume_sid}",method=RequestMethod.POST)
	@Allow(AccountType.user)
	@ResponseBody
	public boolean delete(@PathVariable long resume_sid){
		resumeService.delete(resume_sid);
		return true;
	}
	
	@RequestMapping(value="/active/{resume_sid}",method=RequestMethod.POST)
	@Allow(AccountType.user)
	@ResponseBody
	public boolean active(@PathVariable long resume_sid){
		resumeService.active(resume_sid);;
		return true;
	}
	
	@RequestMapping(value="/refresh/{resume_sid}",method=RequestMethod.POST)
	@Allow(AccountType.user)
	@ResponseBody
	public boolean refresh(@PathVariable long resume_sid){
		resumeService.refresh(resume_sid);;
		return true;
	}
}
