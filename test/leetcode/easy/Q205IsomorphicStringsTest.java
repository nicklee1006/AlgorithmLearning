package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q205IsomorphicStringsTest {

    @Test
    public void isIsomorphic() {
        Assert.assertTrue(Q205IsomorphicStrings.isIsomorphic("egg", "add"));
        Assert.assertFalse(Q205IsomorphicStrings.isIsomorphic("foo", "bar"));
        Assert.assertTrue(Q205IsomorphicStrings.isIsomorphic("paper", "title"));
    }
}