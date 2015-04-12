package com.myjob.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.myjob.entity.Resume;

@Repository
public class ResumeDao {
	@Resource HibernateTemplate template;
	
	public Resume get(long sid){
		return template.get(Resume.class, sid);
	}
	
	public void create(Resume resume) {
		template.save(resume);
	}
	
	public void update(Resume resume) {
		template.update(resume);
	}
}
