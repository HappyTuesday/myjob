package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.format.Formatter;

import com.myjob.entity.values.ResumeStatus;

public class ResumeStatusFormatter implements Formatter<ResumeStatus> {

	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	@Override
	public String print(ResumeStatus object, Locale arg1) {
		try {
			return readEntityValuesProperties.readEnityValuesProperties("ResumeStatus."+object.toString());
			
		} catch (IOException e) {
			System.out.println("Cannot format ResumeStatus");
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public ResumeStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return ResumeStatus.valueOf(arg0);
	}

}
