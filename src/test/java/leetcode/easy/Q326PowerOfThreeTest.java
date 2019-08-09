package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q326PowerOfThreeTest {

    @Test
    public void isPowerOfThree() {
        Assert.assertTrue(Q326PowerOfThree.isPowerOfThree(9));
        Assert.assertFalse(Q326PowerOfThree.isPowerOfThree(10));
    }
}