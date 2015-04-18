package com.myjob.model.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Company;
import com.myjob.model.CompanyModel;

@Component
public class CompanyConverter implements Converter<Company, CompanyModel> {

	@Override
	public CompanyModel convert(Company source) {
		// TODO Auto-generated method stub
		return null;
	}

}