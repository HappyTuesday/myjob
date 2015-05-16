package com.myjob.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import com.myjob.entity.Job;
import com.myjob.query.QueryResult;
import com.myjob.query.criteria.JobQueryCriteria;
import com.myjob.query.filter.JobFilter;

@Repository
public class JobDao extends BaseDao {
	
	public Job load(long sid){
		return template.load(Job.class, sid);
	}
	
	public Job get(long sid){
		return template.get(Job.class, sid);
	}
	
	public void create(Job job) {
		template.save(job);
	}
	
	public void update(Job job){
		template.update(job);
	}
	
	public QueryResult<Job> query(JobQueryCriteria qc){
		DetachedCriteria criteria = setupSearchCriteria(qc.getKey());
		
		eq(criteria, "company.sid", qc.getCompanySid());
		eq(criteria, "status", qc.getStatus());
		
		in(criteria, "profession", qc.getProfession());
		in(criteria, "workingLocation.city", qc.getCity());
		in(criteria, "qualification", qc.getQualification());

		return executeQuery(criteria, qc);
	}
	
	public JobFilter generateFilter(String key){
		JobFilter filterDefination = new JobFilter();
		
		filterDefination.setProfession(getFieldAvailableValues(key, "profession"));
		filterDefination.setCity(getFieldAvailableValues(key, "workingLocation.city"));
		filterDefination.setQualification(getFieldAvailableValues(key, "qualification"));
		
		return filterDefination;
	}
	
	@SuppressWarnings("unchecked")
	private <T> List<T> getFieldAvailableValues(String key,String fieldName){
		DetachedCriteria criteria = setupSearchCriteria(key);
		criteria.setProjection(Projections.distinct(Projections.property(fieldName)));
		return (List<T>) template.findByCriteria(criteria);
	}
	
	private DetachedCriteria setupSearchCriteria(String key){
		DetachedCriteria criteria = DetachedCriteria.forClass(Job.class);
		criteria.createAlias("company", "company");
		criteria.createAlias("workingLocation", "workingLocation");

		search(criteria, key, 
				"company.category","company.description","company.name",
				"description","name","profession",
				"workingLocation.city","workingLocation.province"
		);
		
		return criteria;
	}
}
