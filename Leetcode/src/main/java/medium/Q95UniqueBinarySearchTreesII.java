package medium;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class Q95UniqueBinarySearchTreesII {
    public static List<TreeNode> generateTrees(int n) {
        List<TreeNode> results = new ArrayList<>();

        if (n == 0) {
            return results;
        }

        return getResults(1, n);
    }

    // recursive
    private static List<TreeNode> getResults(int start, int end) {
        List<TreeNode> results = new ArrayList<>();

        if (start > end) {
            results.add(null);

            return results;
        }

        if (start == end) {
            TreeNode node = new TreeNode(start);
            results.add(node);

            return results;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftNodes = getResults(start, i - 1);
            List<TreeNode> rightNodes = getResults(i + 1, end);

            for (TreeNode leftNode : leftNodes) {
                for (TreeNode rightNode : rightNodes) {
                    TreeNode root = new TreeNode(i);

                    root.left = leftNode;
                    root.right = rightNode;

                    results.add(root);
                }
            }
        }

        return results;
    }
}
