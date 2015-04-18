package com.myjob.dao;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import com.myjob.common.QueryResult;
import com.myjob.criteria.AccountQueryCriteria;
import com.myjob.entity.Account;

@Repository
public class AccountDao extends BaseDao {
	
	public Account get(long sid){
		return template.get(Account.class, sid);
	}
	
	public void create(Account account){
		template.save(account);
	}
	
	public QueryResult<Account> query(AccountQueryCriteria qc){
		DetachedCriteria criteria = DetachedCriteria.forClass(Account.class);
		
		eq(criteria, "loginName", qc.getLoginName());
		eq(criteria, "email", qc.getEmail());
		
		return executeQuery(criteria, qc);
	}
}
