package easy;

import util.TreeNode;

/**
 * 2018.7.22 Question 872. Leaf-Similar Trees
 * https://leetcode.com/problems/leaf-similar-trees/description/
 *
 * Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a
 * leaf value sequence.
 *
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 *
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 *
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 */
public class Q872LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder root1Leaves = new StringBuilder();
        StringBuilder root2Leaves=new StringBuilder();

        traverse(root1,root1Leaves);
        traverse(root2,root2Leaves);

        return root1Leaves.toString().equals(root2Leaves.toString());
    }

    void traverse(TreeNode root, StringBuilder leaves) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leaves.append(root.val).append("-");
        }

        traverse(root.left, leaves);
        traverse(root.right, leaves);
    }
}
