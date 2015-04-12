package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.values.AccountType;

@Controller
@RequestMapping("/resume")
@AuthPassport({AccountType.company,AccountType.user})
public class ResumeController {
	
	@RequestMapping(value="/{resume_sid}")
	public String detail(@PathVariable long resume_sid){
		return "/resume/detail";
	}
	
	@RequestMapping(value="/delete/{resume_sid}",method=RequestMethod.POST)
	@AuthPassport(AccountType.user)
	@ResponseBody
	public boolean delete(@PathVariable long resume_sid){
		return true;
	}
	
	@RequestMapping(value="/active/{resume_sid}",method=RequestMethod.POST)
	@AuthPassport(AccountType.user)
	@ResponseBody
	public boolean active(@PathVariable long resume_sid){
		return true;
	}
	
	@RequestMapping(value="/refresh/{resume_sid}",method=RequestMethod.POST)
	@AuthPassport(AccountType.user)
	@ResponseBody
	public boolean refresh(@PathVariable long resume_sid){
		return true;
	}
}
