package com.myjob.model.converter;

import org.springframework.core.convert.converter.Converter;

import com.myjob.entity.Account;
import com.myjob.model.AccountModel;

public class AccountConverter implements Converter<Account,AccountModel> {

	@Override
	public AccountModel convert(Account source) {
		AccountModel accountModel = new AccountModel();
		accountModel.setEmail(source.getEmail());
		accountModel.setLoginName(source.getLoginName());
		accountModel.setPassword(source.getPassword());
		accountModel.setSid(source.getSid());
		return accountModel;
	}


}
