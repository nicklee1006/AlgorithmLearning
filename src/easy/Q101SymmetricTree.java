package easy;

import util.TreeNode;

/**
 * 2018.4.6 Symmetric Tree
 * https://leetcode.com/problems/symmetric-tree/description/
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */
public class Q101SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null || left.val != right.val) {
            return false;
        }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
