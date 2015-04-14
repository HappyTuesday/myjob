package com.myjob.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.model.CompanyRegisterModel;
import com.myjob.model.converter.CompanyRegisterConverter;
import com.myjob.service.CompanyService;
import com.myjob.service.exception.ServiceLogicException;

@Controller
@RequestMapping("/register/company")
public class CompanyRegisterController {
	
	@Resource
	private CompanyService companyService;
	@Resource
	private CompanyRegisterConverter companyRegisterConverter;
	
	@RequestMapping(method=RequestMethod.GET)
	public String register(@ModelAttribute CompanyRegisterModel model){
		return "/register/company";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute CompanyRegisterModel model){
		try {
			companyService.create(companyRegisterConverter.toValue(model));
			return "redirect:/home/company";
		} catch (ServiceLogicException e) {
			return "/register/company";
		}
	}
}
