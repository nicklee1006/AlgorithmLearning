package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q43MultiplyStringsTest {

    @Test
    public void multiply() {
        Assert.assertEquals("6", Q43MultiplyStrings.multiply("2", "3"));
        Assert.assertEquals("56088", Q43MultiplyStrings.multiply("123", "456"));
        Assert.assertEquals("81", Q43MultiplyStrings.multiply("9", "9"));
    }
}