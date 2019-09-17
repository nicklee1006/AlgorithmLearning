package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Q94BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversal() {
        TreeNode root = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, null, 2, 3});

        List<Integer> expect = new ArrayList<>();
        expect.add(1);
        expect.add(3);
        expect.add(2);

        assertEquals(expect, Q94BinaryTreeInorderTraversal.inorderTraversal(root));
    }
}