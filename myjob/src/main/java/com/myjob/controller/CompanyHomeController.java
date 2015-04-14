package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.values.AccountType;

@Controller
@RequestMapping({"/home/company"})
@AuthPassport({AccountType.company})
public class CompanyHomeController {
	
	@RequestMapping
	public String home(){
		return "forward:/resumes";
	}
}