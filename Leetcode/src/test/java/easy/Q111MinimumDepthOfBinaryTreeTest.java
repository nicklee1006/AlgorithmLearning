package easy;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.assertEquals;

public class Q111MinimumDepthOfBinaryTreeTest {

    @Test
    public void minDepth() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{3,9,20,null,null,15,7});
        TreeNode input2 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{-9,-3,2,null,4,4,0,-6,null,-5});

        assertEquals(2, Q111MinimumDepthOfBinaryTree.minDepth(input1));
        assertEquals(3, Q111MinimumDepthOfBinaryTree.minDepth(input2));
    }
}