package com.myjob.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.entity.Company;
import com.myjob.model.CompanyRegisterModel;
import com.myjob.service.CompanyService;
import com.myjob.service.exception.ServiceLogicException;

@Controller
@RequestMapping("/register/company")
public class CompanyRegisterController extends ControllerBase {
	
	@Resource
	private CompanyService companyService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String register(@ModelAttribute CompanyRegisterModel model){
		return "register.company";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute CompanyRegisterModel model){
		try {
			companyService.create(convert(model, Company.class));
			return "redirect:/home/company";
		} catch (ServiceLogicException e) {
			return "register.company";
		}
	}
}
