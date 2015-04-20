package com.myjob.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;



import com.myjob.entity.User;
import com.myjob.model.UserModel;

public class UserModelConverter implements Converter<UserModel, User>{
	@Resource
	private AccountModelConverter accountModelConverter;

	@Override
	public User convert(UserModel source) {
		User user = new User();
		user.setAccount(accountModelConverter.convert(source.getAccount()));
		user.setCreateDate(source.getCreateDate());
		user.setName(source.getName());
		user.setSid(source.getSid());
		user.setStatus(source.getStatus());
		return user;
	}
	

}
