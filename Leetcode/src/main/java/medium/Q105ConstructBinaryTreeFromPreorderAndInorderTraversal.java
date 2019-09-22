package medium;

import util.TreeNode;

import java.util.*;

public class Q105ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
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

        int rootVal = preOrder[preOrderStart];
        int rootIndex = map.get(rootVal);

        int leftNumber = rootIndex - inOrderStart;

        TreeNode node = new TreeNode(rootVal);

        node.left = getTree(preOrder, preOrderStart + 1, preOrderStart + leftNumber + 1,
                inOrder, inOrderStart, rootIndex, map);

        node.right = getTree(preOrder, preOrderStart + leftNumber + 1, preOrderEnd,
                inOrder, rootIndex + 1, inOrderEnd, map);

        return node;
    }
}
