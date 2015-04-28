package com.myjob.web.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Job;
import com.myjob.web.model.JobEditModel;

@Component
public class JobEditModelConverter implements Converter<JobEditModel, Job> {
	
	@Resource
	private CompanyConverter companyConverter;
	
	@Resource
	private GeographicSiteModelConverter geographicSiteModelConverter;
	
	@Override
	public Job convert(JobEditModel source) {
		Job target = new Job();
		
		target.setAmount(source.getAmount());
		target.setSalary(source.getSalary());
		target.setDescription(source.getDescription());
		target.setName(source.getName());
		target.setProfession(source.getProfession());
		target.setQualification(source.getQualification());
		target.setSid(source.getSid());
		target.setWorkingLocation(geographicSiteModelConverter.convert(source.getWorkingLocation()));
		target.setWorkingYears(source.getWorkingYears());
		
		return target;
	}
}
