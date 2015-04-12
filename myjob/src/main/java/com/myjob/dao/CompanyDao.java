package com.myjob.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.myjob.entity.Company;

@Repository
public class CompanyDao {
	@Resource HibernateTemplate template;
	
	public Company get(long sid){
		return template.get(Company.class, sid);
	}
	
	public void create(Company company){
		template.save(company);
	}
}
