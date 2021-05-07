package HW14;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class AssertTest extends Calculator {

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();


    @Test
    public void assertTestEquals() {
        int a = 5;
        int b = 5;


        try {

            Assert.assertEquals("Chek numbers: ", a, b);

        } catch (Throwable throwable) {
            errorCollector.addError(new RuntimeException("added Runtime Exception"));

        }
    }

    @Test
    public void assertTestTrue() {

        int a = 2;
        int b = 6;

        try {

            Assert.assertTrue(a == b);
        } catch (Throwable throwable) {

            errorCollector.addError(new Exception("The condition is false."));
        }

    }

    @Test
    public void assertTestNotNull() {
        int a = 20;
        int b = 12;
        try {

            Assert.assertNotNull(a - b);
        } catch (Throwable throwable) {

            errorCollector.addError(new NullPointerException("Null Pointer Exception"));
        }
    }


}
