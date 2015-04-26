package com.myjob.web.model.converter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadEntityValuesProperties {
	public String readEnityValuesProperties(String entityValue) throws IOException{
		String temp=null;
		BufferedReader br = new BufferedReader(
								new InputStreamReader(
										new FileInputStream(
												new File("Folder/Chat/EntityValues.properties"))));
		StringBuilder fileContent= new StringBuilder();
		while(null!=(temp=br.readLine())){
			fileContent.append(temp);
		}
		temp =fileContent.substring(fileContent.indexOf(entityValue)+entityValue.length());
		temp=temp.substring(1,temp.indexOf("/"));
		br.close();
		return temp;	
	}

}
