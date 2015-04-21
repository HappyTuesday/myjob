package com.myjob.model.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.myjob.entity.values.ResumeStatus;

public class ResumeStatusFormatter implements Formatter<ResumeStatus> {

	@Override
	public String print(ResumeStatus arg0, Locale arg1) {
		// TODO Auto-generated method stub
		return arg0.toString();
	}

	@Override
	public ResumeStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return ResumeStatus.valueOf(arg0);
	}

}
