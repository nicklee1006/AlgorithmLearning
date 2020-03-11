package easy;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

public class Q235LowestCommonAncestorOfABinarySearchTreeTest {

    @Test
    public void lowestCommonAncestor() {
        TreeNode input = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});

        TreeNode expected2 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{2, 0, 4, null, null, 3, 5});

        TreeTestUtil.isTwoTreesSame(input, Q235LowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(input, new TreeNode(2), new TreeNode(8)));
        TreeTestUtil.isTwoTreesSame(expected2, Q235LowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(input, new TreeNode(2), new TreeNode(4)));
    }
}