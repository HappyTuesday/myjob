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
		return null;
	}

}
