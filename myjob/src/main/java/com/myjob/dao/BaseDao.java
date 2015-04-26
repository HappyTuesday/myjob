package com.myjob.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.myjob.common.QueryResult;
import com.myjob.criteria.QueryCriteria;

public class BaseDao {
	
	@Resource HibernateTemplate template;
	
	@SuppressWarnings("unchecked")
	protected <T> QueryResult<T> executeQuery(DetachedCriteria criteria,QueryCriteria qc) {
		if(qc.getOrderby()!=null && !qc.getOrderby().trim().isEmpty()){
			if(qc.isDesc()){
				criteria.addOrder(Order.desc(qc.getOrderby()));
			}else{
				criteria.addOrder(Order.asc(qc.getOrderby()));
			}
		}
		
		List<?> data;
		long count;
		if(qc.getPageSize() <= 0){
			data = template.findByCriteria(criteria);
			count = 0;
		}else{
			data = template.findByCriteria(criteria,qc.firstResult(),qc.maxResults());
			criteria.setProjection(Projections.rowCount());
			count = (long) template.findByCriteria(criteria).get(0);
		}

		QueryResult<T> result = new QueryResult<T>();
		
		result.setRecords((List<T>) data);
		result.setTotalCount(count);
		return result;
	}
	
	protected void search(DetachedCriteria criteria,String[] searchedProperties,QueryCriteria qc) {
		if(qc.getKey()!=null && !qc.getKey().trim().isEmpty() && searchedProperties !=null && searchedProperties.length > 0){
			Disjunction keyRestrictions = Restrictions.disjunction();
			for (String property : searchedProperties) {
				keyRestrictions.add(Restrictions.ilike(property, qc.getKey()));
			}
			criteria.add(keyRestrictions);
		}
	}
	
	protected void in(DetachedCriteria criteria,String property,Object[] values) {
		if(values!=null && values.length > 0){
			criteria.add(Restrictions.in(property, values));
		}
	}
	
	protected void eq(DetachedCriteria criteria,String property,Object value) {
		if(value!=null){
			criteria.add(Restrictions.eq(property, value));
		}
	}
}
