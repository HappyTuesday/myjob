package com.myjob.web.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.core.convert.ConversionService;

import com.myjob.common.QueryResult;
import com.myjob.entity.Account;
import com.myjob.entity.Company;
import com.myjob.entity.User;
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
		return account !=null ? account.getAccountType():null;
	}
	
	protected long loginAccountSid() {
		Account account = loginAccount();
		return account !=null ? account.getSid():0;
	}
	
	protected Company loginCompany() {
		Account account = loginAccount();
		return account != null ? account.getCompany(): null;
	}
	
	protected User loginUser() {
		Account account=loginAccount();
		return account != null ? account.getUser():null;
	}
	
	protected <S,T> T convert(S source,Class<T> targetClass) {
		return conversionService.convert(source, targetClass);
	}
	
	protected <S,T> QueryResult<T> convertQueryResult(QueryResult<S> source,Class<T> targetClass){
		QueryResult<T> target=new QueryResult<T>();
		target.setCount(source.getCount());
		target.setPageIndex(source.getPageIndex());
		target.setPageSize(source.getPageSize());
		target.setData(new ArrayList<T>(source.getData().size()));
		for(int i=0;i<source.getData().size();i++){
			target.getData().set(i, conversionService.convert(source.getData().get(i), targetClass));
		}
		return target;
	}
}
