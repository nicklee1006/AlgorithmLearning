package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q11ContainerWithMostWaterTest {

    @Test
    public void maxArea() {
        Assert.assertEquals(49, Q11ContainerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        Assert.assertEquals(4, Q11ContainerWithMostWater.maxArea(new int[]{5, 4}));
    }
}