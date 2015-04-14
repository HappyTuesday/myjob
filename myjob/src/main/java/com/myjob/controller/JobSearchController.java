package com.myjob.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myjob.auth.AuthPassport;
import com.myjob.criteria.JobQueryCriteria;
import com.myjob.entity.values.AccountType;
import com.myjob.model.JobModel;

@Controller
@RequestMapping("/jobs")
public class JobSearchController {
	
	@RequestMapping
	public String search(@ModelAttribute JobQueryCriteria criteria){
		return "/jobs";
	}
	
	@RequestMapping("/my")
	@AuthPassport(AccountType.company)
	public String searchMy(@ModelAttribute JobQueryCriteria criteria){
		return "/jobs";
	}
	
	@RequestMapping("/data")
	public Object searchData(@ModelAttribute JobQueryCriteria criteria){
		return new ArrayList<JobModel>();
	}
	
	@RequestMapping("/my/data")
	@AuthPassport(AccountType.company)
	public Object searchMyData(@ModelAttribute JobQueryCriteria criteria){
		return new ArrayList<JobModel>();
	}
}
