package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q263UglyNumberTest {

    @Test
    public void isUgly() {
        Assert.assertTrue(Q263UglyNumber.isUgly(6));
        Assert.assertTrue(Q263UglyNumber.isUgly(8));
        Assert.assertFalse(Q263UglyNumber.isUgly(14));
    }
}