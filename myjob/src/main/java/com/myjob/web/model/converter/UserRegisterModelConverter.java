package com.myjob.web.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.User;
import com.myjob.web.model.UserRegisterModel;

@Component
public class UserRegisterModelConverter implements Converter<UserRegisterModel, User> {
	@Resource
	private AccountModelConverter accountModelConverter;
	@Override
	public User convert(UserRegisterModel source) {
		User user = new User();
		user.setAccount(accountModelConverter.convert(source.getAccount()));
		user.setName((source.getName()));
		return user;
	}
}