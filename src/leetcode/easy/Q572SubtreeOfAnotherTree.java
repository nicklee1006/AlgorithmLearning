package leetcode.easy;

import leetcode.util.TreeNode;

/**
 * 2018.6.14 Question 572. Subtree of Another Tree
 * https://leetcode.com/problems/subtree-of-another-tree/description/
 *
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node
 * values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's
 * descendants. The tree s could also be considered as a subtree of itself.
 *
 * Solution
 * 1. Don't understand
 */
public class Q572SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }

        if (isSame(s, t)) {
            return true;
        }

        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }

        if (s == null || t == null) {
            return false;
        }

        if (s.val != t.val) {
            return false;
        }

        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
}
