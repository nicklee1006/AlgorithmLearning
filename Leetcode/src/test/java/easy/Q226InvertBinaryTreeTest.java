package easy;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.assertTrue;

public class Q226InvertBinaryTreeTest {

    @Test
    public void invertTree() {
        TreeNode testCase1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        TreeNode expected1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{4, 7, 2, 9, 6, 3, 1});

        assertTrue(TreeTestUtil.isTwoTreesSame(Q226InvertBinaryTree.invertTree(testCase1), expected1));
    }
}