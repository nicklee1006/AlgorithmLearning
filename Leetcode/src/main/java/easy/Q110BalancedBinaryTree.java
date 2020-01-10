package easy;

import util.TreeNode;

/**
 * 2018.4.10 Balanced Binary Tree
 * https://leetcode.com/problems/balanced-binary-tree/description/
 *
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Solution
 * 1. helper function, get depth, recursive
 * 2. recursive check depth of left and right
 */
public class Q110BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        // check depth difference
        if (Math.abs(depth(root.left) - depth(root.right)) > 1) {
            return false;
        }

        // check left and right tree are balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }

    // find depth of the tree
    private static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}
