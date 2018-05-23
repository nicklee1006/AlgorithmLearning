package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q409LongestPalindromeTest {

    @Test
    public void longestPalindrome() {
        Assert.assertEquals(7, Q409LongestPalindrome.longestPalindrome("abccccdd"));
        Assert.assertEquals(3, Q409LongestPalindrome.longestPalindrome("ccc"));
        Assert.assertEquals(2, Q409LongestPalindrome.longestPalindrome("bb"));


    }
}