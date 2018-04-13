package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q7ReverseIntegerTest {

    @Test
    public void reverse() {
        Assert.assertEquals(321, Q7ReverseInteger.reverse(123));
        Assert.assertEquals(-321,Q7ReverseInteger.reverse(-123));
        Assert.assertEquals(21,Q7ReverseInteger.reverse(120));
    }
}