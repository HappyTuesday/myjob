package com.myjob.web.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Job;
import com.myjob.web.model.JobCreateModel;

@Component
public class JobCreateModelConverter implements Converter<JobCreateModel,Job>{
	
	@Resource
	private GeographicSiteModelConverter geographicSiteModelConverter;
	
	@Override
	public Job convert(JobCreateModel source) {
		Job target = new Job();
		
		target.setAmount(source.getAmount());
		target.setSalary(source.getSalary());
		target.setDescription(source.getDescription());
		target.setName(source.getName());
		target.setProfession(source.getProfession());
		target.setWorkingLocation(geographicSiteModelConverter.convert(source.getWorkingLocation()));
		target.setQualification(source.getQualification());
		target.setWorkingYears(source.getWorkingYears());
		
		return target;
	}
}
