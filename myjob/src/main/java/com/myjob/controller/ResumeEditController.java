package com.myjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.model.ResumeEditModel;

@Controller
@RequestMapping("/resume/edit")
public class ResumeEditController {
	
	@RequestMapping(value="/{resume_sid}",method=RequestMethod.GET)
	public String edit(@PathVariable long resume_sid,@ModelAttribute ResumeEditModel model){
		return "/resume/edit";
	}
	
	@RequestMapping(value="/{resume_sid}",method=RequestMethod.POST)
	public String update(@PathVariable long resume_sid,@ModelAttribute ResumeEditModel model){
		return "redirect:/resumes/my";
	}
}
