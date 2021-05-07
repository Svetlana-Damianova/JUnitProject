package HW14;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTests {

    int firstNum;
    int secondNum;
    int result;

    public ParameterizedTests(int firstNum, int secondNum, int result) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> collection() {
        return Arrays.asList(new Object[][]{
                {1, 2, 3},
                {3, 7, 10},
                {19, 11, 30},
                {333, 100, 433},
                {23, 25, 48}
        });
    }

    @Test
    public void collectionSum() {

        assertEquals(String.format(" %d + %d = %d", firstNum, secondNum, result), firstNum + secondNum, result);
    }


    @Parameterized.Parameters
    public static Collection<Object[]> substraction() {
        return Arrays.asList(new Object[][]{
                {10, 2, 8},
                {15, 5, 10},
                {52, 22, 30},
                {8, 7, 1},
                {44, 4, 40}
        });
    }

    @Test
    public void substractionSum() {

        assertEquals(String.format(" %d - %d = %d", firstNum, secondNum, result), firstNum + secondNum, result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> multiplication() {
        return Arrays.asList(new Object[][]{
                {5, 2, 10},
                {5, 5, 25},
                {4, 3, 12},
                {10, 10, 100},
                {44, 4, 176}
        });
    }

    @Test
    public void multiplicationSum() {

        assertEquals(String.format(" %d * %d = %d", firstNum, secondNum, result), firstNum + secondNum, result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> division() {
        return Arrays.asList(new Object[][]{
                {10, 2, 5},
                {25, 5, 5},
                {12, 3, 4},
                {100, 10, 10},
                {14, 2, 7}
        });
    }

    @Test
    public void divisionSum() {

        assertEquals(String.format(" %d * %d = %d", firstNum, secondNum, result), firstNum + secondNum, result);
    }


}
