package easy;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Question 226. Invert Binary Tree
 * https://leetcode.com/problems/invert-binary-tree/description/
 *
 * Invert a binary tree.
 *
 * Solution
 * 1. BFS, using Queue
 * 2. Sway the left and right child
 */
public class Q226InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            // swap the left and right child
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            // push to queue
            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return root;
    }
}
