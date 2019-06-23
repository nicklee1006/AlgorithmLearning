package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q367ValidPerfectSquareTest {

    @Test
    public void isPerfectSquare() {
        Assert.assertTrue(Q367ValidPerfectSquare.isPerfectSquare(16));
        Assert.assertFalse(Q367ValidPerfectSquare.isPerfectSquare(14));
        Assert.assertFalse(Q367ValidPerfectSquare.isPerfectSquare(808201));
    }
}