package com.myjob.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjob.dao.ResumeDao;
import com.myjob.entity.Resume;
import com.myjob.entity.values.ResumeStatus;
import com.myjob.query.QueryResult;
import com.myjob.query.criteria.ResumeQueryCriteria;
import com.myjob.service.exception.ServiceException;
import com.myjob.service.exception.ServiceInternalException;
import com.myjob.service.exception.ServiceLogicException;

@Service
public class ResumeService {
	@Resource
	private ResumeDao resumeDao;
	
	public Resume getActiveResume(long userSid) throws ServiceException{
		Resume resume = getActiveResumeNullable(userSid);
		if(resume == null){
			throw new ServiceLogicException(getClass(),"No active resume found");
		}
		
		return resume;
	}
	
	public void active(long resumeSid){
		Resume resume = resumeDao.load(resumeSid);
		
		ResumeQueryCriteria criteria = new ResumeQueryCriteria();
		criteria.setUserSid(resume.getUserSid());
		criteria.setStatus(ResumeStatus.active);
		List<Resume> activedResumes = resumeDao.query(criteria).getRecords();
		for(Resume activedResume : activedResumes){
			activedResume.setStatus(ResumeStatus.inactive);
			resumeDao.update(activedResume);
		}
		
		resume.setStatus(ResumeStatus.active);
		resumeDao.update(resume);
	}
	
	public void delete(long resumeSid) {
		Resume resume = resumeDao.load(resumeSid);
		resume.setStatus(ResumeStatus.deleted);
		resumeDao.update(resume);
	}
	
	public Resume detail(long resumeSid){
		return resumeDao.get(resumeSid);
	}
	
	public void refresh(long resumeSid){
		Resume resume = resumeDao.load(resumeSid);
		resume.setUpdateTime(new Date());
		resumeDao.update(resume);
	}
	
	public void update(Resume resume){
		resume.setUpdateTime(new Date());
		Resume oldResume = resumeDao.load(resume.getSid());
		resume.setStatus(oldResume.getStatus());
		
		resumeDao.update(resume);
	}
	
	public void create(Resume resume){
		resume.setUpdateTime(new Date());
		Resume activeResume = getActiveResumeNullable(resume.getUser().getSid());
		if(activeResume != null){
			activeResume.setStatus(ResumeStatus.inactive);
			resumeDao.update(activeResume);
		}

		resume.setStatus(ResumeStatus.active);
		resumeDao.create(resume);
	}
	
	public QueryResult<Resume> query(ResumeQueryCriteria criteria){
		criteria.setStatus(ResumeStatus.active);
		return resumeDao.query(criteria);
	}
	
	public QueryResult<Resume> queryMyResumes(ResumeQueryCriteria criteria,long userSid) {
		criteria.setUserSid(userSid);
		return resumeDao.query(criteria);
	}
	
	private Resume getActiveResumeNullable(long userSid){
		ResumeQueryCriteria criteria = new ResumeQueryCriteria();
		criteria.setUserSid(userSid);
		criteria.setStatus(ResumeStatus.active);
		
		List<Resume> resumes = resumeDao.query(criteria).getRecords();
		if(resumes.size() == 0){
			return null;
		}else if(resumes.size() > 1){
			throw new ServiceInternalException(getClass(),"More than one active resume found");
		}
		
		return resumes.get(0);
	}
}
