package com.myjob.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.core.convert.ConversionService;

import com.myjob.common.QueryResult;
import com.myjob.entity.Account;
import com.myjob.entity.values.AccountType;
import com.myjob.web.util.KeyProvider;

public class ControllerBase {
	
	@Resource
	protected HttpSession session;
	
	@Resource
	protected KeyProvider keyProvider;
	
	@Resource
	protected ConversionService conversionService;
	
	protected Account loginAccount(){
		return (Account) session.getAttribute(keyProvider.loginAccountKey());
	}
	
	protected AccountType loginAccountType(){
		Account account = loginAccount();
		return account !=null ? account.getType():null;
	}
	
	protected long loginAccountSid() {
		Account account = loginAccount();
		return account !=null ? account.getSid():0;
	}
	
	protected <S,T> T convert(S source,Class<T> targetClass) {
		return conversionService.convert(source, targetClass);
	}
	
	@SuppressWarnings("unchecked")
	protected <S,T> QueryResult<T> convertQueryResult(QueryResult<S> source,Class<T> targetClass){
		QueryResult<T> target=new QueryResult<T>();
		target.setCount(source.getCount());
		target.setPageIndex(source.getPageIndex());
		target.setPageSize(source.getPageSize());
		target.setData((T[]) new Object[source.getData().length]);
		for(int i=0;i<source.getData().length;i++){
			target.getData()[i] = conversionService.convert(source.getData()[i], targetClass);
		}
		return target;
	}
}
