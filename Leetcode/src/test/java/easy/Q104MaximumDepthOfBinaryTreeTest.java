package easy;

import org.junit.Assert;
import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

public class Q104MaximumDepthOfBinaryTreeTest {

    @Test
    public void maxDepth() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{3, 9, 20, null, null, 15, 7});

        Assert.assertEquals(3, Q104MaximumDepthOfBinaryTree.maxDepth(input1));
    }
}