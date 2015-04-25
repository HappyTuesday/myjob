package com.myjob.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myjob.entity.values.AccountType;
import com.myjob.web.auth.Allow;

@Controller
@RequestMapping({"/home/company"})
@Allow({AccountType.company})
public class CompanyHomeController extends ControllerBase {
	
	@RequestMapping
	public String home(){
		return "forward:/resume/search";
	}
}