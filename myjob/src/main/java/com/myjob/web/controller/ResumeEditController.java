package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.entity.Resume;
import com.myjob.entity.values.AccountType;
import com.myjob.service.ResumeService;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.ResumeEditModel;

@Controller
@RequestMapping("/resume/edit")
@Allow(AccountType.user)
public class ResumeEditController extends ControllerBase {
	
	@Resource
	private ResumeService resumeService;
	
	@RequestMapping(value="/{resume_sid}",method=RequestMethod.GET)
	public String edit(@PathVariable long resume_sid,Model models){
		ResumeEditModel model = convert(resumeService.detail(resume_sid), ResumeEditModel.class);
		models.addAttribute(model);
		return "resume.edit";
	}
	
	@RequestMapping(value="/{resume_sid}",method=RequestMethod.POST)
	public String update(@PathVariable long resume_sid,@ModelAttribute ResumeEditModel model,BindingResult result){
		if(result.hasErrors()){
			return "resume.edit";
		}
		
		Resume resume = convert(model, Resume.class);
		resume.setSid(resume_sid);
		resumeService.update(resume);
		
		return "redirect:/resume/search/my";
	}
}
