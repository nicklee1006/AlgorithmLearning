package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q796RotateStringTest {

    @Test
    public void rotateString() {
        Assert.assertTrue(Q796RotateString.rotateString("abcde", "cdeab"));
        Assert.assertFalse(Q796RotateString.rotateString("abcde", "abced"));
    }
}