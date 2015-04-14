package com.myjob.criteria;

public class QueryCriteria {

	private String key;
	
	private int pageIndex;

	private int pageSize;
	
	private String orderby;
	
	private boolean desc;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getOrderby() {
		return orderby;
	}

	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}
	
	public int firstResult(){
		return pageIndex*pageSize;
	}
	
	public int maxResults(){
		return (pageIndex+1)*pageSize;
	}

	public boolean isDesc() {
		return desc;
	}

	public void setDesc(boolean desc) {
		this.desc = desc;
	}
}
