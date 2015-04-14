package com.myjob.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.model.UserRegisterModel;
import com.myjob.model.converter.UserRegisterConverter;
import com.myjob.service.UserService;
import com.myjob.service.exception.ServiceLogicException;

@Controller
@RequestMapping({"/register/user"})
public class UserRegisterController {
	
	@Resource
	private UserService userService;
	@Resource
	private UserRegisterConverter userRegisterConverter;

	@RequestMapping(method=RequestMethod.GET)
	public String register(@ModelAttribute UserRegisterModel model){
		return "/register/user";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String registerSubmit(@ModelAttribute UserRegisterModel model){
		try {
			userService.create(userRegisterConverter.toValue(model));
			return "redirect:/home/user";
		} catch (ServiceLogicException e) {
			return "/register/user";
		}
	}
}
