package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.entity.Resume;
import com.myjob.entity.values.AccountType;
import com.myjob.service.ResumeService;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.ResumeCreateModel;

@Controller
@RequestMapping("/resume/publish")
@Allow({AccountType.user})
public class ResumePublishController extends ControllerBase {
	
	@Resource
	private ResumeService resumeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String publish(@ModelAttribute ResumeCreateModel model){
		return "resume.publish";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute ResumeCreateModel model){
		Resume resume = convert(model, Resume.class);
		resume.setUser(loginUser());
		resumeService.create(resume);
		return "redirect:/resume/search";
	}
}
