package medium;

import util.TreeNode;

public class Q222CountCompleteTreeNodes {
    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
