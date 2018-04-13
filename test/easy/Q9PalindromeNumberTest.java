package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q9PalindromeNumberTest {

    @Test
    public void isPalindrome() {
        Assert.assertEquals(false, Q9PalindromeNumber.isPalindrome(123));
        Assert.assertEquals(true, Q9PalindromeNumber.isPalindrome(12321));
    }
}