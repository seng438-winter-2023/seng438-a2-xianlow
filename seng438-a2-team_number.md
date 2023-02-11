**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      | 1    |
| -------------- | 
| Xian Wei Low |     
| Abdul Moeiz               |     
|                |     
|                |     

# 1 Introduction

Text…

# 2 Detailed description of unit test strategy

// including the input partitions you have designed

# 3 Test cases developed

Text…

// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

**Range Class**
 
**Range(double, double):**

* lowerShouldBeLessThanUpper()

  * test with lower > upper 
  
  * input: lower = 1, upper = -1

* boundsCanBeEqual()

  * test with lower = upper != 0
  
  * input: lower = 1, upper = 1

* boundsCanBeZero()

  * test with lower = upper = 0
  
  * input: lower = 0, upper = 0

* boundsCanBeDouble()

  * test with lower and upper bounds as doubles
  
  * input: lower = -1.1, upper = 1.1

**getLowerBound()**
* getNegativeLowerBound()

  * test with lower < 0
  
  * input: lower = -100, upper = 1000

* getZeroLowerBound()

  * test with lower = 0
  
  * input: lower = 0, upper = 1000

* getPositiveLowerBound()

  * test with lower > 0
  
  * input: lower = 100, upper = 1000

* getEqualLowerBound()

  * test with lower = upper 
  
  * input: lower = 101, upper = 101

**getUpperBound()**
* getNegativeUpperBound()

  * test with lower < 0
  
  * input: lower = -1000, upper = -100

* getZeroUpperBound()

  * test with lower = 0
  
  * input: lower = -1000, upper = 0

* getPositiveUpperBound()

  * test with lower > 0
  
  * input: lower = -1000, upper = 100

* getEqualUpperBound()

  * test with lower = upper 
  
  * input: lower = 101, upper = 101

**getLength()**
* getLengthWithBothBoundsNegative()

  * test with lower and upper being negative
  
  * input: lower = -20, upper = -10
* getLengthWithBothBoundsPositive()

  * test with lower and upper being positive
  
  * input: lower = 10, upper = 20

* getLengthWithBothBoundsEqual()

  * test with lower = upper
  
  * input: lower = 0, upper = 0

* getLengthWithNegativeLowerAndPositiveUpper()

  * test with lower < 0 and upper > 0
  
  * input: lower = -10, upper = 20

* getLengthWithZeroLowerAndPositiveUpper()

  * test with lower = 0 and upper > 0
  
  * input: lower = 0, upper = 20

* getLengthWithNegativeLowerAndZeroUpper()

  * test with lower < 0 and upper = 0
  
  * input: lower = -10, upper = 0

**getCentralValue()**
* getCentralValueWithNegativeLowerAndPositiveUpper()

  * test with lower < 0 and upper > 0
  
  * input: lower = -10, upper = 10

* getCentralValueWithBothBoundsNegative()

  * test with lower < 0 and upper < 0
  
  * input: lower = -20, upper = -10

* getCentralValueWithBothBoundsPositive()

  * test with lower > 0 and upper > 0
  
  * input: lower = 10, upper = 20

* getCentralValueWithZeroLowerAndPositiveUpper()

  * test with lower = 0 and upper > 0
  
  * input: lower = 0, upper = 20

* getCentralValueWithNegativeLowerAndZeroUpper()

  * test with lower < 0 and upper = 0
  
  * input: lower = -20, upper = 0

**equals(Object)**
* equalsWhenInputEqualToRange()

  * test with range = obj
  
  * input: range.lower = 0, range.upper = 10, obj.lower = 0, obj.upper = 10

* equalsWhenInputInequalToRangeAndInputLowerEqualToRangeLower()

  * test with range.lower = obj.lower and range.upper != obj.upper
  
  * input: range.lower = 0, range.upper = 10, obj.lower = 0, obj.upper = 20

* equalsWhenInputInequalToRangeAndInputLowerInequalToRangeLower()

  * test with range.lower != obj.lower and range.upper != obj.upper
  
  * input: range.lower = 0, range.upper = 10, obj.lower = 10, obj.upper = 20

**combine(Range, Range)**
* combineBothNull()

  * test with range1 = null and range2 = null
  
  * input: range1 = null, range2 = null

* combineFirstNull()

  * test with range1 = null and range2 != null
  
  * input: range1 = null, range2.lower = -10, range2.upper = 0

* combineFirstNull()

  * test with range1 != null and range2 = null
  
  * input: range1.lower = -10, range1.upper = 0, range2 = null

* combineBothEqual()

  * test with range1 = range2
  
  * input: range1.lower = -10, range1.upper = 0, range2.lower = -10, range2.upper = 0

* combineBothNotNullWithFirstRangeUpperEqualToSecondLower()

  * test with range1.upper = range2.lower
  
  * input: range1.lower = -10, range1.upper = 0, range2.lower = 0, range2.upper = 10

* combineBothNotNullWithFirstRangeUpperLessThanSecondLowerByOne()

  * test with range1.upper + 1 = range2.lower
  
  * input: range1.lower = -10, range1.upper = 0, range2.lower = 1, range2.upper = 10

* combineBothNotNullWithFirstRangeUpperLessThanSecondLowerByMoreThanOne

  * test with range2.lower - range1.upper > 1
  
  * input: range1.lower = -10, range1.upper = 0, range2.lower = 2, range2.upper = 10

* combineBothNotNullWithSecondRangeUpperEqualToFirstLower()

  * test with range1.lower = range2.upper
  
  * input: range1.lower = 0, range1.upper = 10, range2.lower = -10, range2.upper = 0

* combineBothNotNullWithSecondRangeUpperLessThanFirstLowerByOne()

  * test with range1.lower = range2.upper + 1
  
  * input: range1.lower = 1, range1.upper = 10, range2.lower = -10, range2.upper = 0

* combineBothNotNullWithSecondRangeUpperLessThanFirstLowerByMoreThanOne()

  * test with range1.lower - range2.upper > 1
  
  * input: range1.lower = 2, range1.upper = 10, range2.lower = -10, range2.upper = 0

**contains(double)**
All contains(double) test cases used range.lower = 0 and range.upper = 10

* containsBelowRange()

  * test with value - range.lower < -1
  
  * input: value = -10

* containsOneLessThanLowerBound()

  * test with value - range.lower = -1
  
  * input: value = -1


* containsLowerBound()

  * test with value = range.lower
  
  * input: value = 0

* containsWithinRange()

  * test with range.lower < value < range.upper
  
  * input: value = 5

* containsUpperBound()

  * test with value = range.upper
  
  * input: value = 10

* containsOneGreaterThanUpperBound()

  * test with value - range.upper = 1
  
  * input: value = 11

* containsAboveUpperBound()

  * test with value - range.lower > 1
  
  * input: value = 0

**intersects(double, double)**
All intersects(double, double) test cases used range.lower = 0 and range.upper = 10

* intersectWhenInputFullyLeft()

  * test with upper < range.lower
  
  * input: lower = -10, upper = -5

* intersectWhenInputUpperEqualToRangeLower()

  * test with upper = range.lower
  
  * input: lower = -10, upper = 0

* intersectWhenInputUpperWithinRange()

  * test with range.upper > upper > range.lower and lower < range.lower
  
  * input: lower = -10, upper = 5

* intersectWhenInputFullyInRange()

  * test with range.lower < lower < range.upper and range.lower < upper < range.upper
  
  * input: lower = 2, upper = 8

* intersectWhenInputLowerWithinRange()

  * test with range.lower < lower < range.upper and upper > range.upper
  
  * input: lower = 5, upper = 15

* intersectWhenInputLowerEqualToRangeUpper()

  * test with lower = range.upper
  
  * input: lower = 10, upper = 15

* intersectWhenInputFullyRight()

  * test with lower > range.upper
  
  * input: lower = 15, upper = 20

* intersectWhenRangeFullyInInput()

  * test with lower < range.lower < upper and lower < range.upper < upper
  
  * input: lower = -10, upper = 20

**constrain(double)**
All constrain(double) test cases used range.lower = 0 and range.upper = 10

* constrainWhenInputWithinRange()

  * test with range.lower < value < range.upper
  
  * input: value = 5

* constrainWhenInputEqualToLower()

  * test with value = range.lower
  
  * input: value = 0

* constrainWhenInputEqualToUpper()

  * test with value = range.upper
  
  * input: value = 10

* constrainWhenInputBelowRange()

  * test with value < range.lower
  
  * input: value = -10

* constrainWhenInputAboveRange()

  * test with value > range.upper
  
  * input: value = 20

**expandToInclude(Range, double)**

* expandToIncludeWhenRangeIsNull()

  * test with range = null
  
  * input: value = 5, range = null

* expandToIncludeWhenValueAlreadyWithinRange()

  * test with range != null and range.lower < value < range.upper
  
  * input: value = 5, range.lower = 0, range.upper = 10

* expandToIncludeWhenValueRightOfRange()

  * test with range != null and value > range.upper
  
  * input: value = 15, range.lower = 0, range.upper = 10

* expandToIncludeWhenValueLeftOfRange()

  * test with range != null and value < range.lower
  
  * input: value = -5, range.lower = 0, range.upper = 10

* expandToIncludeWhenValueEqualToLower()

  * test with range != null and value = range.lower
  
  * input: value = 0, range.lower = 0, range.upper = 10

* expandToIncludeWhenValueEqualToUpper()

  * test with range != null and value = range.upper
  
  * input: value = 10, range.lower = 0, range.upper = 10



# 4 How the team work/effort was divided and managed

Text...

# 5 Difficulties encountered, challenges overcome, and lessons learned

Text…

# 6 Comments/feedback on the lab itself

Text…
