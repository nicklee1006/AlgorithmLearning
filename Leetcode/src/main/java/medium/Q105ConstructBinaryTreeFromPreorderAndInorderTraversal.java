package medium;

import util.TreeNode;

import java.util.*;

public class Q105ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        // map of value -> index in inorder array, for fast access
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return getTree(preorder, 0, preorder.length,
                inorder, 0, inorder.length, map);
    }

    private static TreeNode getTree(int[] preOrder, int preOrderStart, int preOrderEnd,
                                    int[] inOrder, int inOrderStart, int inOrderEnd,
                                    Map<Integer, Integer> map) {
        if (preOrderStart == preOrderEnd) {
            return null;
        }

        // get root node value from preOrder
        int rootVal = preOrder[preOrderStart];
        // find the index of root node in inorder
        int rootIndex = map.get(rootVal);

        // number of nodes in left tree
        int leftNumber = rootIndex - inOrderStart;

        TreeNode node = new TreeNode(rootVal);

        // recursively construct left tree
        node.left = getTree(preOrder, preOrderStart + 1, preOrderStart + leftNumber + 1,
                inOrder, inOrderStart, rootIndex, map);

        // construct right tree
        node.right = getTree(preOrder, preOrderStart + leftNumber + 1, preOrderEnd,
                inOrder, rootIndex + 1, inOrderEnd, map);

        return node;
    }
}
