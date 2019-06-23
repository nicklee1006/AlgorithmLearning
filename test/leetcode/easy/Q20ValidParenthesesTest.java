package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q20ValidParenthesesTest {

    @Test
    public void isValid() {
        Assert.assertEquals(true, Q20ValidParentheses.isValid("()[]{}"));
        Assert.assertEquals(false, Q20ValidParentheses.isValid("){"));
    }
}