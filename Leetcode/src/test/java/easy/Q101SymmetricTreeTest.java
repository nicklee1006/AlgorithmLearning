package easy;

import org.junit.Assert;
import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

public class Q101SymmetricTreeTest {

    @Test
    public void isSymmetric() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1,2,2,3,4,4,3});
        TreeNode input2 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1,2,2,null,3,null,3});

        Assert.assertTrue(Q101SymmetricTree.isSymmetric(input1));
        Assert.assertFalse(Q101SymmetricTree.isSymmetric(input2));
    }
}