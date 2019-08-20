package medium;

import org.junit.Assert;
import org.junit.Test;

public class Q5LongestPalindromicSubstringTest {

    @Test
    public void longestPalindrome() {
        Assert.assertEquals("bab", Q5LongestPalindromicSubstring.longestPalindrome("babad"));
        Assert.assertEquals("bb", Q5LongestPalindromicSubstring.longestPalindrome("cbbd"));
        Assert.assertEquals("a", Q5LongestPalindromicSubstring.longestPalindrome("a"));
        Assert.assertEquals("bb", Q5LongestPalindromicSubstring.longestPalindrome("bb"));
        Assert.assertEquals("ccc", Q5LongestPalindromicSubstring.longestPalindrome("ccc"));
    }
}