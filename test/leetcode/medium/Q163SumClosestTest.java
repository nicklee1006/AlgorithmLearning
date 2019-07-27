package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q163SumClosestTest {

    @Test
    public void threeSumClosest() {
        Assert.assertEquals(2, Q163SumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        Assert.assertEquals(13, Q163SumClosest.threeSumClosest(new int[]{1, 2, 5, 10, 11}, 12));

    }
}