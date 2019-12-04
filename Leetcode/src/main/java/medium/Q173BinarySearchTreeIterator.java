package medium;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Q173BinarySearchTreeIterator {
    Queue<Integer> queue = new LinkedList<>();

    public Q173BinarySearchTreeIterator(TreeNode root) {
        // construct the inorder traversal order
        inorderTraversal(root);
    }

    private void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        queue.offer(root.val);
        inorderTraversal(root.right);
    }

    /**
     * comment.
     * @return the next smallest number
     */
    public int next() {
        return queue.poll();
    }

    /**
     * comment.
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
