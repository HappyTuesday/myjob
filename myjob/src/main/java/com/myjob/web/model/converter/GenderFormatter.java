package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.myjob.entity.values.Gender;

@Component
public class GenderFormatter implements Formatter<Gender>{
	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	
	@Override
	public String print(Gender object, Locale arg1) {
		return readEntityValuesProperties.readEnityValuesProperties("Gender."+object.toString());		
	}

	@Override
	public Gender parse(String object, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return Gender.valueOf(object);
	}

}
