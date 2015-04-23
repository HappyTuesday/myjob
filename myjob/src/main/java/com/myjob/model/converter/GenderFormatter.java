package com.myjob.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import org.springframework.format.Formatter;

import com.myjob.entity.values.Gender;

public class GenderFormatter implements Formatter<Gender>{

	@Override
	public String print(Gender object, Locale arg1) {
		
		Properties pro = new Properties();
		try {
			pro.load(AccountTypeFormatter.class.getResourceAsStream("/com/myjob/model/converter/EntityValues.properties"));
			if(object.toString()=="male"){
				return pro.getProperty("male");
			}else if(object.toString()=="female"){
				return  pro.getProperty("female");
			}
			
		} catch (IOException e) {
			System.err.println("Cannot load properties file");
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
