package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.values.AccountType;
import com.myjob.model.ResumeCreateModel;

@Controller
@RequestMapping("/resume/publish")
@AuthPassport({AccountType.user})
public class ResumePublishController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String publish(@ModelAttribute ResumeCreateModel model){
		return "/resume/publish";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute ResumeCreateModel model){
		return "redirect:/resumes";
	}
}
