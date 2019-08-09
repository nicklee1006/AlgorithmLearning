package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q70ClimbingStairsTest {

    @Test
    public void climbStairs() {
        Assert.assertEquals(3, Q70ClimbingStairs.climbStairs(3));
        Assert.assertEquals(5, Q70ClimbingStairs.climbStairs(4));
        Assert.assertEquals(1134903170, Q70ClimbingStairs.climbStairs(44));
    }
}