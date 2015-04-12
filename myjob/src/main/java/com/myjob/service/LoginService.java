package com.myjob.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.dao.AccountDao;
import com.myjob.entity.Account;
import com.myjob.entity.values.AccountType;
import com.myjob.service.exception.ServiceException;
import com.myjob.service.exception.ServiceInternalException;
import com.myjob.service.exception.ServiceLogicException;

@Service
public class LoginService {
	@Resource AccountDao accountDao;
	
	public AccountType login(String loginName,String password) throws ServiceException{
		List<Account> accounts = accountDao.findByLoginName(loginName);
		if(accounts.isEmpty()){
			throw new ServiceLogicException(getClass(),"invalid account login name");
		}else if(accounts.size() > 1){
			throw new ServiceInternalException(getClass(),"more than one loginName ["+loginName+"] found in database");
		}else{
			Account account = accounts.get(0);
			if(account.getPassword() != password){
				throw new ServiceLogicException(getClass(),"invalid password");
			}else{
				return account.getType();
			}
		}
	}
}
