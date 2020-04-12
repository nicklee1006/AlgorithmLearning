package medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Q284PeekingIteratorTest {
    @Test
    public void testMethods() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Q284PeekingIterator iterator = new Q284PeekingIterator(list.iterator());

        assertEquals(1, (int)iterator.next());
        assertEquals(2, (int)iterator.peek());
        assertEquals(2, (int)iterator.next());
        assertEquals(3, (int)iterator.next());
        assertFalse(iterator.hasNext());
    }
}