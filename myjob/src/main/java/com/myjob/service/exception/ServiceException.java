package com.myjob.service.exception;

public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = -7459586354360630180L;
	
	private Class<?> serviceClass;

	public ServiceException(Class<?> serviceClass){
		this.serviceClass=serviceClass;
	}
	
	public ServiceException(Class<?> serviceClass,String message){
		super(message);
		this.serviceClass=serviceClass;
	}
	
	public ServiceException(Class<?> serviceClass,Exception e){
		super(e);
		this.serviceClass=serviceClass;
	}
	
	public Class<?> getServiceType(){
		return this.serviceClass;
	}
}
