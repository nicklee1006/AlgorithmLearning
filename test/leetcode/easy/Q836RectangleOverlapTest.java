package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q836RectangleOverlapTest {

    @Test
    public void isRectangleOverlap() {
        Assert.assertTrue(Q836RectangleOverlap.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}));
        Assert.assertFalse(Q836RectangleOverlap.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}));
    }
}