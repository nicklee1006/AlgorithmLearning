import util.TreeNode;

/**
 * 2018.6.10 Question 538. Convert BST to Greater Tree
 * https://leetcode.com/problems/convert-bst-to-greater-tree/description/
 *
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original
 * BST is changed to the original key plus sum of all keys greater than the original key in BST.
 */
public class Q538ConvertBSTToGreaterTree {
    static int sum = 0;

    public static TreeNode convertBST(TreeNode root) {
        convert(root);

        return root;
    }

    private static void convert(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        convert(treeNode.right);

        treeNode.val += sum;
        sum = treeNode.val;

        convert(treeNode.left);
    }
}
