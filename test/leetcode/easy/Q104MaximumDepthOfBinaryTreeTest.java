package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;
import leetcode.util.TreeNode;

public class Q104MaximumDepthOfBinaryTreeTest {

    @Test
    public void maxDepth() {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        Assert.assertEquals(3, Q104MaximumDepthOfBinaryTree.maxDepth(treeNode1));
    }
}