package medium;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q94BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            // node is not null, push to stack
            // push left first
            while (current != null) {
                stack.push(current);

                current = current.left;
            }

            // node is null, pop
            current = stack.pop();

            // add to result
            result.add(current.val);

            // consider right tree
            current = current.right;
        }

        return result;
    }


//    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//
//        getAnswer(root, result);
//
//        return result;
//    }

    // standard way to traverse tree inorder. Recursive
//    private static void getAnswer(TreeNode node, List<Integer> result) {
//        if (node == null) {
//            return;
//        }
//
//        getAnswer(node.left, result);
//        result.add(node.val);
//        getAnswer(node.right, result);
//    }
}
