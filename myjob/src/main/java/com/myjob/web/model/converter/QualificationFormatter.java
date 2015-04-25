package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.myjob.entity.values.Qualification;

@Component
public class QualificationFormatter implements Formatter<Qualification> {

	@Override
	public String print(Qualification object, Locale locale) {
		Properties pro = new Properties();
		try {
			pro.load(AccountTypeFormatter.class.getResourceAsStream("/com/myjob/model/converter/EntityValues.properties"));
			if(object.toString()=="associate"){
				return pro.getProperty("associate");
			}else if(object.toString()=="bachelor"){
				return  pro.getProperty("bachelor");
			}else if(object.toString()=="master"){
				return  pro.getProperty("master");
			}else if(object.toString()=="doctor"){
				return  pro.getProperty("doctor");
			}else if(object.toString()=="other"){
				return  pro.getProperty("other");
			}
			
		} catch (IOException e) {
			System.err.println("Cannot load properties file");
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Qualification parse(String text, Locale locale)
			throws ParseException {
		return Qualification.valueOf(text);
	}

}
