package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myjob.entity.values.AccountType;

@Controller
@RequestMapping({"/","/home","/index","/default"})
public class HomeController extends ControllerBase {
	
	@RequestMapping
	public String home(){
		if(loginAccountType() == AccountType.company){
			return "redirect:/home/company";
		}else if(loginAccountType() == AccountType.user){
			return "redirect:/home/user";
		}else{
			return "redirect:/jobs";
		}
	}
	
	@RequestMapping("/about")
	public String about(){
		return "/about";
	}
}
