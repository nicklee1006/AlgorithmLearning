package medium;

import util.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q117PopulatingNextRightPointersInEachNodeII {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int size = queue.size();

        while (!queue.isEmpty()) {
            List<Node> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                temp.add(node);
            }

            // linkup
            for (int i = 0; i < temp.size() - 1; i++) {
                temp.get(i).next = temp.get(i + 1);
            }

            size = queue.size();
        }

        return root;
    }
}
