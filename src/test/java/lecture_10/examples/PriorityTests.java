package lecture_10.examples;

import org.testng.annotations.Test;

public class PriorityTests {

    @Test(priority = 0)
    public void priorityTest1() {
        System.out.println("This is the first priority test");
    }

    @Test(priority = -1)
    public void priorityTest2() {
        System.out.println("This is the second priority test");
    }
}
