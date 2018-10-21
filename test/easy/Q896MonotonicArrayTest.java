package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q896MonotonicArrayTest {

    @Test
    public void isMonotonic() {
        Assert.assertTrue(Q896MonotonicArray.isMonotonic(new int[]{1,2,2,3}));
        Assert.assertTrue(Q896MonotonicArray.isMonotonic(new int[]{6,5,4,4}));
        Assert.assertFalse(Q896MonotonicArray.isMonotonic(new int[]{1,3,2}));
        Assert.assertTrue(Q896MonotonicArray.isMonotonic(new int[]{1,2,4,5}));
        Assert.assertTrue(Q896MonotonicArray.isMonotonic(new int[]{1,1,1}));
    }
}