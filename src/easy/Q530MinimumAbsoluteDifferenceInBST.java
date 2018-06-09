package easy;

import util.TreeNode;

/**
 * 2018.6.9 Question 530. Minimum Absolute Difference in BST
 * https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
 *
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
 */
public class Q530MinimumAbsoluteDifferenceInBST {
    int min = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return min;
        }

        getMinimumDifference(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;

        getMinimumDifference(root.right);

        return min;
    }
}
