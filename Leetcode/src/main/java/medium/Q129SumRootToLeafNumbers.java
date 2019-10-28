package medium;

import util.TreeNode;

public class Q129SumRootToLeafNumbers {
    static int result = 0;

    public static int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }

        dfs(root, root.val);

        return result;
    }

    private static void dfs(TreeNode node, int tempSum) {
        // reach leaf node
        if (node.left == null && node.right == null) {
            result += tempSum;
        }

        // try left tree
        if (node.left != null) {
            dfs(node.left, tempSum * 10 + node.left.val);
        }

        // try right tree
        if (node.right != null) {
            dfs(node.right, tempSum * 10 + node.right.val);
        }
    }
}
