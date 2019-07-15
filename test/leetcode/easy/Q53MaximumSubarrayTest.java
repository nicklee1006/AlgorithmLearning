package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q53MaximumSubarrayTest {

    @Test
    public void maxSubArray() {
        Assert.assertEquals(6 ,Q53MaximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        Assert.assertEquals(1 ,Q53MaximumSubarray.maxSubArray(new int[]{1}));

    }
}