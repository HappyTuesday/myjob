package com.myjob.web.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Resume;
import com.myjob.web.model.ResumeCreateModel;

@Component
public class ResumeCreateModelConverter implements Converter<ResumeCreateModel, Resume>{
	
	@Resource
	private UserConverter userConverter;
	
	@Override
	public Resume convert(ResumeCreateModel source) {
		Resume target = new Resume();
		
		target.setName(source.getName());
		target.setBirthday(source.getBirthday());
		target.setContent(source.getContent());
		target.setGender(source.getGender());
		target.setGraduatedDate(source.getGraduatedDate());
		target.setIdCard(source.getIdCard());
		target.setIntroduction(source.getIntroduction());
		target.setProfession(source.getProfession());
		target.setQualification(source.getQualification());
		target.setSchool(source.getSchool());
		target.setWorkingYears(source.getWorkingYears());
		target.setRecruitment(source.getRecruitment());
		target.setLiveCity(source.getLiveCity());
		target.setMaritalStatus(source.getMaritalStatus());
		target.setPolitialAffiliation(source.getPolitialAffiliation());
		target.setPhone(source.getPhone());
		target.setExpectedJobProfession(source.getExpectedJobProfession());
		target.setExpectedJobCity(source.getExpectedJobCity());
		target.setExpectedSalary(source.getExpectedSalary());
		target.setCurrentWorkingStatus(source.getCurrentWorkingStatus());
		target.setCertifications(String.join(",",source.getCertifications()));

		return target;
	}
	
}
