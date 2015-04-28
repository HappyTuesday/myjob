package com.myjob.web.model.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class DateFormatter implements Formatter<Date> {
	
	private static final String defaultDateFormatPattern = "yyyy-MM-dd";
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat(defaultDateFormatPattern);
	
	@Override
	public String print(Date object, Locale locale) {
		return dateFormat.format(object);
	}

	@Override
	public Date parse(String text, Locale locale)
			throws ParseException {
		return dateFormat.parse(text);
	}
}
