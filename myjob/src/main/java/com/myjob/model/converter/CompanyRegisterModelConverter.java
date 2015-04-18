package com.myjob.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import com.myjob.entity.Account;
import com.myjob.entity.Company;
import com.myjob.entity.GeographicSite;
import com.myjob.model.CompanyRegisterModel;

public class CompanyRegisterModelConverter implements Converter<CompanyRegisterModel, Company> {
	
	@Resource
	private ConversionService conversionService;
	
	@Override
	public Company convert(CompanyRegisterModel source) {
		Company target = new Company();
		target.setName(source.getName());
		target.setCategory(source.getCategory());
		target.setAccount(conversionService.convert(source.getAccount(), Account.class));
		target.setLocation(conversionService.convert(source.getLocation(), GeographicSite.class));
		target.setDescription(source.getDescription());
		
		return target;
	}
}