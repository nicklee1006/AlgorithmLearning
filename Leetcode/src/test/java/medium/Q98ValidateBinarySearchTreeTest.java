package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.*;

public class Q98ValidateBinarySearchTreeTest {

    @Test
    public void isValidBST() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{2, 1, 3});
        TreeNode input2 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{5, 1, 4, null, null, 3, 6});
        TreeNode input3 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{10, 5, 15, null, null, 6, 20});
        TreeNode input4 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{});
        TreeNode input5 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{3, 1, 5, 0, 2, 4, 6, null, null, null, 3});

        assertTrue(Q98ValidateBinarySearchTree.isValidBST(input1));
        assertFalse(Q98ValidateBinarySearchTree.isValidBST(input2));
        assertFalse(Q98ValidateBinarySearchTree.isValidBST(input3));
        assertTrue(Q98ValidateBinarySearchTree.isValidBST(input4));
        assertFalse(Q98ValidateBinarySearchTree.isValidBST(input5));
    }
}