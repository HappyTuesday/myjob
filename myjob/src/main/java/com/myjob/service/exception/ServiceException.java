package com.myjob.service.exception;

public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = -1;
	
	public ServiceException(String message){
		super(message);
	}
	
	public ServiceException(Exception e){
		super(e);
	}
}
