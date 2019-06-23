package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q69SqrtXTest {

    @Test
    public void mySqrt() {
        Assert.assertEquals(2, Q69SqrtX.mySqrt(4));
        Assert.assertEquals(2, Q69SqrtX.mySqrt(8));
        Assert.assertEquals(46340, Q69SqrtX.mySqrt(2147395600));

    }
}