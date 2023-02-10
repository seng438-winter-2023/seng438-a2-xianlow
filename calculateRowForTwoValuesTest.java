package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.jmock.internal.ExpectationBuilder;
import org.junit.Before;
import org.junit.Test;

public class calculateRowForTwoValuesTest extends DataUtilities {
	Mockery mockingContext = new Mockery();
    final Values2D values = mockingContext.mock(Values2D.class);
	@Before
	public void setUp() {
		
	     mockingContext.checking((ExpectationBuilder) new Expectations() {
	         {
	             one(values).getColumnCount();
	             will(returnValue(2));
	             one(values).getValue(0, 0);
	             will(returnValue(10.5));
	             one(values).getValue(0, 1);
	             will(returnValue(5.5));
	             
	         }
	     });
	}

	 @Test
	 public void calculateRowForTwoValues() {
	     // exercise	
	     double result = DataUtilities.calculateRowTotal(values, 0);
	     // verify
	     
	     
	     assertEquals(16.0, result, .000000001d);
	     // tear-down: NONE in this test method
	 }
}
