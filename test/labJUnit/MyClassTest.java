package labJUnit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void multiply() {
        MyClass tester = new MyClass();
        assertEquals("Result", 50, tester.multiply(10, 5));
    }
}