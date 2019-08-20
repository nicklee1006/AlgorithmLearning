package easy;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

public class Q100SameTreeTest {

    @Test
    public void isSameTree() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode4.left = treeNode5;
        treeNode4.right = treeNode6;

        Assert.assertTrue(Q100SameTree.isSameTree(treeNode1, treeNode4));
    }
}