package com.myjob.model.converter;

import com.myjob.entity.Job;
import com.myjob.infrastructure.Converter;
import com.myjob.model.JobModel;

@Converter
public class JobConverter extends BaseConverter<JobModel, Job> {
	public JobModel toModel(Job job){
		JobModel model = new JobModel();
		// TODO: convert
		return model;
	}
	
	public Job toValue(JobModel model){
		Job job=new Job();
		// TODO: convert
		return job;
	}
}
