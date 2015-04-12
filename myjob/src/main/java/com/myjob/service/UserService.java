package com.myjob.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.dao.UserDao;
import com.myjob.entity.User;

@Service
public class UserService {
	@Resource
	private UserDao userDao;
	
	public void create(User user){
		user.setCreateDate(new Date());
		userDao.create(user);
	}
	
	public User detail(long userSid){
		return userDao.get(userSid);
	}
}
