package com.myjob.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import org.springframework.format.Formatter;

import com.myjob.entity.values.CompanyStatus;

public class CompanyStatusFormatter implements Formatter<CompanyStatus>{

	@Override
	public String print(CompanyStatus arg0, Locale arg1) {
		Properties pro = new Properties();
		try {
			pro.load(AccountTypeFormatter.class.getResourceAsStream("/com/myjob/model/converter/EntityValues.properties"));
			if(arg0.toString()=="active"){
				return pro.getProperty("active");
			}else if(arg0.toString()=="deleted"){
				return  pro.getProperty("deleted");
			}
			
		} catch (IOException e) {
			System.err.println("Cannot load properties file");
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public CompanyStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return CompanyStatus.valueOf(arg0);
	}
	

}
