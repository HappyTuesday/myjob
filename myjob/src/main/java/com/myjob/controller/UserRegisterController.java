package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.model.UserRegisterModel;

@Controller
@RequestMapping({"/register/user"})
public class UserRegisterController {

	@RequestMapping(method=RequestMethod.GET)
	public String register(@ModelAttribute UserRegisterModel model){
		return "/register/user";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String registerSubmit(@ModelAttribute UserRegisterModel model){
		return "redirect:/home/user";
	}
}
