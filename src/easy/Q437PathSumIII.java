package easy;

import util.TreeNode;

/**
 * 2018.5.26 Question 437. Path Sum III
 * https://leetcode.com/problems/path-sum-iii/description/
 * <p>
 * You are given a binary tree in which each node contains an integer value.
 * Find the number of paths that sum to a given value.
 * The path does not need to start or end at the root or a leaf, but it must go downwards (traveling
 * only from parent nodes to child nodes).
 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
 * <p>
 * hint:
 * https://leetcode.com/problems/path-sum-iii/discuss/91889/Simple-Java-DFS
 */
public class Q437PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathSumFrom(TreeNode start, int sum) {
        if (start == null) {
            return 0;
        }

        return (start.val == sum ? 1 : 0) + pathSumFrom(start.left, sum - start.val)
                + pathSumFrom(start.right, sum - start.val);
    }
}
