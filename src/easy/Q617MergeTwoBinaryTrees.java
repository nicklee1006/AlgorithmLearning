package easy;

import util.TreeNode;

/**
 * 2018.6.17 Question 617. Merge Two Binary Trees
 * https://leetcode.com/problems/merge-two-binary-trees/description/
 * <p>
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the
 * two trees are overlapped while the others are not.
 * <p>
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node
 * values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of
 * new tree.
 *
 * Solution
 * 1. Recursive
 */
public class Q617MergeTwoBinaryTrees {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        int newVal = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode newNode = new TreeNode(newVal);

        newNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        newNode.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);

        return newNode;
    }
}
