package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.*;

public class Q105ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @Test
    public void buildTree() {
        TreeNode expected = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{3, 9, 20, null, null, 15, 7});

        assertTrue(TreeTestUtil.isTwoTreesSame(expected, Q105ConstructBinaryTreeFromPreorderAndInorderTraversal.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7})));
    }
}