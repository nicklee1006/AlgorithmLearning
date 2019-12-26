package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q1TwoSumTest {
    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = Q1TwoSum.twoSum2(nums, target);

        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }
}