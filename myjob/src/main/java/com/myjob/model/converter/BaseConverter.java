package com.myjob.model.converter;

import com.myjob.common.QueryResult;
import com.myjob.infrastructure.Converter;
import com.mysql.jdbc.NotImplemented;

@Converter
public abstract class BaseConverter<TModel,TValue> {
	
	public TModel toModel(TValue value) throws NotImplemented{
		throw new NotImplemented();
	}
	
	public TValue toValue(TModel model) throws NotImplemented{
		throw new NotImplemented();
	}
	
	@SuppressWarnings("unchecked")
	public QueryResult<TModel> toModel(QueryResult<TValue> values) throws NotImplemented{
		QueryResult<TModel> models=new QueryResult<TModel>();
		models.setCount(values.getCount());
		models.setPageIndex(values.getPageIndex());
		models.setPageSize(values.getPageSize());
		TValue[] valueData = values.getData();
		TModel[] modelData = (TModel[]) new Object[valueData.length];
		for(int i=0;i<valueData.length;i++){
			modelData[i]= toModel(valueData[i]); 
		}
		models.setData(modelData);
		return models;
	}
}
