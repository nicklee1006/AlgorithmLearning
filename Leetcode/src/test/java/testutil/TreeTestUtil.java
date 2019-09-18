package testutil;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTestUtil {
    public static TreeNode createBinaryTreeFromArray(Integer[] tree) {
        if (tree.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(tree[0]);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean isLeft = true;
        for (int i = 1; i < tree.length; i++) {
            TreeNode node = queue.peek();

            if (isLeft) {
                isLeft = false;

                if (tree[i] != null) {
                    node.left = new TreeNode(tree[i]);
                    queue.add(node.left);
                }
            } else {
                isLeft = true;

                if (tree[i] != null) {
                    node.right = new TreeNode(tree[i]);
                    queue.add(node.right);
                }

                queue.remove();
            }
        }

        return root;
    }

    public static boolean isTwoTreesSame(TreeNode tree1, TreeNode tree2) {
        return inOrderTraversal(tree1, tree2);
    }

    private static boolean inOrderTraversal(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }

        if (tree1 == null || tree2 == null) {
            return false;
        }

        if (!inOrderTraversal(tree1.left, tree2.left)) {
            return false;
        }

        if (tree1.val != tree2.val) {
            return false;
        }

        if (!inOrderTraversal(tree1.right, tree2.right)) {
            return false;
        }

        return true;
    }
}
