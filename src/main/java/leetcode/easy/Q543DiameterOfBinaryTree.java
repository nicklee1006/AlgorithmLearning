package leetcode.easy;

import leetcode.util.TreeNode;

/**
 * 2018.6.11 Question 543. Diameter of Binary Tree
 * https://leetcode.com/problems/diameter-of-binary-tree/description/
 *
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a
 * binary tree is the length of the longest path between any two nodes in a tree. This path may or may
 * not pass through the root.
 *
 * Solution
 * 1. Find the max depth???
 * Not understand****
 */
public class Q543DiameterOfBinaryTree {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);

        return max;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }
}
