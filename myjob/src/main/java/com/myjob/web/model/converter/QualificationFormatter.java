package com.myjob.web.model.converter;

import java.text.ParseException;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.myjob.entity.values.Qualification;

@Component
public class QualificationFormatter implements Formatter<Qualification> {

	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	@Override
	public String print(Qualification object, Locale locale) {
		return readEntityValuesProperties.readEnityValuesProperties("Qualification."+object.toString());
	}

	@Override
	public Qualification parse(String text, Locale locale)
			throws ParseException {
		return Qualification.valueOf(text);
	}

}
