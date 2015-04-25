package com.myjob.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.criteria.ResumeQueryCriteria;
import com.myjob.entity.values.AccountType;
import com.myjob.service.ResumeService;
import com.myjob.web.auth.Allow;
import com.myjob.web.model.ResumeModel;

@Controller
@RequestMapping("/resume/search")
@Allow({AccountType.company,AccountType.user})
public class ResumeSearchController extends ControllerBase {
	
	@Resource
	private ResumeService resumeService;
	
	@RequestMapping
	@Allow(AccountType.company)
	public String search(@ModelAttribute ResumeQueryCriteria criteria){
		return "resume.search";
	}
	
	@RequestMapping("/my")
	@Allow(AccountType.user)
	public String searchMy(@ModelAttribute ResumeQueryCriteria criteria){
		return "resume.search";
	}
	
	@RequestMapping("/data")
	@Allow(AccountType.company)
	@ResponseBody
	public Object searchData(@ModelAttribute ResumeQueryCriteria criteria) throws Exception{
		return convertQueryResult(resumeService.query(criteria),ResumeModel.class);
	}
	
	@RequestMapping("/my/data")
	@Allow(AccountType.user)
	@ResponseBody
	public Object searchMyData(@ModelAttribute ResumeQueryCriteria criteria) throws Exception{
		return convertQueryResult(resumeService.queryMyResumes(criteria,loginAccountSid()),ResumeModel.class);
	}
}
