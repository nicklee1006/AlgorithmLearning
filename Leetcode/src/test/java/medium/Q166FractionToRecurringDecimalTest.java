package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q166FractionToRecurringDecimalTest {

    @Test
    public void fractionToDecimal() {
        assertEquals("0.5", Q166FractionToRecurringDecimal.fractionToDecimal(1, 2));
        assertEquals("2", Q166FractionToRecurringDecimal.fractionToDecimal(2, 1));
        assertEquals("0.(6)", Q166FractionToRecurringDecimal.fractionToDecimal(2, 3));
    }
}