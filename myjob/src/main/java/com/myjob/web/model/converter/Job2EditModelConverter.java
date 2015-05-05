package com.myjob.web.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Job;
import com.myjob.web.model.JobEditModel;

@Component
public class Job2EditModelConverter implements Converter<Job, JobEditModel> {
	
	@Resource
	private CompanyConverter companyConverter;
	
	@Resource
	private GeographicSiteConverter geographicSiteConverter;
	
	@Override
	public JobEditModel convert(Job source) {
		JobEditModel target = new JobEditModel();
		target.setAmount(source.getAmount());
		target.setSalary(source.getSalary());
		target.setDescription(source.getDescription());
		target.setName(source.getName());
		target.setProfession(source.getProfession());
		target.setQualification(source.getQualification().toString());
		target.setSid(source.getSid());
		target.setWorkingLocation(geographicSiteConverter.convert(source.getWorkingLocation()));
		target.setWorkingYears(source.getWorkingYears());
		return target;
	}
}
