package com.myjob.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.dao.UserDao;
import com.myjob.entity.User;
import com.myjob.entity.values.AccountType;
import com.myjob.entity.values.UserStatus;

@Service
public class UserService {
	@Resource
	private UserDao userDao;
	
	public void create(User user){
		user.setCreateDate(new Date());
		user.getAccount().setAccountType(AccountType.user);
		user.setStatus(UserStatus.active);
		userDao.create(user);
	}
	
	public User detail(long userSid){
		return userDao.get(userSid);
	}
}
