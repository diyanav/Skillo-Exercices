package lecture_10.exercises;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exercises {

    @DataProvider(name = "generateAdditionNumbers")
    public Object[][] generateAdditionNumbers(){
        return new Object[][]{
                {5, 5, 10},
                {17, -9, 8},
                {-46, -10, -56}
        };
    }

    @Test(dataProvider = "generateAdditionNumbers", groups = "addition")
    public void testAddition(int a, int b, int expectedSum){
        int sum = a + b;
        Assert.assertEquals(expectedSum, sum);
    }

    @DataProvider(name = "generateSubtractionNumbers")
    public Object[][] generateSubtractionNumbers(){
        return new Object[][]{
                {45, 5, 40},
                {27, -3, 30},
                {6, 11, -5}
        };
    }

    @Test(dataProvider = "generateSubtractionNumbers", groups = "subtraction")
    public void testSubtraction(int a, int b, int expectedSubtraction){
        int subtraction = a - b;
        Assert.assertEquals(expectedSubtraction, subtraction);
    }

    @DataProvider(name = "generateMultiplicationNumbers")
    public Object[][] generateMultiplicationNumbers(){
        return new Object[][]{
                {45, 5, 225},
                {27, -3, -81},
                {66, 1, 66}
        };
    }

    @Test(dataProvider = "generateMultiplicationNumbers", groups = "multiplication")
    public void testMultiplication(int a, int b, int expectedMultiplication){
        int multiplication = a * b;
        Assert.assertEquals(expectedMultiplication, multiplication);
    }

    @DataProvider(name = "generateDivisionNumbers")
    public Object[][] generateDivisionNumbers(){
        return new Object[][]{
                {45, 5, 9},
                {27, -3, -9},
                {66, 1,66}
        };
    }

    @Test(dataProvider = "generateDivisionNumbers", groups = "division")
    public void testDivision(int a, int b, int expectedDivision){
        int division = a / b;
        Assert.assertEquals(expectedDivision, division);
    }

    @DataProvider(name = "generatePercentageDivisionNumbers")
    public Object[][] generatePercentageDivisionNumbers(){
        return new Object[][]{
                {45, 5, 0},
                {27, 4, 3},
                {64, 3, 1}
        };
    }

    @Test(dataProvider = "generatePercentageDivisionNumbers", groups = "percentageDivision")
    public void testPercentageDivision(int a, int b, int expectedPercentageDivision){
        int percentageDivision = a % b;
        Assert.assertEquals(expectedPercentageDivision, percentageDivision);
    }
}
