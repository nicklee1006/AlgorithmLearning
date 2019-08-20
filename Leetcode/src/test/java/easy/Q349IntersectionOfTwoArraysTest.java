package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q349IntersectionOfTwoArraysTest {

    @Test
    public void intersection() {
        Assert.assertArrayEquals(new int[]{2}, Q349IntersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }
}