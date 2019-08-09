package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q345ReverseVowelsOfAStringTest {

    @Test
    public void reverseVowels() {
        Assert.assertEquals("holle", Q345ReverseVowelsOfAString.reverseVowels("hello"));
        Assert.assertEquals("leotcede", Q345ReverseVowelsOfAString.reverseVowels("leetcode"));

    }
}