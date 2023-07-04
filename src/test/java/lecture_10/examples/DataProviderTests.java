package lecture_10.examples;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTests {

    @DataProvider(name = "generateValues")
    public Object[][] generateValues() {
        System.out.println("Generate values");

        return new Object[][] {
                {"First-Value"},
                {"Second-Value"},
        };
    }

    @Test(dataProvider = "generateValues")
    public void testDataProvider(String value) {
        System.out.println("Passed Parameter value is: " + value);
    }

    @DataProvider(name = "generateNumbers")
    public Object[][] generateNumbers() {
        System.out.println("Generate numbers");
            return new Object[][] {
                {2, 3, 5},
                {5, 7, 9}
            };
    }

    @Test(dataProvider = "generateNumbers")
    public void testDataProviderMultipleParameter(int a, int b, int expectedSum) {
        int sum = a + b;
        Assert.assertEquals(expectedSum, sum);
    }
}
