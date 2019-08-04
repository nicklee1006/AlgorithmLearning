package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q29DivideTwoIntegersTest {

    @Test
    public void divide() {
        Assert.assertEquals(3, Q29DivideTwoIntegers.divide(10, 3));
        Assert.assertEquals(-2, Q29DivideTwoIntegers.divide(7, -3));
        Assert.assertEquals(2147483647, Q29DivideTwoIntegers.divide(-2147483648, -1));
        Assert.assertEquals(1073741823, Q29DivideTwoIntegers.divide(2147483647, 2));
    }
}