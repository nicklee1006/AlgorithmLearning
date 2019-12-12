package medium;

import java.util.*;

import util.TreeNode;

public class Q199BinaryTreeRightSideView {
    public static List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> results = new ArrayList<>();

        // bfs queue
        Queue<TreeNode> bfsQueue = new LinkedList<>();
        bfsQueue.add(root);

        int levelBreath = 1;

        while (!bfsQueue.isEmpty()) {
            for (int i = 0; i < levelBreath; i++) {
                TreeNode node = bfsQueue.poll();

                // add in node to next level
                if (node.left != null) {
                    bfsQueue.offer(node.left);
                }

                if (node.right != null) {
                    bfsQueue.offer(node.right);
                }

                // right most node in the level
                if (i == (levelBreath - 1)) {
                    results.add(node.val);
                }
            }

            levelBreath = bfsQueue.size();
        }

        return results;
    }
}
