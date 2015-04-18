package com.myjob.model.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.myjob.entity.values.Qualification;

@Component
public class QualificationFormatter implements Formatter<Qualification> {

	@Override
	public String print(Qualification object, Locale locale) {
		return object.toString();
	}

	@Override
	public Qualification parse(String text, Locale locale)
			throws ParseException {
		return Qualification.valueOf(text);
	}

}
