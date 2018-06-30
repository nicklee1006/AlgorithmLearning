package easy;

import util.TreeNode;

/**
 * 2018.6.30 Question 687. Longest Univalue Path
 * https://leetcode.com/problems/longest-univalue-path/description/
 *
 * Given a binary tree, find the length of the longest path where each node in the path has the same
 * value. This path may or may not pass through the root.
 *
 * Note: The length of path between two nodes is represented by the number of edges between them.
 */
public class Q687LongestUnivaluePath {
    int length = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }

        getLen(root, root.val);

        return length;
    }

    private int getLen(TreeNode node, int val) {
        if (node == null) {
            return 0;
        }

        int left = getLen(node.left, node.val);
        int right = getLen(node.right, node.val);

        length = Math.max(length, left + right);

        if (val == node.val) {
            return Math.max(left, right) + 1;
        }

        return 0;
    }
}
