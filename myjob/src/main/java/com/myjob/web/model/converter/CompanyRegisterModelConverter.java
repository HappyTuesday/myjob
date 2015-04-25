package com.myjob.web.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Company;
import com.myjob.web.model.CompanyRegisterModel;

@Component
public class CompanyRegisterModelConverter implements Converter<CompanyRegisterModel, Company> {
	
	@Resource
	private AccountModelConverter accountModelConverter;
	
	@Resource
	private GeographicSiteModelConverter geographicSiteModelConverter;
	
	@Override
	public Company convert(CompanyRegisterModel source) {
		Company target = new Company();
		
		target.setName(source.getName());
		target.setCategory(source.getCategory());
		target.setAccount(accountModelConverter.convert(source.getAccount()));
		target.setLocation(geographicSiteModelConverter.convert(source.getLocation()));
		target.setDescription(source.getDescription());
		
		return target;
	}
}