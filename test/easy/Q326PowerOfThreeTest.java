package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q326PowerOfThreeTest {

    @Test
    public void isPowerOfThree() {
        Assert.assertTrue(Q326PowerOfThree.isPowerOfThree(9));
        Assert.assertFalse(Q326PowerOfThree.isPowerOfThree(10));
    }
}