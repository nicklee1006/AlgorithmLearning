package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q3LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        Assert.assertEquals(3, Q3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, Q3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, Q3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(0, Q3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
        Assert.assertEquals(1, Q3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("a"));
        Assert.assertEquals(2, Q3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("ab"));
        Assert.assertEquals(5, Q3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("tmmzuxt"));
    }
}