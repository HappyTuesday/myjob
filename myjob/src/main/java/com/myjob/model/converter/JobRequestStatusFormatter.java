package com.myjob.model.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.myjob.entity.values.JobRequestStatus;

public class JobRequestStatusFormatter implements Formatter<JobRequestStatus> {

	@Override
	public String print(JobRequestStatus arg0, Locale arg1) {
		// TODO Auto-generated method stub
		return arg0.toString();
	}

	@Override
	public JobRequestStatus parse(String arg0, Locale arg1)
			throws ParseException {
		// TODO Auto-generated method stub
		return JobRequestStatus.valueOf(arg0);
	}

}
