package com.myjob.model.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Job;
import com.myjob.model.JobCreateModel;

@Component
public class JobCreateModelConverter implements Converter<JobCreateModel,Job>{
	@Override
	public Job convert(JobCreateModel source) {
		Job job = new Job();
		job.setAmount(source.getAmount());
		job.setDescripton(source.getDescripton());
		job.setName(source.getName());
		job.setProfession(source.getProfession());
		job.setQualification(source.getQualification());
		job.setWorkingYears(source.getWorkingYears());
		return job;
	}
}
