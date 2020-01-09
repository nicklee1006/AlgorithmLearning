package easy;

import org.junit.Assert;
import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

public class Q100SameTreeTest {

    @Test
    public void isSameTree() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, 2, 3});
        TreeNode input2 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, 2, 3});
        TreeNode input3 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, 2});
        TreeNode input4 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, null, 2});
        TreeNode input5 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, 2, 1});
        TreeNode input6 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, 1, 2});

        Assert.assertTrue(Q100SameTree.isSameTree(input1, input2));
        Assert.assertFalse(Q100SameTree.isSameTree(input3, input4));
        Assert.assertFalse(Q100SameTree.isSameTree(input5, input6));
    }
}