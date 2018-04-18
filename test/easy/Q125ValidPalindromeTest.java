package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q125ValidPalindromeTest {

    @Test
    public void isPalindrome() {
//        Assert.assertTrue(Q125ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(Q125ValidPalindrome.isPalindrome("race a car"));
    }
}