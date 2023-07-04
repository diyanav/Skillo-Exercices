package lecture_10.examples;

import org.testng.annotations.*;

public class ATestNGLifeCycleTests {
    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("before suite");
    }

    @BeforeTest
    public void testBeforeTest() {
        System.out.println("before test");
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("before class");
    }

    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("before method");
    }

    @Test
    public void testName() {
        System.out.println("in test method");
    }

    @Test
    public void testName1() {
        System.out.println("in test method1");
    }

    @AfterMethod
    public void testAfterMethod() {
        System.out.println("after method");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("after class");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("after test");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("after suite");
    }
}
