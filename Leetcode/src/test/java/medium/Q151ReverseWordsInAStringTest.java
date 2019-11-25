package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q151ReverseWordsInAStringTest {

    @Test
    public void reverseWords() {
        assertEquals("blue is sky the", Q151ReverseWordsInAString.reverseWords("the sky is blue"));
        assertEquals("world! hello", Q151ReverseWordsInAString.reverseWords("  hello world!  "));
        assertEquals("example good a", Q151ReverseWordsInAString.reverseWords("a good   example"));
    }
}