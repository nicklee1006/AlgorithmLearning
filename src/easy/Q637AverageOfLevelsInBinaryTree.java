package easy;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 2018.6.20 Question 637. Average of Levels in Binary Tree
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
 *
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 *
 * Note:
 * The range of node's value is in the range of 32-bit signed integer.
 */
public class Q637AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> results = new ArrayList<>();

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);

        while (!treeNodeQueue.isEmpty()) {
            int levelSize = treeNodeQueue.size();
            double total = 0.0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = treeNodeQueue.poll();
                total += temp.val;

                if (temp.left != null) {
                    treeNodeQueue.add(temp.left);
                }

                if (temp.right != null) {
                    treeNodeQueue.add(temp.right);
                }
            }

            results.add(total / levelSize);
        }

        return results;
    }
}
