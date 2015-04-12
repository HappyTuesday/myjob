package com.myjob.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.myjob.entity.User;

@Repository
public class UserDao {
	@Resource HibernateTemplate template;
	
	public User get(long sid){
		return template.get(User.class, sid);
	}
	
	public void create(User user) {
		template.save(user);
	}
}
