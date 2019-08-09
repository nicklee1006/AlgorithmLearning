package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q693BinaryNumberWithAlternatingBitsTest {

    @Test
    public void hasAlternatingBits() {
        Assert.assertTrue(Q693BinaryNumberWithAlternatingBits.hasAlternatingBits(5));
        Assert.assertTrue(Q693BinaryNumberWithAlternatingBits.hasAlternatingBits(10));
        Assert.assertFalse(Q693BinaryNumberWithAlternatingBits.hasAlternatingBits(7));
        Assert.assertFalse(Q693BinaryNumberWithAlternatingBits.hasAlternatingBits(11));

    }
}