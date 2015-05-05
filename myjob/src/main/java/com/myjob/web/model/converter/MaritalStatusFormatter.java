package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.format.Formatter;

import com.myjob.entity.values.MaritalStatus;


public class MaritalStatusFormatter implements Formatter<MaritalStatus>{
	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;

	@Override
	public String print(MaritalStatus object, Locale arg1) {
		try {
			return readEntityValuesProperties.readEnityValuesProperties("MaritalStatus."+object.toString());
		} catch (IOException e) {
			System.out.println("Cannot format maritalStatus to string from enum");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MaritalStatus parse(String text, Locale arg1) throws ParseException {
		
		return  MaritalStatus.valueOf(text);
	}

}
