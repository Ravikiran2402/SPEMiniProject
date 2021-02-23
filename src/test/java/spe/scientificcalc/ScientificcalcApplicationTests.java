package spe.scientificcalc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScientificcalcApplicationTests {

    Calculator c = new Calculator();

    @Test
    public void testPower() {
        Assertions.assertEquals(125, c.power(5,3), 0);
    }

    @Test
    public void testFactorial() {
        Assertions.assertEquals(120, c.factorial(5), 0);
    }

    @Test
    public void testLog() {
        Assertions.assertEquals(2.63905732 , c.naturalLog(14), 0.1);
    }

    @Test
    public void testRoot() {
        Assertions.assertEquals(4, c.squareRoot(16), 0);
    }
}
