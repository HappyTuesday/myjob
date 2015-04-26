package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.format.Formatter;

import com.myjob.entity.values.JobRequestStatus;

public class JobRequestStatusFormatter implements Formatter<JobRequestStatus> {


	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	
	@Override
	public String print(JobRequestStatus object, Locale arg1) {
		try {
			return readEntityValuesProperties.readEnityValuesProperties("JobRequestStatus."+object.toString());
			
		} catch (IOException e) {
			System.out.println("Cannot format JobRequestStatus");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public JobRequestStatus parse(String arg0, Locale arg1)
			throws ParseException {
		// TODO Auto-generated method stub
		return JobRequestStatus.valueOf(arg0);
	}

}
