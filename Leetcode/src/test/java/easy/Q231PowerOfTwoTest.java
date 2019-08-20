package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q231PowerOfTwoTest {

    @Test
    public void isPowerOfTwo() {
        Assert.assertTrue(Q231PowerOfTwo.isPowerOfTwo(16));
        Assert.assertFalse(Q231PowerOfTwo.isPowerOfTwo(15));
    }
}