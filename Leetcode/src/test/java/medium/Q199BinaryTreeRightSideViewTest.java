package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Q199BinaryTreeRightSideViewTest {

    @Test
    public void rightSideView() {
        TreeNode root1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1,2,3,null,5,null,4});
        TreeNode root2 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1,2,3,4});

        assertArrayEquals(new int[]{1, 3, 4}, Q199BinaryTreeRightSideView.rightSideView(root1).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[]{1, 3, 4}, Q199BinaryTreeRightSideView.rightSideView(root2).stream().mapToInt(Integer::intValue).toArray());
    }
}