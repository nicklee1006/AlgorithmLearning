package medium;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class Q144BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        helper(root, result);

        return result;
    }

    private static void helper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);
        helper(root.left, result);
        helper(root.right, result);
    }
}
