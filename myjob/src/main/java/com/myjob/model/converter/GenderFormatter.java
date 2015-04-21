package com.myjob.model.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.myjob.entity.values.Gender;

public class GenderFormatter implements Formatter<Gender>{

	@Override
	public String print(Gender object, Locale arg1) {
		
		return object.toString();
	}

	@Override
	public Gender parse(String object, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return Gender.valueOf(object);
	}

}
