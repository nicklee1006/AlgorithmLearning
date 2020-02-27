package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q227BasicCalculatorIITest {

    @Test
    public void calculate() {
        assertEquals(7, Q227BasicCalculatorII.calculate("3+2*2"));
        assertEquals(1, Q227BasicCalculatorII.calculate(" 3/2 "));
        assertEquals(5, Q227BasicCalculatorII.calculate(" 3+5 / 2 "));
    }
}