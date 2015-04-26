package com.myjob.common;

import java.util.List;

public class QueryResult<T> {
	private long totalCount;
	
	private List<T> records;

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long count) {
		this.totalCount = count;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> data) {
		this.records = data;
	}
}
