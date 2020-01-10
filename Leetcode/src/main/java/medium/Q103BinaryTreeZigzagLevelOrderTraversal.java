package medium;

import util.TreeNode;

import java.util.*;

public class Q103BinaryTreeZigzagLevelOrderTraversal {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();

        if (root == null) {
            return results;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int size = queue.size();
        // flag to indicate if need to reverse
        boolean reverse = false;

        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();

            // size is the number of node in this level
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                temp.add(node.val);
            }

            // if need reverse or not
            if (reverse) {
                Collections.reverse(temp);
                reverse = false;
            } else {
                reverse = true;
            }

            results.add(temp);
            size = queue.size();
        }

        return results;
    }
}
