package com.myjob.web.model.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.myjob.entity.GeographicSite;
import com.myjob.web.model.GeographicSiteModel;

@Component
public class GeographicSiteConverter implements Converter<GeographicSite,GeographicSiteModel>{
	public GeographicSiteModel convert(GeographicSite source) {
		GeographicSiteModel geographicSiteModel = new GeographicSiteModel();
		geographicSiteModel.setSid(source.getSid());
		geographicSiteModel.setAddress(source.getAddress());
		geographicSiteModel.setCity(source.getCity());
		geographicSiteModel.setPostCode(source.getPostCode());
		geographicSiteModel.setProvince(source.getProvince());
		return geographicSiteModel;
	}

}
