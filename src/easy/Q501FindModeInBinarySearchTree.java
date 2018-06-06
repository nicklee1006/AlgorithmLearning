package easy;

import util.TreeNode;

import java.util.*;

/**
 * 2018.6.6 Question 501. Find Mode in Binary Search Tree
 * https://leetcode.com/problems/find-mode-in-binary-search-tree/description/
 *
 * Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element)
 * in the given BST.
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than or equal to the node's key.
 * The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class Q501FindModeInBinarySearchTree {
    public int[] findMode(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        int max = 0;
        Map<Integer, Integer> count = new HashMap<>();

        if (root == null) {
            return new int[0];
        }

        // traverse all nodes
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            count.put(node.val, count.getOrDefault(node.val, 0) + 1);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }

        // find max value in map
        for (int temp : count.values()) {
            max = Math.max(max, temp);
        }

        // find all key with that max;
        List<Integer> results = new ArrayList<>();
        for (int key : count.keySet()) {
            if (count.get(key) == max) {
                results.add(key);
            }
        }

        int[] result = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
            result[i] = results.get(i);
        }

        return result;
    }
}
