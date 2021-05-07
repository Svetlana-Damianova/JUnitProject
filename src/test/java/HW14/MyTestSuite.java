package HW14;

import HW14.Collection;
import HW14.Division;
import HW14.Multiplication;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)

@Suite.SuiteClasses({
        Collection.class,
        Subtraction.class,
        Multiplication.class,
        Division.class,
        ParameterizedTests.class})

public class MyTestSuite {


}

