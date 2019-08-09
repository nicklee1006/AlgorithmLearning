package leetcode.easy;

import leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 2018.5.22 Question 404. Sum of Left Leaves
 * https://leetcode.com/problems/sum-of-left-leaves/description/
 *
 * Find the sum of all left leaves in a given binary tree.
 *
 * Solution
 * 1. BFS
 */
public class Q404SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null && node.left.left == null && node.left.right == null) {
                result += node.left.val;
            }

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return result;
    }
}
