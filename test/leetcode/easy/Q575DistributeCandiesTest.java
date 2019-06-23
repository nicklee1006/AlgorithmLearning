package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q575DistributeCandiesTest {

    @Test
    public void distributeCandies() {
        Assert.assertEquals(3, Q575DistributeCandies.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        Assert.assertEquals(2, Q575DistributeCandies.distributeCandies(new int[]{1, 1, 2, 3}));
    }
}