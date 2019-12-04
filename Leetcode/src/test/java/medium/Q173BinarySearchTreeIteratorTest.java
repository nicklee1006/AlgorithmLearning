package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.*;

public class Q173BinarySearchTreeIteratorTest {
    @Test
    public void testBinarySearchTreeIterator() {
        TreeNode root = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{7, 3, 15, null, null, 9, 20});

        Q173BinarySearchTreeIterator iterator = new Q173BinarySearchTreeIterator(root);

        assertEquals(3, iterator.next());
        assertEquals(7, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(9, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(15, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(20, iterator.next());
        assertFalse(iterator.hasNext());
    }
}