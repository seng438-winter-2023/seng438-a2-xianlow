package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

import java.util.Collection;
import java.util.Arrays;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class createNumberArrayParametrizedTest extends DataUtilities {
	Number expectedVals[];
	double inputVals[];

	
	public createNumberArrayParametrizedTest(double[] data) {
		this.inputVals = data;
		this.expectedVals = new Number[data.length];
		for (int i = 0; i < data.length; i++) {
			expectedVals[i] = data.length;	
		}
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> doubleVals() {
		return Arrays.asList(new Object[][] {
			{new double[] {1.0,2.0,3.0,4.0}},
			{new double[] {1.0,2.0}},
			{new double[] {1.0,2.0,3.0}}
		});
	}

	 @Test
	 public void createNumberArray() {	     
	    assertArrayEquals(expectedVals, DataUtilities.createNumberArray(inputVals));
	     // tear-down: NONE in this test method
	 }
}
