package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q217ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {
        Assert.assertTrue(Q217ContainsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        Assert.assertFalse(Q217ContainsDuplicate.containsDuplicate(new int[]{1,2,3,4}));
    }
}