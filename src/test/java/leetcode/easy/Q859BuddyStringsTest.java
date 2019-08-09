package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q859BuddyStringsTest {

    @Test
    public void buddyStrings() {
        Assert.assertTrue(Q859BuddyStrings.buddyStrings("ab", "ba"));
        Assert.assertFalse(Q859BuddyStrings.buddyStrings("ab", "ab"));
        Assert.assertTrue(Q859BuddyStrings.buddyStrings("aa", "aa"));
        Assert.assertTrue(Q859BuddyStrings.buddyStrings("aaaaaaabc", "aaaaaaacb"));
        Assert.assertFalse(Q859BuddyStrings.buddyStrings("", "aa"));
    }
}