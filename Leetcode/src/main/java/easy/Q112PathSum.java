package easy;

import util.TreeNode;

/**
 * 2018 4.13 Path Sum
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all
 * the values along the path equals the given sum.
 *
 * https://leetcode.com/problems/path-sum/description/
 *
 * Solution
 * 1. If reach leaf and sum = node.val, return true
 * 2. check left and right
 */
public class Q112PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        // reach leave node
        if (root.left == null && root.right == null && sum == root.val) {
            return true;
        }

        // check left tree and right tree
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
