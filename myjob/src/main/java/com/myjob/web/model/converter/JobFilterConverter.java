package com.myjob.web.model.converter;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.core.convert.converter.Converter;
import org.springframework.format.Printer;
import org.springframework.stereotype.Component;

import com.myjob.query.filter.JobFilter;
import com.myjob.web.model.DisplayModel;
import com.myjob.web.model.JobFilterModel;

@Component
public class JobFilterConverter implements Converter<JobFilter,JobFilterModel> {
	
	@Resource
	private QualificationFormatter qualificationFormatter;
	
	@Override
	public JobFilterModel convert(JobFilter source) {
		JobFilterModel target = new JobFilterModel();
		
		target.setProfession(convert2DisplayModels(source.getProfession(), null));
		target.setCity(convert2DisplayModels(source.getCity(), null));
		target.setQualification(convert2DisplayModels(source.getQualification(), qualificationFormatter));
		
		return target;
	}
	
	private <T> List<DisplayModel<T>> convert2DisplayModels(List<T> source,Printer<T> printer){
		List<DisplayModel<T>> target = new ArrayList<DisplayModel<T>>();
		
		for(T item : source){
			DisplayModel<T> displayModel = new DisplayModel<T>();
			displayModel.setValue(item);
			String display = printer != null ? printer.print(item, null) : item.toString();
			displayModel.setDisplay(display);
			target.add(displayModel);
		}
		
		return target;
	}
}
