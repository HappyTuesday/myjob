package com.myjob.service.exception;

public class ServiceLogicException extends ServiceException {
	private static final long serialVersionUID = -1;

	public ServiceLogicException(String message){
		super(message);
	}
	
	public ServiceLogicException(Exception e){
		super(e);
	}
}
