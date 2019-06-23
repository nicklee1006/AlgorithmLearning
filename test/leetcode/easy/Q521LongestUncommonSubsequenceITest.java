package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q521LongestUncommonSubsequenceITest {

    @Test
    public void findLUSlength() {
        Assert.assertEquals(3, Q521LongestUncommonSubsequenceI.findLUSlength("abc", "cdc"));
    }
}