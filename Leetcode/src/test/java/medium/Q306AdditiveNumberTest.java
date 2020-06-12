package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q306AdditiveNumberTest {

    @Test
    public void isAdditiveNumber() {
        assertTrue(Q306AdditiveNumber.isAdditiveNumber("112358"));
        assertTrue(Q306AdditiveNumber.isAdditiveNumber("199100199"));
        assertTrue(Q306AdditiveNumber.isAdditiveNumber("101"));
    }
}