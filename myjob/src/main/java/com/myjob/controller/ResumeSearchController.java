package com.myjob.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.auth.AuthPassport;
import com.myjob.criteria.ResumeQueryCriteria;
import com.myjob.entity.values.AccountType;
import com.myjob.model.converter.ResumeConverter;
import com.myjob.service.ResumeService;

@Controller
@RequestMapping("/resumes")
@AuthPassport({AccountType.company,AccountType.user})
public class ResumeSearchController {
	
	@Resource
	private ResumeService resumeService;
	@Resource
	private ResumeConverter resumeConverter;
	
	@RequestMapping
	@AuthPassport(AccountType.company)
	public String search(@ModelAttribute ResumeQueryCriteria criteria){
		return "/resumes";
	}
	
	@RequestMapping("/my")
	@AuthPassport(AccountType.user)
	public String searchMy(@ModelAttribute ResumeQueryCriteria criteria){
		return "/resumes";
	}
	
	@RequestMapping("/data")
	@AuthPassport(AccountType.company)
	@ResponseBody
	public Object searchData(@ModelAttribute ResumeQueryCriteria criteria) throws Exception{
		return resumeConverter.toModel(resumeService.query(criteria));
	}
	
	@RequestMapping("/my/data")
	@AuthPassport(AccountType.user)
	@ResponseBody
	public Object searchMyData(@ModelAttribute ResumeQueryCriteria criteria) throws Exception{
		return resumeConverter.toModel(resumeService.queryMyResumes(criteria, 0));
	}
}
