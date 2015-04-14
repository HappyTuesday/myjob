package com.myjob.model.converter;

import com.myjob.entity.Company;
import com.myjob.infrastructure.Converter;
import com.myjob.model.CompanyRegisterModel;

@Converter
public class CompanyRegisterConverter extends BaseConverter<CompanyRegisterModel, Company> {
	public CompanyRegisterModel toModel(Company value){
		CompanyRegisterModel model = new CompanyRegisterModel();
		// TODO: convert
		return model;
	}
	
	public Company toValue(CompanyRegisterModel model){
		Company value=new Company();
		// TODO: convert
		return value;
	}
}