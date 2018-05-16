package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q342PowerOfFourTest {

    @Test
    public void isPowerOfFour() {
        Assert.assertTrue(Q342PowerOfFour.isPowerOfFour(16));
        Assert.assertFalse(Q342PowerOfFour.isPowerOfFour(5));

    }
}