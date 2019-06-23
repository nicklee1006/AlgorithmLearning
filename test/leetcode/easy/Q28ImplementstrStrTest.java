package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q28ImplementstrStrTest {

    @Test
    public void strStr() {
        Assert.assertEquals(-1, Q28ImplementstrStr.strStr("aaabb", "baba"));
        Assert.assertEquals(2, Q28ImplementstrStr.strStr("hello", "ll"));
        Assert.assertEquals(0, Q28ImplementstrStr.strStr("", ""));
        Assert.assertEquals(-1, Q28ImplementstrStr.strStr("mississippi", "a"));
        Assert.assertEquals(0, Q28ImplementstrStr.strStr("a", "a"));
        Assert.assertEquals(0, Q28ImplementstrStr.strStr("aaa", "a"));
    }
}