package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q20ValidParenthesesTest {

    @Test
    public void isValid() {
        Assert.assertTrue(Q20ValidParentheses.isValid(""));
        Assert.assertTrue(Q20ValidParentheses.isValid("()[]{}"));
        Assert.assertFalse(Q20ValidParentheses.isValid("){"));
        Assert.assertFalse(Q20ValidParentheses.isValid("()[]{[]})"));
    }
}