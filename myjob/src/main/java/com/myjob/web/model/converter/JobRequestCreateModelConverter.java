package com.myjob.web.model.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.JobRequest;
import com.myjob.web.model.JobRequestCreateModel;

@Component
public class JobRequestCreateModelConverter implements Converter<JobRequestCreateModel, JobRequest> {
	
	@Override
	public JobRequest convert(JobRequestCreateModel source) {
		JobRequest target = new JobRequest();
		
		target.setJobSid(source.getJobSid());
		target.setRequestComment(source.getRequestComment());
		
		return target;
	}
}
