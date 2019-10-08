package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.*;

public class Q114FlattenBinaryTreeToLinkedListTest {

    @Test
    public void flatten() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, 2, 5, 3, 4, null, 6});

        TreeNode expected = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, null, 2, null, 3, null, 4, null, 5, null, 6});

        Q114FlattenBinaryTreeToLinkedList.flatten(input1);
        assertTrue(TreeTestUtil.isTwoTreesSame(expected, input1));
    }
}