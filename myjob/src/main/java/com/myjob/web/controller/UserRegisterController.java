package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.entity.User;
import com.myjob.service.UserService;
import com.myjob.service.exception.ServiceLogicException;
import com.myjob.web.model.UserRegisterModel;

@Controller
@RequestMapping({"/register/user"})
public class UserRegisterController extends ControllerBase {
	
	@Resource
	private UserService userService;

	@RequestMapping(method=RequestMethod.GET)
	public String register(@ModelAttribute UserRegisterModel model){
		return "register.user";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String registerSubmit(@ModelAttribute UserRegisterModel model){
		try {
			userService.create(convert(model,User.class));
			return "redirect:/home/user";
		} catch (ServiceLogicException e) {
			return "register.user";
		}
	}
}
