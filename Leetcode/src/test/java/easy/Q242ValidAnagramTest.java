package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q242ValidAnagramTest {

    @Test
    public void isAnagram() {
        Assert.assertTrue(Q242ValidAnagram.isAnagram("anagram", "nagaram"));
        Assert.assertFalse(Q242ValidAnagram.isAnagram("rat", "cat"));
    }
}