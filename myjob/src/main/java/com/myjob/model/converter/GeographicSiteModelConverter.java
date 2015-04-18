package com.myjob.model.converter;

import javax.annotation.Resource;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import com.myjob.entity.GeographicSite;
import com.myjob.model.GeographicSiteModel;

public class GeographicSiteModelConverter implements Converter<GeographicSiteModel,GeographicSite> {
	@Override
	public GeographicSite convert(GeographicSiteModel source) {
		GeographicSite geographicSite = new GeographicSite();
		geographicSite.setSid(source.getSid());
		geographicSite.setAddress(source.getAddress());
		geographicSite.setCity(source.getCity());
		geographicSite.setPostCode(source.getPostCode());
		geographicSite.setProvince(source.getProvince());
		return geographicSite;
	}
	

}
