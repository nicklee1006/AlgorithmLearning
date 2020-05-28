package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q300LongestIncreasingSubsequenceTest {

    @Test
    public void lengthOfLIS() {
        assertEquals(4, Q300LongestIncreasingSubsequence.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}