package easy;

import util.TreeNode;

/**
 * 2018.6.25 Question 671. Second Minimum Node In a Binary Tree
 * https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/description/
 *
 * Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node
 * in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is
 * the smaller value among its two sub-nodes.
 *
 * Given such a binary tree, you need to output the second minimum value in the set made of all the nodes'
 * value in the whole tree.
 *
 * If no such second minimum value exists, output -1 instead.
 *
 * Solution
 * 1.
 */
public class Q671SecondMinimumNodeInABinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int left = (root.left != null && root.left.val != root.val) ? root.left.val : findSecondMinimumValue(root.left);
        int right = (root.right != null && root.right.val != root.val) ? root.right.val : findSecondMinimumValue(root.right);

        if (left == -1 || right == -1) {
            return Math.max(left, right);
        }

        return Math.min(left, right);
    }
}
