package com.myjob.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class EncodingInterceptor extends HandlerInterceptorAdapter{
	
	private final String defaultEncoding = "UTF-8";
	
	private String encoding = defaultEncoding;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		
		return true;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
}
