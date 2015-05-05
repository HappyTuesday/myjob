package com.myjob.web.model.converter;

import java.text.ParseException;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.myjob.entity.values.ResumeStatus;

@Component
public class ResumeStatusFormatter implements Formatter<ResumeStatus> {

	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	@Override
	public String print(ResumeStatus object, Locale arg1) {
		return readEntityValuesProperties.readEnityValuesProperties("ResumeStatus."+object.toString());
	}

	@Override
	public ResumeStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return ResumeStatus.valueOf(arg0);
	}

}
