package leetcode.easy;

import leetcode.util.TreeNode;

/**
 * 2018.7.8 Question 783. Minimum Distance Between BST Nodes
 * https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/
 *
 * Given a Binary Search Tree (BST) with the root node root, return the minimum difference between
 * the values of any two different nodes in the tree.
 *
 * Solution
 * 1. in order traverse
 */
public class Q783MinimumDistanceBetweenBSTNodes {
    Integer result = Integer.MAX_VALUE;
    Integer pre = null;

    public int minDiffInBST(TreeNode root) {
        if (root.left != null) {
            minDiffInBST(root.left);
        }

        if (pre != null) {
            result = Math.min(result, root.val - pre);
        }

        pre = root.val;

        if (root.right != null) {
            minDiffInBST(root.right);
        }

        return result;
    }
}
