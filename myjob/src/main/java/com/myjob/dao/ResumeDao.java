package com.myjob.dao;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import com.myjob.entity.Resume;
import com.myjob.query.QueryResult;
import com.myjob.query.criteria.ResumeQueryCriteria;

@Repository
public class ResumeDao extends BaseDao {
	
	public Resume load(long sid){
		return template.load(Resume.class, sid);
	}
	
	public Resume get(long sid){
		return template.get(Resume.class, sid);
	}
	
	public void create(Resume resume) {
		template.save(resume);
	}
	
	public void update(Resume resume) {
		template.update(resume);
	}
	
	public QueryResult<Resume> query(ResumeQueryCriteria qc) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Resume.class);
		criteria.createAlias("user","user");
		
		eq(criteria, "user.sid", qc.getUserSid());
		eq(criteria, "status", qc.getStatus());
		in(criteria, "gender", qc.getGender());
		in(criteria, "school", qc.getSchool());
		in(criteria, "profession", qc.getProfession());
		in(criteria, "workingYears", qc.getWorkingYears());

		search(criteria,qc.getKey(),"user.name","school","profession","introduction","content");
		
		return executeQuery(criteria, qc);
	}
}
