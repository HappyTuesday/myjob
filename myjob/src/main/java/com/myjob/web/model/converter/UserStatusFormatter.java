package com.myjob.web.model.converter;

import java.text.ParseException;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.myjob.entity.values.UserStatus;

@Component
public class UserStatusFormatter implements Formatter<UserStatus>{

	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	@Override
	public String print(UserStatus object, Locale arg1) {
		return readEntityValuesProperties.readEnityValuesProperties("UserStatus."+object.toString());
	}

	@Override
	public UserStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return UserStatus.valueOf(arg0);
	}
	

}
