package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/home","/index","/default"})
public class HomeController {
	
	@RequestMapping
	public String home(){
		// TODO: redirect to the home page according to current login accout type.
		return "redirect:/home/user";
	}
	
	@RequestMapping("/about")
	public String about(){
		return "/about";
	}
}
