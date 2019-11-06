package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.*;

public class Q144BinaryTreePreorderTraversalTest {

    @Test
    public void preorderTraversal() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, null, 2, 3});

        assertArrayEquals(new Integer[]{1, 2, 3}, Q144BinaryTreePreorderTraversal.preorderTraversal(input1).toArray());
    }
}