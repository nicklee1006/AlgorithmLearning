package leetcode.easy;

import leetcode.util.TreeNode;

/**
 * 2018.4.12 Minimum Depth of Binary Tree
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 *
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the
 * nearest leaf node.
 *
 * Solution
 * 1. Recursive, check left and right
 * 2. If left = 0, return 1+right
 * 3. If right = 0, return 1+left
 * 4. Else, return min(left, right)
 */
public class Q111MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (leftDepth == 0) {
            return 1 + rightDepth;
        } else if (rightDepth == 0) {
            return 1 + leftDepth;
        } else {
            return 1 + Math.min(leftDepth, rightDepth);
        }
    }
}
