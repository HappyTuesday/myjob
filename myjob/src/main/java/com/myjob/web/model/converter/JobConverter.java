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
		JobModel jobModel = new JobModel();
		jobModel.setAmount(source.getAmount());
		jobModel.setCompany(companyConverter.convert(source.getCompany()));
		jobModel.setDescription(source.getDescription());
		jobModel.setName(source.getName());
		jobModel.setProfession(source.getProfession());
		jobModel.setQualification(source.getQualification());
		jobModel.setSid(source.getSid());
		jobModel.setStatus(source.getStatus());
		jobModel.setUpdateTime(source.getUpdateTime());
		jobModel.setWorkingLocation(geographicSiteConverter.convert(source.getWorkingLocation()));
		jobModel.setWorkingYears(source.getWorkingYears());
		return jobModel;
	}
}
