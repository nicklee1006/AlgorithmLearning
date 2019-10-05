package medium;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import testutil.TreeTestUtil;
import util.ListNode;
import util.TreeNode;

public class Q109ConvertSortedListToBinarySearchTreeTest {

    @Test
    public void sortedListToBST() {
        ListNode input1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{-10,-3,0,5,9});
        TreeNode expected = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{0,-3,9,-10,null,5});

        TreeTestUtil.isTwoTreesSame(expected, Q109ConvertSortedListToBinarySearchTree.sortedListToBST(input1));
    }
}