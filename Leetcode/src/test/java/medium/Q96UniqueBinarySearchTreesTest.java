package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q96UniqueBinarySearchTreesTest {

    @Test
    public void numTrees() {
        assertEquals(5, Q96UniqueBinarySearchTrees.numTrees(3));
        assertEquals(14, Q96UniqueBinarySearchTrees.numTrees(4));
        assertEquals(132, Q96UniqueBinarySearchTrees.numTrees(6));
    }
}