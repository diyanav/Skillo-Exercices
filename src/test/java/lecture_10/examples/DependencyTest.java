package lecture_10.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

    @Test(dependsOnGroups = "group.dependency")
    public void testDependsOnGroup(){
        System.out.println("This method depends on group.dependency");
    }

    @Test(groups = "group.dependency")
    public void testGroupDependency() {
        System.out.println("This is a test part of group.dependency");
    }

    @Test(groups = "group.dependency")
    public void testGroupDependency1() {
        System.out.println("This is a test part of group.dependency1");
    }

    @Test(dependsOnMethods = "testMethodDependency", alwaysRun = true)
    public void testDependsOnMethod() {
        System.out.println("This is a test depends on testMethodDependency");
    }

    @Test
    public void testMethodDependency() {
        Assert.assertTrue(false);
        System.out.println("This is a test dependency method");
    }
}
