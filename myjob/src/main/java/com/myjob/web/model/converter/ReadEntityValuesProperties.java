package com.myjob.web.model.converter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.stereotype.Component;

@Component
public class ReadEntityValuesProperties {
	private String temp;
	private StringBuilder fileContent= new StringBuilder();
	public ReadEntityValuesProperties() throws IOException{
				BufferedReader br = new BufferedReader(
						new InputStreamReader(
								new FileInputStream(
										new File("Folder/Chat/EntityValues.properties"))));
		
		while(null!=(temp=br.readLine())){
		fileContent.append(temp);
		}		
		br.close();	
	}
	public String readEnityValuesProperties(String entityValue) throws IOException{
		String temp=null;
		temp =fileContent.substring(fileContent.indexOf(entityValue)+entityValue.length());
		temp=temp.substring(1,temp.indexOf("/"));	
		return temp;	
	}

}
