package com.myjob.web.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Resume;
import com.myjob.web.model.ResumeModel;

@Component
public class ResumeConverter implements Converter<Resume, ResumeModel>{
	
	@Resource
	private UserConverter userConverter;
	@Override
	public ResumeModel convert(Resume source) {
		ResumeModel resumeModel = new ResumeModel();
		resumeModel.setBirthday(source.getBirthday());
		resumeModel.setContent(source.getContent());
		resumeModel.setGender(source.getGender());
		resumeModel.setGraduatedDate(source.getGraduatedDate());
		resumeModel.setIdCard(source.getIdCard());
		resumeModel.setIntroduction(source.getIntroduction());
		resumeModel.setProfession(source.getProfession());
		resumeModel.setQualification(source.getQualification());
		resumeModel.setSchool(source.getSchool());
		resumeModel.setSid(source.getSid());
		resumeModel.setStatus(source.getStatus());
		resumeModel.setUpdateTime(source.getUpdateTime());
		resumeModel.setUser(userConverter.convert(source.getUser()));
		resumeModel.setWorkingYears(source.getWorkingYears());
		// TODO Auto-generated method stub
		return null;
	}
	
}
