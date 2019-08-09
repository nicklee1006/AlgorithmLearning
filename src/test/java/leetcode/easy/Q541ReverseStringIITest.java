package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q541ReverseStringIITest {

    @Test
    public void reverseStr() {
        Assert.assertEquals("bacdfeg", Q541ReverseStringII.reverseStr("abcdefg", 2));
    }
}