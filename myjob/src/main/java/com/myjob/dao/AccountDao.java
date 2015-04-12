package com.myjob.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.myjob.entity.Account;

@Repository
public class AccountDao {
	@Resource HibernateTemplate template;
	
	public Account get(long sid){
		return template.get(Account.class, sid);
	}
	
	@SuppressWarnings("unchecked")
	public List<Account> findByLoginName(String loginName){
		DetachedCriteria criteria=DetachedCriteria.forClass(Account.class);
		criteria.add(Restrictions.eq("loginName", loginName));
		return (List<Account>) template.findByCriteria(criteria);
	}
}
