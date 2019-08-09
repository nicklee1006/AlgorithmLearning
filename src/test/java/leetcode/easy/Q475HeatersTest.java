package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q475HeatersTest {

    @Test
    public void findRadius() {
        Assert.assertEquals(1, Q475Heaters.findRadius(new int[]{1,2,3}, new int[]{2}));
        Assert.assertEquals(1, Q475Heaters.findRadius(new int[]{1,2,3,4}, new int[]{1,4}));
        Assert.assertEquals(2, Q475Heaters.findRadius(new int[]{1,2,3,4,5,6}, new int[]{1,6}));
        Assert.assertEquals(9, Q475Heaters.findRadius(new int[]{1,5}, new int[]{10}));

    }
}