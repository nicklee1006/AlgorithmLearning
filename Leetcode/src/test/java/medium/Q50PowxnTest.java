package medium;

import org.junit.Assert;
import org.junit.Test;

public class Q50PowxnTest {

    @Test
    public void myPow() {
        Assert.assertEquals(1024.00000, Q50Powxn.myPow(2.00000, 10), 0.01);
        Assert.assertEquals(9.26100, Q50Powxn.myPow(2.10000, 3), 0.01);
        Assert.assertEquals(0.25000, Q50Powxn.myPow(2.00000, -2), 0.01);
        Assert.assertEquals(0, Q50Powxn.myPow(0.00001, 2147483647), 0.01);
    }
}