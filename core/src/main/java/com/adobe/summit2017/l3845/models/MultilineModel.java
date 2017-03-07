package com.adobe.summit2017.l3845.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class MultilineModel {

	@Inject @Default(values={})
	private String[] lines;
	
	public int getNumLines() { 
		return lines.length;
	}
}
