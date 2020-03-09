package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.*;

public class Q230KthSmallestElementInABSTTest {

    @Test
    public void kthSmallest() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{3, 1, 4, null, 2});
        TreeNode input2 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{5,3,6,2,4,null,null,1});

        assertEquals(1, Q230KthSmallestElementInABST.kthSmallest(input1, 1));
        assertEquals(3, Q230KthSmallestElementInABST.kthSmallest(input2, 3));
    }
}
