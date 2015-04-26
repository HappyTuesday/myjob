package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.format.Formatter;

import com.myjob.entity.values.AccountType;

public class AccountTypeFormatter implements Formatter<AccountType>{
	
	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	
	@Override
	public String print(AccountType object, Locale arg1) {
		try {
			return readEntityValuesProperties.readEnityValuesProperties("AccountType."+object.toString());
		} catch (IOException e) {
			System.out.println("Cannot format AccountType");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AccountType parse(String object, Locale arg1) throws ParseException {
		
		return AccountType.valueOf(object);
	}

}
