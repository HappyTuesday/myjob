package com.myjob.model.converter;

import org.springframework.core.convert.converter.Converter;

import com.myjob.entity.Company;
import com.myjob.model.CompanyRegisterModel;

public class CompanyRegisterModelConverter implements Converter<CompanyRegisterModel, Company> {
	@Override
	public Company convert(CompanyRegisterModel source) {
		// TODO Auto-generated method stub
		return null;
	}
}