package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q14LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        String[] testCase = {"test123", "test1", "test111"};
        Assert.assertEquals("test1", Q14LongestCommonPrefix.longestCommonPrefix(testCase));
    }
}