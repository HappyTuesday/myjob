package com.myjob.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.dao.ResumeDao;
import com.myjob.entity.Resume;
import com.myjob.entity.criteria.ResumeQueryCriteria;
import com.myjob.entity.values.ResumeStatus;

@Service
public class ResumeService {
	@Resource
	private ResumeDao resumeDao;
	
	public void active(long resumeSid){
		Resume resume = resumeDao.get(resumeSid);
		resume.setStatus(ResumeStatus.active);
		resumeDao.update(resume);
	}
	
	public void delete(long resumeSid) {
		Resume resume = resumeDao.get(resumeSid);
		resume.setStatus(ResumeStatus.deleted);
		resumeDao.update(resume);
	}
	
	public Resume detail(long resumeSid){
		return resumeDao.get(resumeSid);
	}
	
	public void refresh(long resumeSid){
		Resume resume = resumeDao.get(resumeSid);
		resume.setUpdateTime(new Date());
		resumeDao.update(resume);
	}
	
	public void update(Resume resume){
		Resume resumep=resumeDao.get(resume.getSid());
		// TODO: merge resume to resumep
		resumeDao.update(resumep);
	}
	
	public void create(Resume resume){
		resume.setUpdateTime(new Date());
		resumeDao.create(resume);
	}
	
	public List<Resume> query(ResumeQueryCriteria criteria){
		// TODO: call dao to query data
		return new ArrayList<Resume>();
	}
}
