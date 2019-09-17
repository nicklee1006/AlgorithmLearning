package testutil;

import com.sun.org.apache.bcel.internal.generic.IFLE;
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
}
