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
		ResumeModel target = new ResumeModel();
		
		target.setName(source.getName());
		target.setBirthday(source.getBirthday());
		target.setContent(source.getContent());
		target.setGender(source.getGender().toString());
		target.setGraduatedDate(source.getGraduatedDate());
		target.setIdCard(source.getIdCard());
		target.setIntroduction(source.getIntroduction());
		target.setProfession(source.getProfession());
		target.setQualification(source.getQualification().toString());
		target.setSchool(source.getSchool());
		target.setSid(source.getSid());
		target.setMaritalStatus(source.getStatus().toString());
		target.setUpdateTime(source.getUpdateTime());
		target.setUser(userConverter.convert(source.getUser()));
		target.setWorkingYears(source.getWorkingYears());
		target.setRecruitment(source.getRecruitment());
		target.setLiveCity(source.getLiveCity());
		target.setMaritalStatus(source.getMaritalStatus().toString());
		target.setPolitialAffiliation(source.getPolitialAffiliation());
		target.setPhone(source.getPhone());
		target.setExpectedJobProfession(source.getExpectedJobProfession());
		target.setExpectedJobCity(source.getExpectedJobCity());
		target.setExpectedSalary(source.getExpectedSalary());
		target.setCurrentWorkingStatus(source.getCurrentWorkingStatus());
		target.setCertifications( source.getCertifications() != null ? source.getCertifications().split(",") : new String[]{});

		return target;
	}
}
