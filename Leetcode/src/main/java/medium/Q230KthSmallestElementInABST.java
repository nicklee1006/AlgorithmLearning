package medium;

import util.TreeNode;

public class Q230KthSmallestElementInABST {
    private static int num = 0;
    private static int res;

    public static int kthSmallest(TreeNode root, int k) {
        num = 0;

        inOrder(root, k);

        return res;
    }

    private static void inOrder(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        inOrder(node.left, k);

        num++;
        if (num == k) {
            res = node.val;
            return;
        }

        inOrder(node.right, k);
    }
}
