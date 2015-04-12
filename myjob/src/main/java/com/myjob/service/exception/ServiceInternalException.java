package com.myjob.service.exception;

public class ServiceInternalException extends ServiceException {
	private static final long serialVersionUID = 7086262209536579515L;

	public ServiceInternalException(Class<?> serviceClass){
		super(serviceClass);
	}
	
	public ServiceInternalException(Class<?> serviceClass,String message){
		super(serviceClass,message);
	}
	
	public ServiceInternalException(Class<?> serviceClass,Exception e){
		super(serviceClass,e);
	}
}
