package com.myjob.web.model.converter;

import java.text.ParseException;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Job;
import com.myjob.web.model.JobCreateModel;

@Component
public class JobCreateModelConverter implements Converter<JobCreateModel,Job>{
	
	@Resource
	private GeographicSiteModelConverter geographicSiteModelConverter;
	@Resource
	private QualificationFormatter qualificationFormatter;
	@Override
	public Job convert(JobCreateModel source) {
		Job target = new Job();
		
		target.setAmount(source.getAmount());
		target.setSalary(source.getSalary());
		target.setDescription(source.getDescription());
		target.setName(source.getName());
		target.setProfession(source.getProfession());
		target.setWorkingLocation(geographicSiteModelConverter.convert(source.getWorkingLocation()));
		try {
			target.setQualification(qualificationFormatter.parse(source.getQualification(), Locale.ENGLISH));
		} catch (ParseException e) {
			System.out.println("Cannot set working Location field because cannot formattered Qualification to enum type.");
			e.printStackTrace();
		}
		target.setWorkingYears(source.getWorkingYears());
		
		return target;
	}
}
