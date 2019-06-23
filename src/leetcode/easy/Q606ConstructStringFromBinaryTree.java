package leetcode.easy;

import leetcode.util.TreeNode;

/**
 * 2018.6.18 Question 606. Construct String from Binary Tree
 * https://leetcode.com/problems/construct-string-from-binary-tree/description/
 *
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder
 * traversing way.
 *
 * The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty
 * parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original
 * binary tree.
 *
 * Solution
 * 1.
 */
public class Q606ConstructStringFromBinaryTree {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }

        String result = t.val + "";

        String left = tree2str(t.left);
        String right = tree2str(t.right);

        if (left.equals("") && right.equals("")) {
            return result;
        } else if (left.equals("")) {
            return result + "()" + "(" + right + ")";
        } else if (right.equals("")) {
            return result + "(" + left + ")";
        }

        return result + "(" + left + ")" + "(" + right + ")";
    }
}
