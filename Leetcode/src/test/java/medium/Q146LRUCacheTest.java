package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q146LRUCacheTest {
    @Test
    public void testLRUCache() {
        Q146LRUCache cache = new Q146LRUCache( 2 /* capacity */ );

        cache.put(1, 1);
        cache.put(2, 2);

        assertEquals(1, cache.get(1));  // returns 1

        cache.put(3, 3);    // evicts key 2

        assertEquals(-1, cache.get(2));       // returns -1 (not found)

        cache.put(4, 4);    // evicts key 1

        assertEquals(-1, cache.get(1));       // returns -1 (not found)
        assertEquals(3, cache.get(3));       // returns 3
        assertEquals(4, cache.get(4));       // returns 4
    }
}