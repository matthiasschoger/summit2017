package com.adobe.summit2017.l3845.models;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import junitx.util.PrivateAccessor;

public class MultilineModelTest {

	private MultilineModel model;
	
	@Before
	public void setUp() throws Exception {
		model = new MultilineModel();
	}
	  
	@Test
	public void testGetCalculationSuccess() throws NoSuchFieldException {
		
		PrivateAccessor.setField(model, "lines", Collections.<String>emptyList());
		assertEquals(0, model.getCalculation(), 0.01);
		
		PrivateAccessor.setField(model, "lines", Arrays.asList(new String[] {"one"}));
		assertEquals(0.25, model.getCalculation(), 0.01);
				
		PrivateAccessor.setField(model, "lines", Arrays.asList(new String[] {"one", "two", "three", "four"}));
		assertEquals(4, model.getCalculation(), 0.01);
		
		PrivateAccessor.setField(model, "lines", Arrays.asList(new String[] {"one", "two", "three", "four", "five", "six"}));
		assertEquals(-6, model.getCalculation(), 0.01);
		
	}

	@Test(expected=ArithmeticException.class)
	public void testGetCalculationException() throws NoSuchFieldException {

		PrivateAccessor.setField(model, "lines", Arrays.asList(new String[] {"one", "two", "three", "four", "five"}));
		model.getCalculation();

	}
}
