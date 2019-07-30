package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class Q16ThreeSumClosestTest {

    @Test
    public void threeSumClosest() {
        Assert.assertEquals(2, Q16ThreeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        Assert.assertEquals(13, Q16ThreeSumClosest.threeSumClosest(new int[]{1, 2, 5, 10, 11}, 12));

    }
}