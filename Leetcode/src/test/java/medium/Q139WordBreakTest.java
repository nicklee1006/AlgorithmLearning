package medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Q139WordBreakTest {

    @Test
    public void wordBreak() {
        assertTrue(Q139WordBreak.wordBreak("leetcode", Arrays.asList("leet", "code")));
        assertTrue(Q139WordBreak.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        assertFalse(Q139WordBreak.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }
}