package easy;

import util.TreeNode;

/**
 * 2018.5.9 Question 235. Lowest Common Ancestor of a Binary Search Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
 *
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the
 * BST.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two
 * nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node
 * to be a descendant of itself).”
 * Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]
 *
 * Solution
 * 1. compare root with p and q
 * 2. root > p, > q, check root.left
 * 3. root < p, < q, check root.right
 */
public class Q235LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
