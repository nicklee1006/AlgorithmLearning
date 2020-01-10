package easy;

import util.TreeNode;

import java.util.*;

/**
 * 2018.4.6 Symmetric Tree
 * https://leetcode.com/problems/symmetric-tree/description/
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * Solution
 * 1. Similar to Q100
 * 2. if all null, true
 * 3. if only one null, false
 */
public class Q101SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> leftTree = new LinkedList<>();
        Queue<TreeNode> rightTree = new LinkedList<>();

        leftTree.offer(root.left);
        rightTree.offer(root.right);

        while (!leftTree.isEmpty() && !rightTree.isEmpty()) {
            TreeNode currentLeft = leftTree.poll();
            TreeNode currentRight = rightTree.poll();

            // one of the node is not empty
            if ((currentLeft == null && currentRight != null) || (currentLeft != null && currentRight == null)) {
                return false;
            }

            if (currentLeft != null && currentRight != null) {
                if (currentLeft.val != currentRight.val) {
                    return false;
                }

                // enqueue left first
                leftTree.offer(currentLeft.left);
                leftTree.offer(currentLeft.right);

                // enqueue right first
                rightTree.offer(currentRight.right);
                rightTree.offer(currentRight.left);
            }
        }

        return leftTree.isEmpty() && rightTree.isEmpty();
    }

//    public static boolean isSymmetric(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//
//        return isSymmetric(root.left, root.right);
//    }
//
//    private static boolean isSymmetric(TreeNode left, TreeNode right) {
//        if (left == null && right == null) {
//            return true;
//        }
//
//        if (left == null || right == null || left.val != right.val) {
//            return false;
//        }
//
//        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
//    }
}
