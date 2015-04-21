package com.myjob.model.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.myjob.entity.values.CompanyStatus;

public class CompanyStatusFormatter implements Formatter<CompanyStatus>{

	@Override
	public String print(CompanyStatus arg0, Locale arg1) {
		// TODO Auto-generated method stub
		return arg0.toString();
	}

	@Override
	public CompanyStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return CompanyStatus.valueOf(arg0);
	}
	

}
