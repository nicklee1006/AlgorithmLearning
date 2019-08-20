package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q680ValidPalindromeIITest {

    @Test
    public void validPalindrome() {
        Assert.assertTrue(Q680ValidPalindromeII.validPalindrome("aba"));
        Assert.assertTrue(Q680ValidPalindromeII.validPalindrome("abca"));
    }
}