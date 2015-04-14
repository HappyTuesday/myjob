package com.myjob.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.dao.CompanyDao;
import com.myjob.entity.Company;
import com.myjob.service.exception.ServiceLogicException;

@Service
public class CompanyService {
	@Resource
	private CompanyDao companyDao;
	
	public void create(Company company) throws ServiceLogicException{
		company.setCreateDate(new Date());
		companyDao.create(company);
	}
	
	public Company detail(long companySid){
		return companyDao.get(companySid);
	}
}
