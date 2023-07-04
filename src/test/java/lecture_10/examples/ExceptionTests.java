package lecture_10.examples;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionTests {

    @Test(expectedExceptions = RuntimeException.class)
    public void testExceptions() {
        throw new RuntimeException("Pass");
    }

    @Test(expectedExceptions = {IOException.class, NullPointerException.class})
    public void testExceptions1() throws IOException{
        throw new RuntimeException("Pass");
    }
}
