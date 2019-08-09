package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q860LemonadeChangeTest {

    @Test
    public void lemonadeChange() {
        Assert.assertTrue(Q860LemonadeChange.lemonadeChange(new int[]{5,5,5,10,20}));
        Assert.assertTrue(Q860LemonadeChange.lemonadeChange(new int[]{5,5,10}));
        Assert.assertFalse(Q860LemonadeChange.lemonadeChange(new int[]{10,10}));
        Assert.assertFalse(Q860LemonadeChange.lemonadeChange(new int[]{5,5,10,10,20}));
    }
}