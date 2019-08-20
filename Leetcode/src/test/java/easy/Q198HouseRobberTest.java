package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q198HouseRobberTest {

    @Test
    public void rob() {
        Assert.assertEquals(4, Q198HouseRobber.rob(new int[]{1, 2, 3, 1}));
        Assert.assertEquals(12, Q198HouseRobber.rob(new int[]{2, 7, 9, 3, 1}));
    }
}