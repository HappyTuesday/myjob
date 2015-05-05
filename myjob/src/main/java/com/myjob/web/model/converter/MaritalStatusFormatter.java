package com.myjob.web.model.converter;

import java.text.ParseException;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.myjob.entity.values.MaritalStatus;

@Component
public class MaritalStatusFormatter implements Formatter<MaritalStatus>{
	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;

	@Override
	public String print(MaritalStatus object, Locale arg1) {
		return readEntityValuesProperties.readEnityValuesProperties("MaritalStatus."+object.toString());
	}

	@Override
	public MaritalStatus parse(String text, Locale arg1) throws ParseException {
		
		return  MaritalStatus.valueOf(text);
	}

}
