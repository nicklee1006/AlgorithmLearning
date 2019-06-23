package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q645SetMismatchTest {

    @Test
    public void findErrorNums() {
        Assert.assertArrayEquals(new int[]{2,3}, Q645SetMismatch.findErrorNums(new int[]{1,2,2,4}));
    }
}