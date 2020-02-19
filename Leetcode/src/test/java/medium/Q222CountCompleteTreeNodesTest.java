package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.*;

public class Q222CountCompleteTreeNodesTest {

    @Test
    public void countNodes() {
        TreeNode testCase1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, 2, 3, 4, 5, 6});

        assertEquals(6, Q222CountCompleteTreeNodes.countNodes(testCase1));
    }
}