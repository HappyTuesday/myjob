package com.myjob.model.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.myjob.entity.values.AccountType;

public class AccountTypeFormatter implements Formatter<AccountType>{

	@Override
	public String print(AccountType object, Locale arg1) {
		
		return object.toString();
	}

	@Override
	public AccountType parse(String object, Locale arg1) throws ParseException {
		
		return AccountType.valueOf(object);
	}

}
