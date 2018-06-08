package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q521LongestUncommonSubsequenceITest {

    @Test
    public void findLUSlength() {
        Assert.assertEquals(3, Q521LongestUncommonSubsequenceI.findLUSlength("abc", "cdc"));
    }
}