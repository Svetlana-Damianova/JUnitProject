package HW14;

import HW14.Calculator;
import org.junit.Test;

public class Subtraction extends Calculator {
    @Test
    public void substractionTest1(){

        System.out.println(subtract(10,6));
    }
    @Test
    public void substractionTest2(){

        System.out.println(subtract(15,5));
    }
    @Test
    public void substractionTest3(){

        System.out.println(subtract(20,12));
    }


}
