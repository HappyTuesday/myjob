package com.myjob.model.converter;

import org.springframework.core.convert.converter.Converter;

import com.myjob.entity.Job;
import com.myjob.model.JobCreateModel;

public class JobCreateModelConverter implements Converter<JobCreateModel,Job>{
	@Override
	public Job convert(JobCreateModel source) {
		Job job = new Job();
		return null;
	}

}
