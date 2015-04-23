package com.myjob.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import org.springframework.format.Formatter;

import com.myjob.entity.values.AccountType;

public class AccountTypeFormatter implements Formatter<AccountType>{
	

	@Override
	public String print(AccountType object, Locale arg1) {
		Properties pro = new Properties();
		try {
			pro.load(AccountTypeFormatter.class.getResourceAsStream("/com/myjob/model/converter/EntityValues.properties"));
			if(object.toString()=="user"){
				return pro.getProperty("user");
			}else if(object.toString()=="company"){
				return  pro.getProperty("company");
			}
			
		} catch (IOException e) {
			System.err.println("Cannot load properties file");
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public AccountType parse(String object, Locale arg1) throws ParseException {
		
		return AccountType.valueOf(object);
	}

}
