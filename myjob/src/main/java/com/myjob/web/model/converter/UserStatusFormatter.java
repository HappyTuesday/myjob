package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.format.Formatter;

import com.myjob.entity.values.UserStatus;

public class UserStatusFormatter implements Formatter<UserStatus>{

	@Resource
	private ReadEntityValuesProperties readEntityValuesProperties;
	@Override
	public String print(UserStatus object, Locale arg1) {
		try {
			return readEntityValuesProperties.readEnityValuesProperties("UserStatus."+object.toString());
			
		} catch (IOException e) {
			System.out.println("Cannot format UserStatus");
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public UserStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return UserStatus.valueOf(arg0);
	}
	

}
