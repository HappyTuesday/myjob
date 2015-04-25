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
		Job job = new Job();
		job.setAmount(source.getAmount());
		job.setDescription(source.getDescription());
		job.setName(source.getName());
		job.setProfession(source.getProfession());
		job.setWorkingLocation(geographicSiteModelConverter.convert(source.getWorkingLocation()));
		job.setQualification(source.getQualification());
		
		job.setWorkingYears(source.getWorkingYears());
		return job;
	}
}
