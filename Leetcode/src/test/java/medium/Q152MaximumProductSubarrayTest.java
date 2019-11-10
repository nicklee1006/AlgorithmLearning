package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q152MaximumProductSubarrayTest {

    @Test
    public void maxProduct() {
        assertEquals(6, Q152MaximumProductSubarray.maxProduct(new int[]{2,3,-2,4}));
        assertEquals(0, Q152MaximumProductSubarray.maxProduct(new int[]{-2, 0, -1}));
        assertEquals(12, Q152MaximumProductSubarray.maxProduct(new int[]{-4, -3, -2}));
    }
}