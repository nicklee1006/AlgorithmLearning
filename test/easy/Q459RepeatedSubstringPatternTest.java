package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q459RepeatedSubstringPatternTest {

    @Test
    public void repeatedSubstringPattern() {
        Assert.assertTrue(Q459RepeatedSubstringPattern.repeatedSubstringPattern("abab"));
        Assert.assertFalse(Q459RepeatedSubstringPattern.repeatedSubstringPattern("aba"));
        Assert.assertTrue(Q459RepeatedSubstringPattern.repeatedSubstringPattern("abcabcabcabc"));
    }
}