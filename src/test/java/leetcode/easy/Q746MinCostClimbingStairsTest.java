package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q746MinCostClimbingStairsTest {

    @Test
    public void minCostClimbingStairs() {
        Assert.assertEquals(15, Q746MinCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
        Assert.assertEquals(6, Q746MinCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}