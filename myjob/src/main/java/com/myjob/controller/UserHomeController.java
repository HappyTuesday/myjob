package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.values.AccountType;

@Controller
@RequestMapping({"/home/user"})
@AuthPassport({AccountType.user})
public class UserHomeController {

	@RequestMapping
	public String home(){
		return "forward:/jobs";
	}
}
