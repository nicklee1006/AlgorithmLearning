package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q211AddAndSearchWordTest {
    @Test
    public void testTrie() {
        Q211AddAndSearchWord obj = new Q211AddAndSearchWord();

        obj.addWord("bad");
        obj.addWord("dad");
        obj.addWord("mad");

        assertFalse(obj.search("pad"));
        assertTrue(obj.search("bad"));
        assertTrue(obj.search(".ad"));
        assertTrue(obj.search("b.."));
    }
}