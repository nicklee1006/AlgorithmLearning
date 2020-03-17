package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

public class Q236LowestCommonAncestorOfABinaryTreeTest {

    @Test
    public void lowestCommonAncestor() {
        TreeNode input = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{3,5,1,6,2,0,8,null,null,7,4});

        TreeNode expected2 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{5, 6, 2, null, null, 7, 4});

        TreeTestUtil.isTwoTreesSame(input, Q236LowestCommonAncestorOfABinaryTree.lowestCommonAncestor(input, new TreeNode(5), new TreeNode(1)));
        TreeTestUtil.isTwoTreesSame(expected2, Q236LowestCommonAncestorOfABinaryTree.lowestCommonAncestor(input, new TreeNode(5), new TreeNode(4)));
    }
}