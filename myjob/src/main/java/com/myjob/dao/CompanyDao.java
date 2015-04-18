package com.myjob.dao;

import org.springframework.stereotype.Repository;

import com.myjob.entity.Company;

@Repository
public class CompanyDao extends BaseDao {
	
	public Company get(long sid){
		return template.get(Company.class, sid);
	}
	
	public void create(Company company){
		template.save(company.getAccount());
		company.setSid(company.getAccount().getSid());
		template.save(company);
	}
}
