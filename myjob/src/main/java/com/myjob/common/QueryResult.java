package com.myjob.common;

public class QueryResult<T> {
	private long count;
	
	private T[] data;
	
	private int pageIndex;
	
	private int pageSize;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public T[] getData() {
		return data;
	}

	public void setData(T[] data) {
		this.data = data;
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
	
}
