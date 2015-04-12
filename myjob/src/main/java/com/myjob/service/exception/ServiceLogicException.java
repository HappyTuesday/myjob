package com.myjob.service.exception;

public class ServiceLogicException extends ServiceException {
	private static final long serialVersionUID = 7086262209536579515L;

	public ServiceLogicException(Class<?> serviceClass){
		super(serviceClass);
	}
	
	public ServiceLogicException(Class<?> serviceClass,String message){
		super(serviceClass,message);
	}
	
	public ServiceLogicException(Class<?> serviceClass,Exception e){
		super(serviceClass,e);
	}
}
