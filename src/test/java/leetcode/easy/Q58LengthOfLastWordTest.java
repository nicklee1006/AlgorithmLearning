package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q58LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord() {
        Assert.assertEquals(5, Q58LengthOfLastWord.lengthOfLastWord("Hello World"));
        Assert.assertEquals(0, Q58LengthOfLastWord.lengthOfLastWord(""));
        Assert.assertEquals(3, Q58LengthOfLastWord.lengthOfLastWord("ABC"));
    }
}