package leetcode.easy;

import leetcode.util.TreeNode;

/**
 * 2018.6.13 Question 563. Binary Tree Tilt
 * https://leetcode.com/problems/binary-tree-tilt/description/
 *
 * Given a binary tree, return the tilt of the whole tree.
 *
 * The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node
 * values and the sum of all right subtree node values. Null node has tilt 0.
 *
 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
 *
 * Solution
 * Can't understand*******
 */
public class Q563BinaryTreeTilt {
    int result = 0;

    public int findTilt(TreeNode root) {
        postOrder(root);

        return result;
    }

    private int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = postOrder(root.left);
        int right = postOrder(root.right);

        result += Math.abs(left - right);

        return left + right + root.val;
    }
}
