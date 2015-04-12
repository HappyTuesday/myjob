package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.values.AccountType;

@Controller
@RequestMapping("/job/request")
@AuthPassport({AccountType.user,AccountType.company})
public class JobRequestController {
	
	@RequestMapping(value="/sent")
	@AuthPassport({AccountType.user})
	public String sentRequests(){
		return "/job/request";
	}
	
	@RequestMapping(value="/received")
	@AuthPassport({AccountType.company})
	public String receivedRequests(){
		return "job/request";
	}
}
