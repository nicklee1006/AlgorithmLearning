package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q696CountBinarySubstringsTest {

    @Test
    public void countBinarySubstrings() {
        Assert.assertEquals(6, Q696CountBinarySubstrings.countBinarySubstrings("00110011"));
        Assert.assertEquals(4, Q696CountBinarySubstrings.countBinarySubstrings("10101"));
    }
}