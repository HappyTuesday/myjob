package com.myjob.web.model;

public class DisplayModel<T> {
	private T value;
	
	private String display;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
}
