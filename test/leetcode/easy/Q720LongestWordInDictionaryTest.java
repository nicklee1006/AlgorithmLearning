package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q720LongestWordInDictionaryTest {

    @Test
    public void longestWord() {
        Assert.assertEquals("world", Q720LongestWordInDictionary.longestWord(new String[]{"w","wo","wor","worl", "world"}));
        Assert.assertEquals("apple", Q720LongestWordInDictionary.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
    }
}