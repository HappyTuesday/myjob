package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.format.Formatter;

import com.myjob.entity.values.CompanyStatus;

public class CompanyStatusFormatter implements Formatter<CompanyStatus>{

	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	
	@Override
	public String print(CompanyStatus object, Locale arg1) {
		Properties pro = new Properties();
		try {
			return readEntityValuesProperties.readEnityValuesProperties("CompanyStatus."+object.toString());
		} catch (IOException e) {
			System.out.println("Cannot format CompanyStatus");
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
