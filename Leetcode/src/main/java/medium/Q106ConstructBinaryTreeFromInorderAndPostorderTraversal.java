package medium;

import util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Q106ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        // value -> index map of inorder to have fast access
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return getTree(postorder, 0, postorder.length,
                inorder, 0, inorder.length, map);
    }

    private static TreeNode getTree(int[] postOrder, int postOrderStart, int postOrderEnd,
                                    int[] inOrder, int inOrderStart, int inOrderEnd,
                                    Map<Integer, Integer> map) {
        if (postOrderStart == postOrderEnd) {
            return null;
        }

        // get root from postorder (last one)
        int rootVal = postOrder[postOrderEnd - 1];
        // get index of root node from inorder
        int rootIndex = map.get(rootVal);

        // number of nodes in left tree
        int leftTreeSize = rootIndex - inOrderStart;

        TreeNode root = new TreeNode(rootVal);

        root.left = getTree(postOrder, postOrderStart, postOrderStart + leftTreeSize,
                inOrder, inOrderStart, rootIndex, map);
        root.right = getTree(postOrder, postOrderStart + leftTreeSize, postOrderEnd - 1,
                inOrder, rootIndex + 1, inOrderEnd, map);

        return root;
    }
}
