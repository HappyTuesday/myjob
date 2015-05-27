package com.myjob.service.exception;

public class ServiceInternalException extends ServiceException {
	private static final long serialVersionUID = -1;

	public ServiceInternalException(String message){
		super(message);
	}
	
	public ServiceInternalException(Exception e){
		super(e);
	}
}
