package com.myjob.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.dao.CompanyDao;
import com.myjob.entity.Company;
import com.myjob.entity.values.AccountType;
import com.myjob.entity.values.CompanyStatus;

@Service
public class CompanyService {
	@Resource
	private CompanyDao companyDao;

	public void create(Company company){
		company.setCreateDate(new Date());
		company.getAccount().setAccountType(AccountType.company);
		company.setStatus(CompanyStatus.active);
		companyDao.create(company);
	}
	
	public Company detail(long companySid){
		return companyDao.get(companySid);
	}
}
