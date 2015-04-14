package com.myjob.model.converter;

import com.myjob.entity.Resume;
import com.myjob.infrastructure.Converter;
import com.myjob.model.ResumeModel;

@Converter
public class ResumeConverter extends BaseConverter<ResumeModel, Resume>{
	public ResumeModel toModel(Resume resume){
		ResumeModel model=new ResumeModel();
		// TODO: convert
		return model;
	}
	
	public Resume toValue(ResumeModel model){
		Resume resume=new Resume();
		// TODO: convert
		return resume;
	}
}
