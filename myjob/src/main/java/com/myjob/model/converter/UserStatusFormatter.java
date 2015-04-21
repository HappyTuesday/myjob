package com.myjob.model.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.myjob.entity.values.UserStatus;

public class UserStatusFormatter implements Formatter<UserStatus>{

	@Override
	public String print(UserStatus arg0, Locale arg1) {
		// TODO Auto-generated method stub
		return arg0.toString();
	}

	@Override
	public UserStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return UserStatus.valueOf(arg0);
	}
	

}
