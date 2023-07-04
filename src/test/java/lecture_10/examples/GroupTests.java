package lecture_10.examples;

import org.testng.annotations.Test;

public class GroupTests {
    @Test(groups = "smoke")
    public void testSmokeGroup1() {
        System.out.println("First test from smoke group");
    }

    @Test(groups = "smoke")
    public void testSmokeGroup2() {
        System.out.println("Second test from smoke group");
    }

    @Test
    public void testNoGroup() {
        System.out.println("This test does not belong to any group");
    }
}
