package com.myjob.model.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Account;
import com.myjob.model.AccountModel;

@Component
public class AccountModelConverter implements Converter<AccountModel,Account>{

	@Override
	public Account convert(AccountModel source) {
		Account target = new Account();
		
		target.setLoginName(source.getLoginName());
		target.setPassword(source.getPassword());
		target.setEmail(source.getEmail());
		
		return target;
	}
}
