package leetcode.easy;

/**
 * 2018.7.4 Question 724. Find Pivot Index
 * https://leetcode.com/problems/find-pivot-index/description/
 *
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 *
 * We define the pivot index as the index where the sum of the numbers to the left of the index is
 * equal to the sum of the numbers to the right of the index.
 *
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should
 * return the left-most pivot index.
 *
 * Solution
 * 1. get the sum of total
 * 2. loop through array, add to left and substract from right
 */
public class Q724FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        int sum = 0;
        for (int temp : nums) {
            sum += temp;
        }

        int left = 0;
        int right = sum - nums[0];

        if (right == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            left += nums[i - 1];
            right -= nums[i];

            if (left == right) {
                return i;
            }
        }

        return -1;
    }
}
