package spe.scientificcalc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScientificcalcApplicationTests {

    Calculator c = new Calculator();

    @Test
    public void testPower_truePos() {
        Assertions.assertEquals(125, c.power(5,3), 0);
    }

    @Test
    public void testFactorial_truePos() {
        Assertions.assertEquals(120, c.factorial(5), 0);
    }

    @Test
    public void testLog_truePos() {
        Assertions.assertEquals(2.63905732 , c.naturalLog(14), 0.1);
    }

    @Test
    public void testRoot_truePos() {
        Assertions.assertEquals(4, c.squareRoot(16), 0);
    }

    @Test
    public void testPower_trueNeg() {
        Assertions.assertNotEquals(126, c.power(5,3), 0);
    }

    @Test
    public void testFactorial_trueNeg() {
        Assertions.assertNotEquals(140, c.factorial(5), 0);
    }

    @Test
    public void testLog_trueNeg() {
        Assertions.assertNotEquals(2.63905732 , c.naturalLog(15), 0.1);
    }

    @Test
    public void testRoot_trueNeg() {
        Assertions.assertNotEquals(4, c.squareRoot(17), 0);
    }
}
