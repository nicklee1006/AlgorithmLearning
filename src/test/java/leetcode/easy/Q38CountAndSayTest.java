package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q38CountAndSayTest {

    @Test
    public void countAndSay() {
        Assert.assertEquals("312211", Q38CountAndSay.countAndSay(6));
        Assert.assertEquals("13211311123113112211", Q38CountAndSay.countAndSay(10));
    }
}