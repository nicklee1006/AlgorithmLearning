package easy;

import java.util.ArrayList;
import java.util.List;
import util.TreeNode;

/**
 * 2018.5.11 Question 257. Binary Tree Paths
 * https://leetcode.com/problems/binary-tree-paths/description/
 *
 * Given a binary tree, return all root-to-leaf paths.
 *
 * Solution
 * 1. DFS
 */
public class Q257BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> results = new ArrayList<>();

        if (root != null) {
            DFS(root, "", results);
        }

        return results;
    }

    private static void DFS(TreeNode root, String path, List<String> results) {
        if (root.left == null && root.right == null) {
            results.add(path + root.val);
        }

        if (root.left != null) {
            DFS(root.left, path + root.val + "->", results);
        }

        if (root.right != null) {
            DFS(root.right, path + root.val + "->", results);
        }
    }
}
