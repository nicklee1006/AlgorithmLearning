package easy;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.assertTrue;

public class Q110BalancedBinaryTreeTest {

    @Test
    public void isBalanced() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{3,9,20,null,null,15,7});
        TreeNode input2 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1,2,2,3,3,null,null,4,4});

        assertTrue(Q110BalancedBinaryTree.isBalanced(input1));
        assertTrue(Q110BalancedBinaryTree.isBalanced(input2));
    }
}