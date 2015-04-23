package com.myjob.web.util;

import org.springframework.stereotype.Component;

@Component
public class KeyProvider {
	public String ticketKey(){
		return "login-ticket";
	}
	
	public String loginAccountKey(){
		return "loginAccount";
	}
}
