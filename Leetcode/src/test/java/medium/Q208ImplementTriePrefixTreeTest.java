package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q208ImplementTriePrefixTreeTest {
    @Test
    public void testFunctions() {
        Q208ImplementTriePrefixTree trie = new Q208ImplementTriePrefixTree();

        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));

        trie.insert("app");
        assertTrue(trie.search("app"));
    }
}