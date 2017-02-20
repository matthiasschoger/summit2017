package com.adobe.summit2017.l3845.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

@Model(adaptables=Resource.class)
public class MultilineModel {

	@Inject @Optional
	private List<String> lines;
	
	public float getCalculation() {
		float numLines = lines.size();
		
		return numLines / (numLines - 5) * -1; // will throw ArithmeticException (divide by zero)
	}
}
