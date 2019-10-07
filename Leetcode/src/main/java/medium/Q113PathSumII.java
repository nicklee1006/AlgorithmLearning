package medium;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q113PathSumII {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> results = new ArrayList<>();

        if (root == null) {
            return results;
        }

        sum(root, sum, new ArrayList<>(), results);

        return results;
    }

    private static void sum(TreeNode root, int sum, List<Integer> temp, List<List<Integer>> results) {
        if (root == null) {
            return;
        }

        // reach leaf node
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                temp.add(root.val);

                results.add(new ArrayList<>(temp));

                temp.remove(temp.size() - 1);
            }

            return;
        }

        // check left tree
        temp.add(root.val);
        sum(root.left, sum - root.val, temp, results);
        temp.remove(temp.size() - 1);

        // check right tree
        temp.add(root.val);
        sum(root.right, sum - root.val, temp, results);
        temp.remove(temp.size() - 1);
    }
}
