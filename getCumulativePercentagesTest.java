package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.jmock.internal.ExpectationBuilder;
import org.junit.Before;
import org.junit.Test;
class Key implements Comparable<Key>{
	int keyVal;
	Key(int keyVal){
		this.keyVal = keyVal;
	}
	@Override
	public int compareTo(Key o) {
		
		return o.keyVal;
	}
	public int getKey() {
		return keyVal;
	}
}

public class getCumulativePercentagesTest extends DataUtilities {
	
    DefaultKeyedValues testValues = new DefaultKeyedValues();
	@Before
	public void setUp() {
		testValues.setValue("0", 5.0);
		testValues.setValue("1", 9.0);
		testValues.setValue("2", 2.0);

	}

	 @Test
	 public void getCumulativePercentages() {
	     // exercise
		 
	     // verify
		
	    KeyedValues results = DataUtilities.getCumulativePercentages(testValues);
	    System.out.println(testValues.getValue(0));
	    
	    assertEquals(0.3125, results.getValue(0)); //expected value  0.3125 (5 / 16)
	    assertEquals(0.875, results.getValue(1)); // expected value 0.875 ((5 + 9) / 16)
	    assertEquals(1.0, results.getValue(2)); //expected value 1.0 ((5 + 9 + 2) / 16)
	    
	     // tear-down: NONE in this test method
	 }
}
