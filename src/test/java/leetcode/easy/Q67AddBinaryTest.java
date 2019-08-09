package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q67AddBinaryTest {

    @Test
    public void addBinary() {
        Assert.assertEquals("0", Q67AddBinary.addBinary("0", "0"));
        Assert.assertEquals("10", Q67AddBinary.addBinary("1", "1"));
        Assert.assertEquals("100", Q67AddBinary.addBinary("11", "1"));
        Assert.assertEquals("100000000000", Q67AddBinary.addBinary("11111111111", "1"));
    }
}