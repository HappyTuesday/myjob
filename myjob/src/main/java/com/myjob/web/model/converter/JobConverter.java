package com.myjob.web.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Job;
import com.myjob.web.model.JobModel;

@Component
public class JobConverter implements Converter<Job, JobModel> {
	
	@Resource
	private CompanyConverter companyConverter;
	
	@Resource
	private GeographicSiteConverter geographicSiteConverter;
	
	@Override
	public JobModel convert(Job source) {
		JobModel target = new JobModel();
		target.setAmount(source.getAmount());
		target.setSalary(source.getSalary());
		target.setCompany(companyConverter.convert(source.getCompany()));
		target.setDescription(source.getDescription());
		target.setName(source.getName());
		target.setProfession(source.getProfession());
		target.setQualification(source.getQualification().toString());
		target.setSid(source.getSid());
		target.setjobStatus(source.getStatus().toString());
		target.setUpdateTime(source.getUpdateTime());
		target.setWorkingLocation(geographicSiteConverter.convert(source.getWorkingLocation()));
		target.setWorkingYears(source.getWorkingYears());
		return target;
	}
}
