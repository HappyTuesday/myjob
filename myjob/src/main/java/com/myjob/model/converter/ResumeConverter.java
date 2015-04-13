package com.myjob.model.converter;

import com.myjob.entity.Resume;
import com.myjob.infrastructure.Converter;
import com.myjob.model.ResumeModel;

@Converter
public class ResumeConverter {
	public ResumeModel toModel(Resume resume){
		return new ResumeModel();
	}
}
