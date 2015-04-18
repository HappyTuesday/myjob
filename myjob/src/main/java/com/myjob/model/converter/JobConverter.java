package com.myjob.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import com.myjob.entity.Job;
import com.myjob.model.CompanyModel;
import com.myjob.model.GeographicSiteModel;
import com.myjob.model.JobModel;

public class JobConverter implements Converter<Job, JobModel> {
	@Resource
	private ConversionService conversionService;

	@Override
	public JobModel convert(Job source) {
		JobModel jobModel = new JobModel();
		jobModel.setAmount(source.getAmount());
		jobModel.setCompany(conversionService.convert(source.getCompany(), CompanyModel.class));
		jobModel.setDescripton(source.getDescripton());
		jobModel.setName(source.getName());
		jobModel.setProfession(source.getProfession());
		jobModel.setQualification(source.getQualification().toString());
		jobModel.setSid(source.getSid());
		jobModel.setStatus(source.getStatus().toString());
		jobModel.setUpdateTime(source.getUpdateTime());
		jobModel.setWorkingLocation(conversionService.convert(source.getWorkingLocation(), GeographicSiteModel.class));
		jobModel.setWorkingYears(source.getWorkingYears());
		return jobModel;
	}
}
