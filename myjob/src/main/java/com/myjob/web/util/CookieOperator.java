package com.myjob.web.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class CookieOperator {
	public void setCookieValue(HttpServletResponse response,String cookieName,String cookieValue){
		Cookie cookie = new Cookie(cookieName, cookieValue);
		System.out.println("cookie: " + cookieName + " = " + cookieValue);
		response.addCookie(cookie);
	}
	
	public String getCookieValue(HttpServletRequest request,String cookieName){
		Cookie cookie = findCookieByName(request.getCookies(), cookieName);
		if(cookie == null){
			return null;
		}
		
		return cookie.getValue();
	}
	
	private Cookie findCookieByName(Cookie[] cookies,String cookieName){
		if(cookies == null){
			return null;
		}
		
		for(Cookie cookie:cookies){
			if(cookie.getName().equals(cookieName)){
				return cookie;
			}
		}
		
		return null;
	}
}
