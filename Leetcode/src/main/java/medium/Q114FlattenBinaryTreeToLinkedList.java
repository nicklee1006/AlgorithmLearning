package medium;

import java.util.LinkedList;
import java.util.Queue;

import util.TreeNode;

public class Q114FlattenBinaryTreeToLinkedList {
    public static void flatten(TreeNode root) {
        Queue<Integer> preOrder = new LinkedList<>();

        // get the preorder list of the tree
        preOrder(root, preOrder);

        TreeNode current = root;
        preOrder.poll();

        while (!preOrder.isEmpty()) {
            TreeNode newNode = new TreeNode(preOrder.poll());

            current.left = null;
            current.right = newNode;

            current = newNode;
        }
    }

    private static void preOrder(TreeNode root, Queue<Integer> preOrder) {
        if (root == null) {
            return;
        }

        preOrder.offer(root.val);
        preOrder(root.left, preOrder);
        preOrder(root.right, preOrder);
    }
}
