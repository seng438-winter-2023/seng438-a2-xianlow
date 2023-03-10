package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.*;

public class RangeTest {

	private Range range;
	private Range range1;
	private Range range2;
	private Range expandedRange;
	
	
	@BeforeClass public static void setUpBeforeClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	//---------------TESTING CONSTRUCTOR Range(double, double)---------------
	
	//testing constructor with lower bound > upper bound
	@Test
	public void lowerShouldBeLessThanUpper() {
		try {
			range = new Range(1, -1);
		}
		catch(Exception e) {
			Assert.assertEquals(e.getMessage(), "Range(double, double): require lower (1.0) <= upper (-1.0).");
		}
	}
	
	//testing constructor with lower bound = upper bound
	@Test
	public void boundsCanBeEqual() {
		try {
			range = new Range(1, 1);
		}
		catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	//testing constructor with lower bound = upper bound = 0
	@Test
	public void boundsCanBeZero() {
		try {
			range = new Range(0, 0);
		}
		catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	//testing constructor with lower and upper bounds as double
	@Test
	public void boundsCanBeDouble() {
		try {
			range = new Range(-1.1, 1.1);
		}
		catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	//---------------TESTING GETTERS getLowerBound() and getUpperBound---------------
	
	//testing getLowerBound() with negative lower bound
	@Test
	public void getNegativeLowerBound() {
		double lower = -100;
		range = new Range(lower, 1000);
		assertEquals(lower, range.getLowerBound(), 0.000000001d);
	}
	
	//testing getLowerBound() with 0 lower bound
	@Test
	public void getZeroLowerBound() {
		double lower = 0;
		range = new Range(lower, 1000);
		assertEquals(lower, range.getLowerBound(), 0.000000001d);
	}
	
	//testing getLowerBound() with positive lower bound
	@Test
	public void getPositiveLowerBound() {
		double lower = 100;
		range = new Range(lower, 1000);
		assertEquals(lower, range.getLowerBound(), 0.000000001d);
	}
	
	//testing getLowerBound() when lower = upper
	@Test
	public void getEqualLowerBound() {
		double lower = 101;
		range = new Range(lower, lower);
		assertEquals(lower, range.getLowerBound(), 0.000000001d);
	}
	
	//testing getUpperBound() with negative upper bound
	@Test
	public void getNegativeUpperBound() {
		double upper = -100;
		range = new Range(-1000, upper);
		assertEquals(upper, range.getUpperBound(), 0.000000001d);
	}
	
	//testing getUpperBound() with 0 upper bound
	@Test
	public void getZeroUpperBound() {
		double upper = 0;
		range = new Range(-1000, upper);
		assertEquals(upper, range.getUpperBound(), 0.000000001d);
	}
	
	//testing getUpperBound() with positive upper bound
	@Test
	public void getPositiveUpperBound() {
		double upper = 100;
		range = new Range(-1000, upper);
		assertEquals(upper, range.getUpperBound(), 0.000000001d);
	}
	
	//testing getUpperBound() when lower = upper
	@Test
	public void getEqualUpperBound() {
		double upper = 101;
		range = new Range(upper, upper);
		assertEquals(upper, range.getUpperBound(), 0.000000001d);
	}
	
	//---------------TESTING getLength()---------------
	
	//testing getLength() with both bounds negative
	@Test
	public void getLengthWithBothBoundsNegative() {
		range = new Range(-20, -10);
		assertEquals(10, range.getLength(), 0.000000001d);
	}
	
	//testing getLength() with both bounds positive
	@Test
	public void getLengthWithBothBoundsPositive() {
		range = new Range(10, 20);
		assertEquals(10, range.getLength(), 0.000000001d);
	}
	
	//testing getLength() with both bounds equal
	@Test
	public void getLengthWithBothBoundsEqual() {
		range = new Range(0, 0);
		assertEquals(0, range.getLength(), 0.000000001d);
	}
	
	//testing getLength() with negative lower and positive upper bound
	@Test
	public void getLengthWithNegativeLowerAndPositiveUpper() {
		range = new Range(-10, 20);
		assertEquals(30, range.getLength(), 0.000000001d);
	}
	
	//testing getLength() with 0 lower and positive upper bound
	@Test
	public void getLengthWithZeroLowerAndPositiveUpper() {
		range = new Range(0, 20);
		assertEquals(20, range.getLength(), 0.000000001d);
	}
	
	//testing getLength() with negative lower and 0 upper bound
	@Test
	public void getLengthWithNegativeLowerAndZeroUpper() {
		range = new Range(-10, 0);
		assertEquals(10, range.getLength(), 0.000000001d);
	}
	
	//---------------TESTING getCentralValue()---------------
	
	//testing getCentralValue() with negative lower and positive upper bound
	@Test
	public void getCentralValueWithNegativeLowerAndPositiveUpper() {
		range = new Range(-10, 10);
		assertEquals("The central value of -10 and 10 should be 0", 0, range.getCentralValue(), 0.000000001d);
	}
	
	//testing getCentralValue() with negative lower and upper bound
	@Test
	public void getCentralValueWithBothBoundsNegative() {
		range = new Range(-20, -10);
		assertEquals(-15, range.getCentralValue(), 0.000000001d);
	}
	
	//testing getCentralValue() with positive lower and upper bound
	@Test
	public void getCentralValueWithBothBoundsPositive() {
		range = new Range(10, 20);
		assertEquals(15, range.getCentralValue(), 0.000000001d);
	}	
	
	//testing getCentralValue() with 0 lower and positive upper bound
	@Test
	public void getCentralValueWithZeroLowerAndPositiveUpper() {
		range = new Range(0, 20);
		assertEquals(10, range.getCentralValue(), 0.000000001d);
	}		
	
	//testing getCentralValue() with 0 lower and positive upper bound
	@Test
	public void getCentralValueWithNegativeLowerAndZeroUpper() {
		range = new Range(-20, 0);
		assertEquals(-10, range.getCentralValue(), 0.000000001d);
	}
	
	//---------------TESTING equals(Object)---------------
	
	//testing equals(Object) when input = range
	@Test
	public void equalsWhenInputEqualToRange() {
		range1 = new Range(0, 10);
		range2 = new Range(0, 10);
		assertTrue(range1.equals(range2));
	}
	
	//testing equals(Object) when input != range and input lower is equal to range lower
	@Test
	public void equalsWhenInputInequalToRangeAndInputLowerEqualToRangeLower() {
		range1 = new Range(0, 10);
		range2 = new Range(0, 20);
		assertFalse(range1.equals(range2));
	}
	
	//testing equals(Object) when input != range and input lower is inequal to range lower
	@Test
	public void equalsWhenInputInequalToRangeAndInputLowerInequalToRangeLower() {
		range1 = new Range(0, 10);
		range2 = new Range(10, 20);
		assertFalse(range1.equals(range2));
	}
	
	//---------------TESTING combine(Range, Range)---------------
	
	//testing combine(Range, Range) with both ranges null
	@Test
	public void combineBothNull() {
		range = Range.combine(null, null);
		assertNull(range);
	}
	
	//testing combine(Range, Range) with first range null
	@Test
	public void combineFirstNull() {
		range1 = new Range(-10, 0);
		range = Range.combine(null, range1);
		assertEquals(range, range1);
	}
	
	//testing combine(Range, Range) with second range null
	@Test
	public void combineSecondNull() {
		range1 = new Range(-10, 0);
		range = Range.combine(range1, null);
		assertEquals(range, range1);
	}
	
	//testing combine(Range, Range) with both ranges equal
	@Test
	public void combineBothEqual() {
		range1 = new Range(-10, 0);
		range2 = new Range(-10, 0);
		range = Range.combine(range1, range2);
		assertEquals(range, range1);
	}
	
	//testing combine(Range, Range) with both ranges not null where upper bound of first range is equal to lower bound second range
	@Test
	public void combineBothNotNullWithFirstRangeUpperEqualToSecondLower() {
		try {
			range1 = new Range(-10, 0);
			range2 = new Range(0, 10);
			range = Range.combine(range1, range2);
			Range expectedRange = new Range(-10, 10);
			assertEquals(range, expectedRange);
		} catch(Exception e) {
			fail("Combine failed when both ranges are not null and upper bound of first range is equal to lower bound second range");
		}
	}
	
	//testing combine(Range, Range) with both ranges not null where upper bound of first range is less than lower bound second range by 1
	@Test
	public void combineBothNotNullWithFirstRangeUpperLessThanSecondLowerByOne() {
		try {
			range1 = new Range(-10, 0);
			range2 = new Range(1, 10);
			range = Range.combine(range1, range2);
			Range expectedRange = new Range(-10, 10);
			assertEquals(range, expectedRange);
		} catch(Exception e) {
			fail("Combine failed when both ranges are not null and upper bound of first range is less than lower bound second range by 1");
		}
	}
	
	//testing combine(Range, Range) with both ranges not null where upper bound of first range is less than lower bound second range by more than 1
	@Test
	public void combineBothNotNullWithFirstRangeUpperLessThanSecondLowerByMoreThanOne() {
		try {
			range1 = new Range(-10, 0);
			range2 = new Range(2, 10);
			range = Range.combine(range1, range2);
			Range expectedRange = new Range(-10, 10);
			assertEquals(range, expectedRange);
		} catch(Exception e) {
			fail("Combine failed when both ranges are not null and upper bound of first range is less than lower bound second range by more than one");
		}
	}
	
	//testing combine(Range, Range) with both ranges not null where upper bound of second range is equal to lower bound of first
	@Test
	public void combineBothNotNullWithSecondRangeUpperEqualToFirstLower() {
		try {
			range1 = new Range(0, 10);
			range2 = new Range(-10, 0);
			range = Range.combine(range1, range2);
			Range expectedRange = new Range(-10, 10);
			assertEquals(range, expectedRange);
		} catch(Exception e) {
			fail("Combine failed when both ranges are not null and upper bound of first range is less than lower bound second range by more than one");
		}
	}
	
	//testing combine(Range, Range) with both ranges not null where upper bound of second range is less than lower bound of first by 1
	@Test
	public void combineBothNotNullWithSecondRangeUpperLessThanFirstLowerByOne() {
		try {
			range1 = new Range(1, 10);
			range2 = new Range(-10, 0);
			range = Range.combine(range1, range2);
			Range expectedRange = new Range(-10, 10);
			assertEquals(range, expectedRange);
		} catch(Exception e) {
			fail("Combine failed when both ranges are not null and upper bound of first range is less than lower bound second range by more than one");
		}
	}
	
	//testing combine(Range, Range) with both ranges not null where upper bound of second range is less than lower bound of first by more than 1
	@Test
	public void combineBothNotNullWithSecondRangeUpperLessThanFirstLowerByMoreThanOne() {
		try {
			range1 = new Range(2, 10);
			range2 = new Range(-10, 0);
			range = Range.combine(range1, range2);
			Range expectedRange = new Range(-10, 10);
			assertEquals(range, expectedRange);
		} catch(Exception e) {
			fail("Combine failed when both ranges are not null and upper bound of first range is less than lower bound second range by more than one");
		}
	}
	
	//---------------TESTING contains(double)---------------
	
	//testing contains(double) when value is below range
	@Test
	public void containsBelowRange() {
		range = new Range(0, 10);
		assertFalse(range.contains(-10));
	}
	
	//testing contains(double) when value is one below lower bound
	@Test
	public void containsOneLessThanLowerBound() {
		range = new Range(0, 10);
		assertFalse(range.contains(-1));
	}
	
	//testing contains(double) when value is equal to lower bound
	@Test
	public void containsLowerBound() {
		range = new Range(0, 10);
		assertTrue(range.contains(0));
	}
	
	//testing contains(double) when value is within range
	@Test
	public void containsWithinRange() {
		range = new Range(0, 10);
		assertTrue(range.contains(5));
	}
	
	//testing contains(double) when value is equal to upper bound
	@Test
	public void containsUpperBound() {
		range = new Range(0, 10);
		assertTrue(range.contains(10));
	}
	
	//testing contains(double) when value is one above upper bound
	@Test
	public void containsOneGreaterThanUpperBound() {
		range = new Range(0, 10);
		assertFalse(range.contains(11));
	}
	
	//testing contains(double) when value is above upper bound
	@Test
	public void containsAboveUpperBound() {
		range = new Range(0, 10);
		assertFalse(range.contains(20));
	}
	
	//---------------TESTING intersects(double, double)---------------
	
	//testing intersects(double, double) when input is fully to the left of range
	@Test
	public void intersectWhenInputFullyLeft() {
		range = new Range(0, 10);
		assertFalse(range.intersects(-10, -5));
	}
	
	//testing intersects(double, double) when input upper is equal to lower bound of range
	@Test
	public void intersectWhenInputUpperEqualToRangeLower() {
		range = new Range(0, 10);
		assertTrue(range.intersects(-10, 0));
	}
	
	//testing intersects(double, double) when input upper is within range
	@Test
	public void intersectWhenInputUpperWithinRange() {
		range = new Range(0, 10);
		assertTrue(range.intersects(-10, 5));
	}
	
	//testing intersects(double, double) when input is fully contained within range
	@Test
	public void intersectWhenInputFullyInRange() {
		range = new Range(0, 10);
		assertTrue(range.intersects(2, 8));
	}
	
	//testing intersects(double, double) when input lower is within range
	@Test
	public void intersectWhenInputLowerWithinRange() {
		range = new Range(0, 10);
		assertTrue(range.intersects(5, 15));
	}
	
	//testing intersects(double, double) when input lower is equal to range upper
	@Test
	public void intersectWhenInputLowerEqualToRangeUpper() {
		range = new Range(0, 10);
		assertTrue(range.intersects(10, 15));
	}
	
	//testing intersects(double, double) when input is fully to the right of range
	@Test
	public void intersectWhenInputFullyRight() {
		range = new Range(0, 10);
		assertFalse(range.intersects(15, 20));
	}
	
	//testing intersects(double, double) when range is fully contained within input
	@Test
	public void intersectWhenRangeFullyInInput() {
		range = new Range(0, 10);
		assertTrue(range.intersects(-10, 20));
	}
	
	//---------------TESTING constrain(double)---------------
	
	//testing constrain(double) when input is within range
	@Test
	public void constrainWhenInputWithinRange() {
		range = new Range(0, 10);
		assertEquals(5, range.constrain(5), 0.00000001d);
	}
	
	//testing constrain(double) when input is range lower bound
	@Test
	public void constrainWhenInputEqualToLower() {
		range = new Range(0, 10);
		assertEquals(0, range.constrain(0), 0.00000001d);
	}
	
	//testing constrain(double) when input is range upper bound
	@Test
	public void constrainWhenInputEqualToUpper() {
		range = new Range(0, 10);
		assertEquals(10, range.constrain(10), 0.00000001d);
	}
	
	//testing constrain(double) when input is below range
	@Test
	public void constrainWhenInputBelowRange() {
		range = new Range(0, 10);
		assertEquals(0, range.constrain(-10), 0.00000001d);
	}
	
	//testing constrain(double) when input is above range
	@Test
	public void constrainWhenInputAboveRange() {
		range = new Range(0, 10);
		assertEquals(10, range.constrain(20), 0.00000001d);
	}
	
	//---------------TESTING expandToInclude(Range, double)---------------
	
	//testing expandToInclude(Range, double) when range is null
	@Test 
	public void expandToIncludeWhenRangeIsNull() {
		range = null;
		expandedRange = Range.expandToInclude(range, 10);
		assertTrue(expandedRange.contains(10));
	}
	
	//testing expandToInclude(Range, double) when value is already within range
	@Test 
	public void expandToIncludeWhenValueAlreadyWithinRange() {
		range = new Range(0, 10);
		expandedRange = Range.expandToInclude(range, 5);
		assertEquals(range.getLength(), expandedRange.getLength(), 0);
	}
	
	//testing expandToInclude(Range, double) when value is to the right of range
	@Test 
	public void expandToIncludeWhenValueRightOfRange() {
		range = new Range(0, 10);
		expandedRange = Range.expandToInclude(range, 15);
		Range expectedRange = new Range(0, 15);
		assertEquals(expandedRange, expectedRange);
	}
	
	//testing expandToInclude(Range, double) when value is to the left of range
	@Test 
	public void expandToIncludeWhenValueLeftOfRange() {
		range = new Range(0, 10);
		expandedRange = Range.expandToInclude(range, -5);
		Range expectedRange = new Range(-5, 10);
		assertEquals(expandedRange, expectedRange);
	}
	
	//testing expandToInclude(Range, double) when value is equal to lower
	@Test 
	public void expandToIncludeWhenValueEqualToLower() {
		range = new Range(0, 10);
		expandedRange = Range.expandToInclude(range, 0);
		Range expectedRange = new Range(0, 10);
		assertEquals(expandedRange, expectedRange);
	}
	
	//testing expandToInclude(Range, double) when value is equal to upper
	@Test 
	public void expandToIncludeWhenValueEqualToUpper() {
		range = new Range(0, 10);
		expandedRange = Range.expandToInclude(range, 10);
		Range expectedRange = new Range(0, 10);
		assertEquals(expandedRange, expectedRange);
	}
	
	@After
	public void tearDown() throws Exception {
		range = null;
		range1 = null;
		range2 = null;
		expandedRange = null;
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
