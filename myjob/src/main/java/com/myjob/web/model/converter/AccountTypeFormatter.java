package com.myjob.web.model.converter;

import java.text.ParseException;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.myjob.entity.values.AccountType;

@Component
public class AccountTypeFormatter implements Formatter<AccountType>{
	
	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	
	@Override
	public String print(AccountType object, Locale arg1) {
		return readEntityValuesProperties.readEnityValuesProperties("AccountType."+object.toString());
	}

	@Override
	public AccountType parse(String object, Locale arg1) throws ParseException {
		
		return AccountType.valueOf(object);
	}

}
