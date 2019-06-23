package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q819MostCommonWordTest {

    @Test
    public void mostCommonWord() {
        Assert.assertEquals("ball", Q819MostCommonWord.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }
}