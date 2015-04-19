package com.myjob.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Company;
import com.myjob.model.CompanyModel;

@Component
public class CompanyConverter implements Converter<Company, CompanyModel> {
	@Resource
	private AccountConverter accountConverter;
	@Resource
	private GeographicSiteConverter geographicSiteConverter;
	@Override
	public CompanyModel convert(Company source) {
		CompanyModel companyModel = new CompanyModel();
		companyModel.setAccount(accountConverter.convert(source.getAccount()));
		companyModel.setCategory(source.getCategory());
		companyModel.setDescription(source.getDescription());
		companyModel.setLocation(geographicSiteConverter.convert(source.getLocation()));
		companyModel.setName(source.getName());
		companyModel.setSid(source.getSid());
		companyModel.setStatus(source.getStatus());
		return companyModel;
		
	}

}