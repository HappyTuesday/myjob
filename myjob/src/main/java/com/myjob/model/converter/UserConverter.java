package com.myjob.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.User;
import com.myjob.model.UserModel;

@Component
public class UserConverter implements Converter<User,UserModel> {
	
	@Resource
	private AccountConverter accountConverter;

	@Override
	public UserModel convert(User source) {
		UserModel userModel = new UserModel();
		userModel.setAccount(accountConverter.convert(source.getAccount()));
		userModel.setCreateDate(source.getCreateDate());
		userModel.setName(source.getName());
		userModel.setSid(source.getSid());
		userModel.setStatus(source.getStatus());		
		return userModel;
	}

}
