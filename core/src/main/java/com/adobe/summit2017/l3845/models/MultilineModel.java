package com.adobe.summit2017.l3845.models;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

@Model(adaptables=Resource.class)
public class MultilineModel {

	@Inject @Optional
	private List<String> lines;
	
	public List<String> getLines() {
		return lines != null ? lines : Collections.<String>emptyList();
	}
}
