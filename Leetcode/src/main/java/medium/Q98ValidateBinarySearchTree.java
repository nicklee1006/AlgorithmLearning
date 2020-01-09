package medium;

import util.TreeNode;

public class Q98ValidateBinarySearchTree {
    public static boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    // every number has a valid range
    // For node on left tree: (min of parent node, value of parent node)
    // For node on right tree: (value of parent node, max of parent node)
    private static boolean isValid(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if (min != null && node.val <= min) {
            return false;
        }

        if (max != null && node.val >= max) {
            return false;
        }

        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }
}
