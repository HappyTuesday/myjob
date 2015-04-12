package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.model.CompanyRegisterModel;

@Controller
@RequestMapping("/register/company")
public class CompanyRegisterController {
	@RequestMapping(method=RequestMethod.GET)
	public String register(@ModelAttribute CompanyRegisterModel model){
		return "/register/company";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute CompanyRegisterModel model){
		// TODO: call service to create a new company
		return "redirect:/home/company";
	}
}
