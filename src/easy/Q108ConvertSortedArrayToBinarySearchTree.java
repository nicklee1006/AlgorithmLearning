package easy;

import util.TreeNode;

/**
 * 2018.4.9 Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the
 * two subtrees of every node never differ by more than 1.
 *
 * Solution
 * 1. Keep finding the middle point of array
 */
public class Q108ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        return findMiddle(nums, 0, nums.length - 1);
    }

    private TreeNode findMiddle(int[] num, int lowIndex, int highIndex) {
        if (lowIndex > highIndex) {
            return null;
        }

        int middleIndex = (lowIndex + highIndex)/2;

        TreeNode tempRoot = new TreeNode(num[middleIndex]);

        tempRoot.left = findMiddle(num, lowIndex, middleIndex - 1);
        tempRoot.right = findMiddle(num, middleIndex + 1, highIndex);

        return tempRoot;
    }
}
