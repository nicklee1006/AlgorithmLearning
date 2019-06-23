package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q520DetectCapitalTest {

    @Test
    public void detectCapitalUse() {
        Assert.assertTrue(Q520DetectCapital.detectCapitalUse("USA"));
        Assert.assertFalse(Q520DetectCapital.detectCapitalUse("FLaG"));
        Assert.assertTrue(Q520DetectCapital.detectCapitalUse("ggg"));
    }
}