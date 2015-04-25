package com.myjob.web.model.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Account;
import com.myjob.web.model.AccountModel;

@Component
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
