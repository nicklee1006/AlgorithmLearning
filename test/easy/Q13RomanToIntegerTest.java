package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q13RomanToIntegerTest {

    @Test
    public void romanToInt() {
        Assert.assertEquals(1776, Q13RomanToInteger.romanToInt("MDCCLXXVI"));
        Assert.assertEquals(2014, Q13RomanToInteger.romanToInt("MMXIV"));
    }
}