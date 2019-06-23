package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q1TwoSumTest {
    private int[] nums = {2, 7, 11, 15};
    private int target = 9;

    @Test
    public void twoSum() {
        int[] result = Q1TwoSum.twoSum(nums, target);

        Assert.assertArrayEquals(new int[]{0, 1}, result);

    }

    @Test
    public void twoSum2() {
        int[] result2 = Q1TwoSum.twoSum2(nums, target);

        Assert.assertArrayEquals(new int[]{0, 1}, result2);
    }
}