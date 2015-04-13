package com.myjob.dao;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import com.myjob.entity.Resume;
import com.myjob.entity.criteria.QueryResult;
import com.myjob.entity.criteria.ResumeQueryCriteria;

@Repository
public class ResumeDao extends BaseDao {
	
	private String[] searchedProperties = "user.name,school,qualification,profession,introduction,content".split(",");
	
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
		
		eq(criteria, "user.sid", qc.getUserSid());
		eq(criteria, "status", qc.getStatus());
		in(criteria, "gender", qc.getGender());
		in(criteria, "school", qc.getSchool());
		in(criteria, "profession", qc.getProfession());
		in(criteria, "workingYears", qc.getWorkingYears());
		search(criteria, searchedProperties, qc);
		
		return executeQuery(criteria, qc);
	}
}
