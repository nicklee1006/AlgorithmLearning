package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q201BitwiseANDofNumbersRangeTest {

    @Test
    public void rangeBitwiseAnd() {
        assertEquals(4, Q201BitwiseANDofNumbersRange.rangeBitwiseAnd(5, 7));
        assertEquals(0, Q201BitwiseANDofNumbersRange.rangeBitwiseAnd(0, 1));
        assertEquals(2147483646, Q201BitwiseANDofNumbersRange.rangeBitwiseAnd(2147483646, 2147483647));

    }
}