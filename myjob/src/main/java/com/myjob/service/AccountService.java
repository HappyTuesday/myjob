package com.myjob.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.criteria.AccountQueryCriteria;
import com.myjob.dao.AccountDao;
import com.myjob.entity.Account;
import com.myjob.service.exception.ServiceException;
import com.myjob.service.exception.ServiceInternalException;
import com.myjob.service.exception.ServiceLogicException;

@Service
public class AccountService {
	@Resource AccountDao accountDao;
	
	public Account login(String loginName,String password) throws ServiceException{
		AccountQueryCriteria criteria = new AccountQueryCriteria();
		criteria.setLoginName(loginName);
		List<Account> accounts = accountDao.query(criteria).getData();

		if(accounts.isEmpty()){
			throw new ServiceLogicException(getClass(),"invalid account login name");
		}else if(accounts.size() > 1){
			throw new ServiceInternalException(getClass(),"more than one loginName ["+loginName+"] found in database");
		}else{
			Account account = accounts.get(0);
			//System.out.println("input password: [" + password + "], origin password: [" + account.getPassword() + "]");
			if(!account.getPassword().equals(password)){
				throw new ServiceLogicException(getClass(),"invalid password");
			}else{
				return account;
			}
		}
	}
}