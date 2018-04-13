package easy;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 2018.4.8  Binary Tree Level Order Traversal II
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
 *
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 */
public class Q107BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (queue.size() > 0) {
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();

                temp.add(treeNode.val);

                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }

                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }

            result.add(0, temp);
        }

        return result;
    }
}
