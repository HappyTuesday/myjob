package com.myjob.model.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.myjob.entity.values.JobStatus;

public class JobStatusFormatter implements Formatter<JobStatus>{

	@Override
	public String print(JobStatus arg0, Locale arg1) {
		// TODO Auto-generated method stub
		return arg0.toString();
	}

	@Override
	public JobStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return JobStatus.valueOf(arg0);
	}

}