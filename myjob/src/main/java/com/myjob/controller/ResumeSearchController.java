package com.myjob.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.auth.AuthPassport;
import com.myjob.entity.values.AccountType;
import com.myjob.model.ResumeModel;
import com.myjob.model.ResumeSearchModel;

@Controller
@RequestMapping("/resumes")
@AuthPassport({AccountType.company,AccountType.user})
public class ResumeSearchController {
	@RequestMapping
	@AuthPassport(AccountType.company)
	public String search(@ModelAttribute ResumeSearchModel model){
		return "/resumes";
	}
	
	@RequestMapping("/my")
	@AuthPassport(AccountType.user)
	public String searchMy(@ModelAttribute ResumeSearchModel model){
		return "/resumes";
	}
	
	@RequestMapping("/data")
	@AuthPassport(AccountType.company)
	@ResponseBody
	public Object searchData(@ModelAttribute ResumeSearchModel model){
		return new ArrayList<ResumeModel>();
	}
	
	@RequestMapping("/my/data")
	@AuthPassport(AccountType.user)
	@ResponseBody
	public Object searchMyData(@ModelAttribute ResumeSearchModel model){
		return new ArrayList<ResumeModel>();
	}
}
