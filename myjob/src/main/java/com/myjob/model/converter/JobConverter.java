package com.myjob.model.converter;

import org.springframework.core.convert.converter.Converter;

import com.myjob.entity.Job;
import com.myjob.model.JobModel;

public class JobConverter implements Converter<Job, JobModel> {

	@Override
	public JobModel convert(Job source) {
		// TODO Auto-generated method stub
		return null;
	}
}
