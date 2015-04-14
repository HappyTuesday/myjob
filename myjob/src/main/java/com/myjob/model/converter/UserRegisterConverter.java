package com.myjob.model.converter;

import com.myjob.entity.User;
import com.myjob.infrastructure.Converter;
import com.myjob.model.UserRegisterModel;

@Converter
public class UserRegisterConverter extends BaseConverter<UserRegisterModel, User> {
	public UserRegisterModel toModel(User value){
		UserRegisterModel model = new UserRegisterModel();
		// TODO: convert
		return model;
	}
	
	public User toValue(UserRegisterModel model){
		User value=new User();
		// TODO: convert
		return value;
	}
}