package leetcode.easy;

/**
 * 2018.3.26 Question 53: Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the
 * largest sum and return its sum.
 *
 * Solution
 * 1. scan from left to right, keep add to the sum, until sum < 0, reset the sum.
 */
public class Q53MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int previousSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (previousSum < 0) {
                previousSum = nums[i];
            } else {
                previousSum += nums[i];
            }

            if (previousSum > currentMax) {
                currentMax = previousSum;
            }
        }

        return currentMax;
    }
}
