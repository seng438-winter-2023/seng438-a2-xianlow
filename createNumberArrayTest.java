package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.jmock.internal.ExpectationBuilder;
import org.junit.Before;
import org.junit.Test;

public class createNumberArrayTest extends DataUtilities {
	Number realVals[] = new Number[4];
	@Before
	public void setUp() {
		realVals[0] = 1.0;
		realVals[1] = 2.0;
		realVals[2] = 3.0;
		realVals[3] = 4.0;
	     
	}

	 @Test
	 public void createNumberArray() {
	     // exercise
		double values[] = new double[4];
		values[0] = 1.0;
		values[1] = 2.0;
		values[2] = 3.0;
		values[3] = 4.0;
	    Number result[] = DataUtilities.createNumberArray(values);
	    System.out.println(realVals[3]);
	     // verify
	     
	     
	    assertArrayEquals(realVals, result);
	     // tear-down: NONE in this test method
	 }
}
