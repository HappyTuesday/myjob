package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.format.Formatter;

import com.myjob.entity.values.Gender;

public class GenderFormatter implements Formatter<Gender>{
	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	@Override
	public String print(Gender object, Locale arg1) {
		try {
			return readEntityValuesProperties.readEnityValuesProperties("Gender."+object.toString());
		} catch (IOException e) {
			System.out.println("Cannot format Gender ");
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public Gender parse(String object, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return Gender.valueOf(object);
	}

}
