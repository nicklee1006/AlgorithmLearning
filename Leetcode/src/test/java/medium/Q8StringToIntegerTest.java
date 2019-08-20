package medium;

import medium.Q8StringToInteger;
import org.junit.Assert;
import org.junit.Test;

public class Q8StringToIntegerTest {
    @Test
    public void myAtoi() {
        Assert.assertEquals(42, Q8StringToInteger.myAtoi("42"));
        Assert.assertEquals(-42, Q8StringToInteger.myAtoi("   -42"));
        Assert.assertEquals(0, Q8StringToInteger.myAtoi("words and 987"));
        Assert.assertEquals(2147483647, Q8StringToInteger.myAtoi("2147483648"));
        Assert.assertEquals(321, Q8StringToInteger.myAtoi("321 31"));
        Assert.assertEquals(-2147483648, Q8StringToInteger.myAtoi("-91283472332"));
    }
}