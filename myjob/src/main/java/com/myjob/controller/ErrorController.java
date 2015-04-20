package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/error"})
public class ErrorController {
	
	@RequestMapping({"/denied"})
	public String denied(){
		return "error.401.4";
	}
}
