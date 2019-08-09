package leetcode.easy;

import leetcode.util.TreeNode;

/**
 * 2018.6.25 Question 669. Trim a Binary Search Tree
 * https://leetcode.com/problems/trim-a-binary-search-tree/description/
 *
 * Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that
 * all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result
 * should return the new root of the trimmed binary search tree.
 *
 * Solution
 * 1. Don't understand!!!!
 */
public class Q669TrimABinarySearchTree {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }

        if (root.val < L) {
            return trimBST(root.right, L, R);
        }

        if (root.val > R) {
            return trimBST(root.left, L, R);
        }

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);

        return root;
    }
}
