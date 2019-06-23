package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q350IntersectionOfTwoArraysIITest {

    @Test
    public void intersect() {
//        Assert.assertArrayEquals(new int[]{2, 2}, Q350IntersectionOfTwoArraysII.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        Assert.assertArrayEquals(new int[]{1}, Q350IntersectionOfTwoArraysII.intersect(new int[]{1}, new int[]{1}));
    }
}