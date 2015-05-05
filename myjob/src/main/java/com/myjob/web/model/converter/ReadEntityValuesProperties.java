package com.myjob.web.model.converter;

import java.io.IOException;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class ReadEntityValuesProperties {
	
	@Resource(name="entityValuesProperties")
	private Properties entityValuesProperties;

	public String readEnityValuesProperties(String entityValue) throws IOException{
		return entityValuesProperties.getProperty(entityValue);
	}
}
