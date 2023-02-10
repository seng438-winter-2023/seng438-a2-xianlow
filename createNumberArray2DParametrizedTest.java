package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

import java.util.Collection;
import java.util.Arrays;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class createNumberArray2DParametrizedTest extends DataUtilities {
	Number expectedVals[][];
	double inputVals[][];

	
	public createNumberArray2DParametrizedTest(double[][] data) {
		this.inputVals = data;
		this.expectedVals = new Number[data.length][data[0].length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				expectedVals[i][j] = data[i][j];	
			}
		}
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> doubleVals() {
		return Arrays.asList(new Object[][] {
			{new double[][] {{1.0,2.0},{3.0,4.0}}},
			{new double[][] {{3.0,2.0,4.0},{3.0,4.0,9.0}}},
			{new double[][] {{1.0},{3.0}}
		});
	}

	 @Test
	 public void createNumberArray() {	     
	    assertArrayEquals(expectedVals, DataUtilities.createNumberArray2D(inputVals));
	     // tear-down: NONE in this test method
	 }
}
