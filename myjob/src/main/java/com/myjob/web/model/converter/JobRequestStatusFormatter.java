package com.myjob.web.model.converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;

import org.springframework.format.Formatter;

import com.myjob.entity.values.JobRequestStatus;

public class JobRequestStatusFormatter implements Formatter<JobRequestStatus> {

	@Override
	public String print(JobRequestStatus arg0, Locale arg1) {
		Properties pro = new Properties();
		try {
			pro.load(AccountTypeFormatter.class.getResourceAsStream("/com/myjob/model/converter/EntityValues.properties"));
			if(arg0.toString()=="requested"){
				return pro.getProperty("requested");
			}else if(arg0.toString()=="canceled"){
				return  pro.getProperty("canceled");
			}else if(arg0.toString()=="rejected"){
				return  pro.getProperty("rejected");
			}else if(arg0.toString()=="approved"){
				return  pro.getProperty("approved");
			}
			
		} catch (IOException e) {
			System.err.println("Cannot load properties file");
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public JobRequestStatus parse(String arg0, Locale arg1)
			throws ParseException {
		// TODO Auto-generated method stub
		return JobRequestStatus.valueOf(arg0);
	}

}
