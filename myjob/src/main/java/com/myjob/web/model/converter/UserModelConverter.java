package com.myjob.web.model.converter;

import java.text.ParseException;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;







import org.springframework.stereotype.Component;

import com.myjob.entity.User;
import com.myjob.web.model.UserModel;

@Component
public class UserModelConverter implements Converter<UserModel, User>{
	@Resource
	private AccountModelConverter accountModelConverter;
	@Resource
	private UserStatusFormatter userStatusFormatter;

	@Override
	public User convert(UserModel source) {
		User user = new User();
		user.setAccount(accountModelConverter.convert(source.getAccount()));
		user.setCreateDate(source.getCreateDate());
		user.setName(source.getName());
		user.setSid(source.getSid());
		try {
			user.setStatus(userStatusFormatter.parse(source.getUserStatus(),Locale.ENGLISH));
		} catch (ParseException e) {
			System.out.println("Cannot set working Location field because cannot formattered UserStatus to enum type.");
			e.printStackTrace();
		}
		return user;
	}
	

}
