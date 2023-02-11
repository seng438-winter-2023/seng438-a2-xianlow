**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group 1:      |
| -------------- |
| Xian Wei Low |
| Abdul Moeiz               | 
| Akashdeep Singh               |
|                | 

# 1 Introduction

Within this lab, we will be using the knowledge gained from class of JUnit to test out JFreeChart. Our objective is to focus on making 10 total JUnit test cases for the Range class and DataUtilities class. There are a total of 15 tests in Range class and only 5 for DataUtilties so we will be choosing 5 out of the 15 in Range class. The goal for this lab is to get used to JUnit testing and using mocking whenever to get desired values so we can test specfic functions without relying on other functions. 

# 2 Detailed description of unit test strategy

Our test strategy is to firstly, choose whichever functions we wanted for range. Once we get those functions, we will look over the javadocs given to us to review what each functions needs to work. If they require other functions to work, we will be using mocking so we can bypass any errors that those other functions may have. If no functions are needed, then values will be hard coded by the developer to test the functionality of the function in question. This means that if only a double value is needed, we will feed the value straight into the function itself. Once the test case is developed, we check if the test case has failed or not by running as a JUnit test case.

# 3 Test cases developed

Text…

// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

**DataUtilites Class**
* calculateColumnTotalForTwoValuesTest
  * setUp()
   * Use mocking for rowCount, row1, and row2
  * calculateColumnTotalForTwoValues()
   * Input: rowCount = 2, row1 = 10.5, row2 = 5.5
   * Test if it equals 16

* calculateRowForTwoValuesTest
  * setUp()
   * Use mocking for columnCount, column1, and column2
  * calculateRowForTwoValues()
   * Input: columnCount = 2, column1 = 10.5, column2 = 5.5
   * Test if it equals 16
   
* createNumberArrayTest
  * setUp()
   * Use to setup for realVals Number array
  * createNumberArray()
   * Input: realVals[0] = 1.0, realVals[1] = 2.0, realVals[2] = 3.0, realVals[3] = 4.0
   *        values[0] = 1.0, values[1] = 2.0, values[2] = 3.0, values[3] = 4.0
   * values will be a double array to be passed onto the createNumberArray in DataUtilities class.
   * Test if the two arrays have the same values 
   
* createNumberArray2DTest
  * setUp()
   * Use to setup for realVals Number array
  * create2DNumberArray()
   * Input: realVals[0][0] = 1.0, realVals[0][1] = 2.0, realVals[0][2] = 3.0, realVals[0][3] = 4.0,
            realVals[1][0] = 5.0, realVals[1][1] = 6.0, realVals[1][2] = 7.0, realVals[1][3] = 8.0
            values[0][0] = 1.0, values[0][1] = 2.0, values[0][2] = 3.0, values[0][3] = 4.0,
            values[1][0] = 5.0, values[1][1] = 6.0, values[1][2] = 7.0, values[1][3] = 8.0
   * values will be a double array to be passed onto the createNumberArray2D in DataUtilities class.
   * Test if the two arrays have the same values 

* getCumulativePercentagesTest
  * setUp()
   * Use to setup for testValues as a DefaultKeyedValues
  * getCumulativePercentages()
   * Input: testValues will have three values inside. key 0 will hold 5.0, key 1 will hold 9.0 and key 2 will hold 2.0.
   * testValues will be a DefaultKeyedValues and will be passed into getCumulativePercentages that is located inside the DataUtilities class.
   * Test if the values are correct. More specifically, first assert will check if the formula (5 / 16) = 0.3125 occured. Next assert will check if ((5 + 9) / 16) =        0.875 occured. Last assert will check if ((5 + 9) / 16) = 1.0 has occured.
   
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

In our team, we evenly spread the functions out to each member and worked on the test cases individually. Then we save our progress inside the Github and checked each others work at the end. Xian and Akashdeep tested on **DataUtilities** class functions, whereas Abdul and Cale tested on **Range** class. After each subgroup compared each others test files, we re-tested and checked the other group's test files, to ensure thorough testing was performed.

# 5 Difficulties encountered, challenges overcome, and lessons learned

During the familiarization step we found setting up **eclipse** to be a smooth process. While eclipse is a great IDE for itself the style of making import was not quite natural and intuitive compared to other popular editors or IDE, such as VScode. One issue faced that made the process of committing less flawless is how saving files imported to a _workspace_ in eclipse does not save them to the original location it was imported from. We did indeed look up on the documentation but we later deciced to manually copy paste the files to the original place, before commiting. While it is true that we could have also commited the workspace on the repository, we do not think that is a good idea as some search paths of files and folders depende on each user's device.

Although, committing the test files to the root of the repository and manually pulling and importing them to eclipse, still made the overall teamwork managable. The lesson we learned is how we can still mantain teamwork by following simple rules, even if there are complications in using a different framework.

# 6 Comments/feedback on the lab itself

The lab description was indeed detailed and did not have any ambiguities. However, we felt it excessively descriptive and detailed. Step by step instructions take over too much content and either a gif file or separate link would have been better. However, since the lab was sectioned and structured very well we were still able to jump between contents with little effort, on the second and next iterations of readings.

The example samples of **Junit** and **Jmock** provided were great! It allowed to quickly comprehend the setup and usage of eclipse. This allowed all of our team members to have understood the bigger picture after reading the lab description.
