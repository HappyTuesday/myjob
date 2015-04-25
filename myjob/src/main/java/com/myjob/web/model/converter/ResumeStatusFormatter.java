package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import org.springframework.format.Formatter;

import com.myjob.entity.values.ResumeStatus;

public class ResumeStatusFormatter implements Formatter<ResumeStatus> {

	@Override
	public String print(ResumeStatus object, Locale arg1) {
		Properties pro = new Properties();
		try {
			pro.load(AccountTypeFormatter.class.getResourceAsStream("/com/myjob/model/converter/EntityValues.properties"));
			if(object.toString()=="inactive"){
				return pro.getProperty("inactive");
			}else if(object.toString()=="active"){
				return  pro.getProperty("active");
			}else if(object.toString()=="deleted"){
				return  pro.getProperty("deleted");
			}
			
		} catch (IOException e) {
			System.err.println("Cannot load properties file");
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public ResumeStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return ResumeStatus.valueOf(arg0);
	}

}
