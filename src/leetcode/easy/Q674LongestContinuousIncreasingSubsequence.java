package leetcode.easy;

/**
 * 2018.6.26 Question 674. Longest Continuous Increasing Subsequence
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
 *
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence
 * (subarray).
 *
 * Solution
 * 1. keep record of the longest one
 */
public class Q674LongestContinuousIncreasingSubsequence {
    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int result = 1;
        int max = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                result++;
                max = Math.max(max, result);
            } else {
                result = 1;
            }
        }

        return max;
    }
}
