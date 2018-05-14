package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q290WordPatternTest {

    @Test
    public void wordPattern() {
        Assert.assertTrue(Q290WordPattern.wordPattern("abba", "dog cat cat dog"));
        Assert.assertFalse(Q290WordPattern.wordPattern("abba", "dog cat cat fish"));
        Assert.assertFalse(Q290WordPattern.wordPattern("aaaa", "dog cat cat dog"));
        Assert.assertFalse(Q290WordPattern.wordPattern("abba", "dog dog dog dog"));

    }
}