package easy;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.assertTrue;

public class Q108ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void sortedArrayToBST() {
        TreeNode expected = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{0,-10,5,null, -3, null, 9});

        assertTrue(TreeTestUtil.isTwoTreesSame(expected, Q108ConvertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[]{-10,-3,0,5,9})));
    }
}