package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q387FirstUniqueCharacterInAStringTest {

    @Test
    public void firstUniqChar() {
        Assert.assertEquals(0, Q387FirstUniqueCharacterInAString.firstUniqChar("leetcode"));
        Assert.assertEquals(2, Q387FirstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
    }
}