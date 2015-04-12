package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.values.AccountType;

@Controller
@RequestMapping("/job/response")
@AuthPassport({AccountType.company,AccountType.user})
public class JobResponseController {
	
	@RequestMapping({"/received"})
	@AuthPassport({AccountType.user})
	public String receivedResponse(){
		return "/job/response";
	}
	
	@RequestMapping({"/sent"})
	@AuthPassport({AccountType.company})
	public String sentResponse(){
		return "job/response";
	}
}
