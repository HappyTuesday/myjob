package com.myjob.dao;

import org.springframework.stereotype.Repository;

import com.myjob.entity.User;

@Repository
public class UserDao extends BaseDao {
	
	public User get(long sid){
		return template.get(User.class, sid);
	}
	
	public void create(User user) {
		template.save(user);
	}
}
