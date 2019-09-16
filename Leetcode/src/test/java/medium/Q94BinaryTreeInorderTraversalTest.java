package medium;

import org.junit.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Q94BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversal() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;

        List<Integer> expect = new ArrayList<>();
        expect.add(1);
        expect.add(3);
        expect.add(2);

        assertEquals(expect, Q94BinaryTreeInorderTraversal.inorderTraversal(treeNode1));
    }
}