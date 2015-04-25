package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import org.springframework.format.Formatter;

import com.myjob.entity.values.JobStatus;

public class JobStatusFormatter implements Formatter<JobStatus>{

	@Override
	public String print(JobStatus arg0, Locale arg1) {
		Properties pro = new Properties();
		try {
			pro.load(AccountTypeFormatter.class.getResourceAsStream("/com/myjob/model/converter/EntityValues.properties"));
			if(arg0.toString()=="active"){
				return pro.getProperty("active");
			}else if(arg0.toString()=="disabled"){
				return  pro.getProperty("disabled");
			}
			
		} catch (IOException e) {
			System.err.println("Cannot load properties file");
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public JobStatus parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return JobStatus.valueOf(arg0);
	}

}
