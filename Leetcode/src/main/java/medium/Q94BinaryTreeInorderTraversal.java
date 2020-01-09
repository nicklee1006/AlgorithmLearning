package medium;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q94BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        getAnswer(root, result);

        return result;
    }

    // standard way to traverse tree inorder. Recursive
    private static void getAnswer(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        getAnswer(node.left, result);
        result.add(node.val);
        getAnswer(node.right, result);
    }
}
