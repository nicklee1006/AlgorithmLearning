package easy;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.assertTrue;

public class Q112PathSumTest {

    @Test
    public void hasPathSum() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1});

        assertTrue(Q112PathSum.hasPathSum(input1, 22));
    }
}