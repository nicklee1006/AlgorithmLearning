package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q238ProductOfArrayExceptSelfTest {

    @Test
    public void productExceptSelf() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, Q238ProductOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));
    }
}