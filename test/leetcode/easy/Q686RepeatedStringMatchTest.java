package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q686RepeatedStringMatchTest {

    @Test
    public void repeatedStringMatch() {
//        Assert.assertEquals(3, Q686RepeatedStringMatch.repeatedStringMatch("abcd", "cdabcdab"));
//        Assert.assertEquals(4, Q686RepeatedStringMatch.repeatedStringMatch("bb", "bbbbbbb"));
        Assert.assertEquals(-1, Q686RepeatedStringMatch.repeatedStringMatch("abcabcabcabc", "abac"));
    }
}