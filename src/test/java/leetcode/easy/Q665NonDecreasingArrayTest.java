package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q665NonDecreasingArrayTest {

    @Test
    public void checkPossibility() {
        Assert.assertTrue(Q665NonDecreasingArray.checkPossibility(new int[]{4,2,3}));
        Assert.assertFalse(Q665NonDecreasingArray.checkPossibility(new int[]{4,2,1}));

    }
}