package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q9PalindromeNumberTest {

    @Test
    public void isPalindrome() {
        Assert.assertFalse(Q9PalindromeNumber.isPalindrome(123));
        Assert.assertTrue(Q9PalindromeNumber.isPalindrome(12321));
        Assert.assertFalse(Q9PalindromeNumber.isPalindrome(-121));
    }
}