package com.myjob.web.model.converter;

import java.text.ParseException;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.myjob.entity.values.JobRequestStatus;

@Component
public class JobRequestStatusFormatter implements Formatter<JobRequestStatus> {


	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	
	@Override
	public String print(JobRequestStatus object, Locale arg1) {
		return readEntityValuesProperties.readEnityValuesProperties("JobRequestStatus."+object.toString());
	}

	@Override
	public JobRequestStatus parse(String arg0, Locale arg1)
			throws ParseException {
		// TODO Auto-generated method stub
		return JobRequestStatus.valueOf(arg0);
	}

}
