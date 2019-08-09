package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q884UncommonWordsFromTwoSentencesTest {

    @Test
    public void uncommonFromSentences() {
        Assert.assertArrayEquals(new String[]{"sweet","sour"}, Q884UncommonWordsFromTwoSentences.uncommonFromSentences("this apple is sweet", "this apple is sour"));
        Assert.assertArrayEquals(new String[]{"banana"}, Q884UncommonWordsFromTwoSentences.uncommonFromSentences("apple apple", "banana"));
    }
}