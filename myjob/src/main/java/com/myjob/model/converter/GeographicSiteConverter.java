package com.myjob.model.converter;

import org.springframework.core.convert.converter.Converter;

import com.myjob.entity.GeographicSite;
import com.myjob.model.GeographicSiteModel;


public class GeographicSiteConverter implements Converter<GeographicSite,GeographicSiteModel>{
	public GeographicSiteModel convert(GeographicSite source) {
		return null;
	}

}
