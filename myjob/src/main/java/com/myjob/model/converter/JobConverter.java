package com.myjob.model.converter;

import com.myjob.entity.Job;
import com.myjob.infrastructure.Converter;
import com.myjob.model.JobModel;

@Converter
public class JobConverter {
	public JobModel toModel(Job job){
		return new JobModel();
	}
}
