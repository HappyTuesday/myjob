package com.myjob.web.model.converter;

import java.text.ParseException;
import java.util.Locale;

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
	@Resource
	private QualificationFormatter qualificationFormatter;
	@Override
	public Job convert(JobEditModel source) {
		Job target = new Job();
		
		target.setAmount(source.getAmount());
		target.setSalary(source.getSalary());
		target.setDescription(source.getDescription());
		target.setName(source.getName());
		target.setProfession(source.getProfession());
		try {
			target.setQualification(qualificationFormatter.parse(source.getQualification(),Locale.ENGLISH));
			System.out.println("Cannot set working Location field because cannot formattered Qualification to enum type.");
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		target.setSid(source.getSid());
		target.setWorkingLocation(geographicSiteModelConverter.convert(source.getWorkingLocation()));
		target.setWorkingYears(source.getWorkingYears());
		
		return target;
	}
}
