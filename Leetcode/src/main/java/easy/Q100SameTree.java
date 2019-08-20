package easy;

import util.TreeNode;

/**
 * 2018.4.5: Same Tree
 * https://leetcode.com/problems/same-tree/description/
 *
 * Given two binary trees, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical and the nodes have the
 * same value.
 *
 * Solution
 * 1. if all null, true
 * 2. if only one null, false,
 * 3. recursive
 */
public class Q100SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return inorderTraversal(p, q);
    }

    private static boolean inorderTraversal(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        if (!inorderTraversal(p.left, q.left)) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        if (!inorderTraversal(p.right, q.right)) {
            return false;
        }

        return true;
    }

//    public static boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p == null && q == null) {
//            return true;
//        } else if (p == null || q == null) {
//            return false;
//        }
//
//        if (p.val == q.val) {
//            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//        }
//
//        return false;
//    }
}
