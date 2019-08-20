package easy;

import java.util.HashSet;
import java.util.Set;
import util.TreeNode;

/**
 * 2018.6.22 Question 653. Two Sum IV - Input is a BST
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
 *
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST
 * such that their sum is equal to the given target.
 *
 * Solution
 * 1. Use set to add met node's value
 * 2. check if set contains k - node.val
 */
public class Q653TwoSumIVInputIsABST {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> numbers = new HashSet<>();

        return dfs(root, numbers, k);
    }

    private boolean dfs(TreeNode node, Set set, int k) {
        if (node == null) {
            return false;
        }

        if (set.contains(k - node.val)) {
            return true;
        }

        set.add(node.val);

        return dfs(node.left, set, k) || dfs(node.right, set, k);
    }
}
