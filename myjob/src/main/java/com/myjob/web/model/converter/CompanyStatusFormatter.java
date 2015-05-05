package com.myjob.web.model.converter;

import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.myjob.entity.values.CompanyStatus;

@Component
public class CompanyStatusFormatter implements Formatter<CompanyStatus>{

	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	
	@Override
	public String print(CompanyStatus object, Locale arg1) {
		Properties pro = new Properties();
		return readEntityValuesProperties.readEnityValuesProperties("CompanyStatus."+object.toString());	
	}

	@Override
	public CompanyStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return CompanyStatus.valueOf(arg0);
	}
	

}
