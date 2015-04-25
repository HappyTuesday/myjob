package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import org.springframework.format.Formatter;

import com.myjob.entity.values.UserStatus;

public class UserStatusFormatter implements Formatter<UserStatus>{

	@Override
	public String print(UserStatus object, Locale arg1) {
		Properties pro = new Properties();
		try {
			pro.load(AccountTypeFormatter.class.getResourceAsStream("/com/myjob/model/converter/EntityValues.properties"));
			if(object.toString()=="active"){
				return pro.getProperty("active");
			}else if(object.toString()=="deleted"){
				return  pro.getProperty("deleted");
			}
			
		} catch (IOException e) {
			System.err.println("Cannot load properties file");
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
