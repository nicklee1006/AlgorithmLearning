package easy;

import util.TreeNode;

/**
 * 2018.10.23 Question 897. Increasing Order Search Tree
 * https://leetcode.com/problems/increasing-order-search-tree/description/
 *
 * Given a tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree,
 * and every node has no left child and only 1 right child.
 */
public class Q897IncreasingOrderSearchTree {
    private TreeNode prev = null;
    private TreeNode head = null;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        increasingBST(root.left);

        if (prev != null) {
            prev.right = root;
        }

        if (head == null) {
            head = root;
        }

        prev = root;
        prev.left = null;

        increasingBST(root.right);

        return head;
    }
}
