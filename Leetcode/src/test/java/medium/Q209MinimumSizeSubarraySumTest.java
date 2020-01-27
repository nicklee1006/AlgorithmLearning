package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q209MinimumSizeSubarraySumTest {
    @Test
    public void minSubArrayLen() {
        assertEquals(2, Q209MinimumSizeSubarraySum.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}