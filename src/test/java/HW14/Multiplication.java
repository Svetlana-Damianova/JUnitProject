package HW14;

import HW14.Calculator;
import org.junit.Test;

public class Multiplication extends Calculator {

    @Test
    public void multiplicationTest1(){

        System.out.println(multiply(2,6));
    }

    @Test
    public void multiplicationTest2(){

        System.out.println(multiply(4,3));
    }

    @Test
    public void multiplicationTest3(){

        System.out.println(multiply(7,2));
    }

}
