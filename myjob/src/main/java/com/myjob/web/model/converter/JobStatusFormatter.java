package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.format.Formatter;

import com.myjob.entity.values.JobStatus;

public class JobStatusFormatter implements Formatter<JobStatus>{

	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	@Override
	public String print(JobStatus object, Locale arg1) {
		try {
			return readEntityValuesProperties.readEnityValuesProperties("JobStatus."+object.toString());
			
		} catch (IOException e) {
			System.out.println("Cannot format JobStatus");
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public JobStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return JobStatus.valueOf(arg0);
	}

}
