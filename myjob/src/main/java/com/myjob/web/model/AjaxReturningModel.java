package com.myjob.web.model;

public class AjaxReturningModel {
	
	private Code code;
	
	private Object value;
	
	public enum Code{
		success,
		error,
		redirect
	}
	
	public AjaxReturningModel(){
		code = Code.success;
	}
	
	public AjaxReturningModel(Code code,Object value){
		this.code = code;
		this.value = value;
	}

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
