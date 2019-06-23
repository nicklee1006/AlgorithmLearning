package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q674LongestContinuousIncreasingSubsequenceTest {

    @Test
    public void findLengthOfLCIS() {
        Assert.assertEquals(3, Q674LongestContinuousIncreasingSubsequence.findLengthOfLCIS(new int[]{1,3,5,4,7}));
        Assert.assertEquals(1, Q674LongestContinuousIncreasingSubsequence.findLengthOfLCIS(new int[]{2,2,2,2,2}));
    }
}