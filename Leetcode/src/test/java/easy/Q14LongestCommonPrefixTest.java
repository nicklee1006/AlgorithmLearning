package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q14LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        String[] testCase = {"test123", "test1", "test111"};
        Assert.assertEquals("test1", Q14LongestCommonPrefix.longestCommonPrefix(testCase));

        String[] testCase2 = {"flower", "flow", "flight"};
        Assert.assertEquals("fl", Q14LongestCommonPrefix.longestCommonPrefix(testCase2));

        String[] testCase3 = {"dog","racecar","car"};
        Assert.assertEquals("", Q14LongestCommonPrefix.longestCommonPrefix(testCase3));
    }
}