package com.myjob.web.model.converter;

import java.text.ParseException;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.myjob.entity.values.JobStatus;

@Component
public class JobStatusFormatter implements Formatter<JobStatus>{

	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	@Override
	public String print(JobStatus object, Locale arg1) {
		return readEntityValuesProperties.readEnityValuesProperties("JobStatus."+object.toString());
	}

	@Override
	public JobStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return JobStatus.valueOf(arg0);
	}

}
