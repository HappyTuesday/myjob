package com.myjob.model.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.Resume;
import com.myjob.model.ResumeModel;

@Component
public class ResumeConverter implements Converter<Resume, ResumeModel>{

	@Override
	public ResumeModel convert(Resume source) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
