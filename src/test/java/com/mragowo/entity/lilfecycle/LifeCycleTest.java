package com.mragowo.entity.lilfecycle;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LifeCycleTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testUnexptectException() {
		 
	   thrown.expect(NumberFormatException.class);
	   int value = Integer.valueOf("8b"); 
	   
	   System.out.println(value); 
		
	}
	
}
