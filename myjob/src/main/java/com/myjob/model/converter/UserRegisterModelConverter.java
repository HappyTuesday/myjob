package com.myjob.model.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.User;
import com.myjob.model.UserRegisterModel;

@Component
public class UserRegisterModelConverter implements Converter<UserRegisterModel, User> {

	@Override
	public User convert(UserRegisterModel source) {
		// TODO Auto-generated method stub
		return null;
	}
}