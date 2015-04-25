package com.myjob.web.model.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.GeographicSite;
import com.myjob.web.model.GeographicSiteModel;

@Component
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
