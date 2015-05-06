package com.myjob.web.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.JobRequest;
import com.myjob.web.model.JobRequestModel;

@Component
public class JobRequestConverter implements Converter<JobRequest, JobRequestModel> {
	
	@Resource
	private JobConverter jobConverter;
	
	@Resource
	private ResumeConverter resumeConverter;
	
	@Resource
	private JobRequestStatusFormatter jobRequestStatusFormatter;
	
	@Override
	public JobRequestModel convert(JobRequest source) {
		JobRequestModel target = new JobRequestModel();
		
		target.setSid(source.getSid());
		target.setRequestTime(source.getRequestTime());
		target.setRequestComment(source.getRequestComment());
		target.setHrRemark(source.getHrRemark());
		target.setJob(jobConverter.convert(source.getJob()));
		target.setResume(resumeConverter.convert(source.getResume()));
		target.setStatus(jobRequestStatusFormatter.print(source.getStatus(), null));
		
		return target;
	}
}
